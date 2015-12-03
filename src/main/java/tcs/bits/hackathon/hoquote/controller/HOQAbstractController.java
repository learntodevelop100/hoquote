package tcs.bits.hackathon.hoquote.controller;

import javax.servlet.http.HttpServletRequest;

import tcs.bits.hackathon.hoquote.bean.HOQSessionBean;
public abstract class HOQAbstractController {
	public HOQSessionBean getSessionBean(HttpServletRequest request) {
		
		return (null != request.getSession().getAttribute("sessionBean"))
				? (HOQSessionBean) request.getSession().getAttribute("sessionBean") : new HOQSessionBean();
	}
}
