package tcs.bits.hackathon.hoquote.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.gson.Gson;

import tcs.bits.hackathon.hoquote.bean.HOQAbstractBean;
import tcs.bits.hackathon.hoquote.bean.HOQSessionBean;
import tcs.bits.hackathon.hoquote.constants.NavigationConstants;
import tcs.bits.hackathon.hoquote.event.EventImpl;

public abstract class HOQAbstractController <T extends HOQAbstractBean> {
	
	@Autowired
	protected HOQSessionBean sessionBean;
	
	@Autowired
	protected Gson gson; 
	
	@Autowired
	protected EventImpl eventImpl;
	
	protected abstract String getPageName();
	
	protected String getJsonObject(T screenPO) {
		String jsonFormat = gson.toJson(screenPO);
		Logger logger = LoggerFactory.getLogger(this.getClass());
		logger.info(jsonFormat);
		return jsonFormat;
	}
	
	protected String getRequestId() {
		return eventImpl.generateUUID();
	}
	
	protected void sendEvent(T screenPO) {
		getJsonObject(screenPO);
		//eventImpl.putPropertyEvent(getJsonObject(screenPO));
	}
	
	protected void buildEventHeaders(T screenPO, String eventName)  {
		screenPO.setReqId(sessionBean.getRequestId());
		screenPO.setEvtNm(eventName);
		screenPO.setZipCode(sessionBean.getZipCode());
		screenPO.setPageName(getPageName());
		String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSSSSSSS").format(new Date());
		screenPO.setTS(timeStamp);

	}
	
	@RequestMapping(method = RequestMethod.POST, params="closeEvent")
	public final String onExit(Model model, @ModelAttribute("screenPO") T screenPO,HttpServletRequest request) {
		buildEventHeaders(screenPO, "EQ");
		sendEvent(screenPO);
		request.getSession().invalidate();
		return NavigationConstants.REDIRECT_PERSONAL_INFORMATION;
	}
	
}