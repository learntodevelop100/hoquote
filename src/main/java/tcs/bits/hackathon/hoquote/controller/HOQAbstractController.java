package tcs.bits.hackathon.hoquote.controller;

import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.gson.Gson;

import tcs.bits.hackathon.hoquote.bean.HOQAbstractBean;
import tcs.bits.hackathon.hoquote.bean.HOQSessionBean;
import tcs.bits.hackathon.hoquote.constants.HOQConstants;
import tcs.bits.hackathon.hoquote.event.EventImpl;

public abstract class HOQAbstractController <T extends HOQAbstractBean> {
	
	@Autowired
	protected HOQSessionBean sessionBean;
	
	@Autowired
	protected Gson gson; 
	
	@Autowired
	protected EventImpl eventImpl;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	protected abstract String getPageName();
	
	protected String getJsonObject(String message) {
		HOQSessionBean bean = new HOQSessionBean();
		try {
			BeanUtils.copyProperties(bean, sessionBean);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		String jsonFormat = gson.toJson(bean);
		
		logger.info(message + jsonFormat);
		return jsonFormat;
	}
	
	protected String getRequestId() {
		return eventImpl.generateUUID();
	}
	
	protected void sendEvent(String eventName) {
		buildEventHeaders(eventName);
		getJsonObject(HOQConstants.SEND_EVENT_INITIATED);
		//eventImpl.putPropertyEvent(getJsonObject(HOQConstants.EVENT_INITIATED));
	}
	
	protected void copyValues(T screenPO) {
		try {
			BeanUtils.copyProperties(sessionBean, screenPO);
			getJsonObject(HOQConstants.BEAN_COPY_SUCCESSFUL);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	
	private void buildEventHeaders(String eventName)  {
		sessionBean.setEvtNm(eventName);
		sessionBean.setPageName(getPageName());
		String timeStamp = new SimpleDateFormat(HOQConstants.TIMESTAMP_FORMAT).format(new Date());
		sessionBean.setTS(timeStamp);
	}
	
	@RequestMapping(method = RequestMethod.POST, params="closeEvent")
	public final void onExit(Model model, HttpServletRequest request) {
		sendEvent(HOQConstants.EXIT_EVENT);
		request.getSession().invalidate();
	}
}