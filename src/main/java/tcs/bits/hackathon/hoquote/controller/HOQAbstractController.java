package tcs.bits.hackathon.hoquote.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.google.gson.Gson;

import tcs.bits.hackathon.hoquote.bean.HOQAbstractBean;
import tcs.bits.hackathon.hoquote.bean.HOQSessionBean;

public abstract class HOQAbstractController <T extends HOQAbstractBean> {
	
	@Autowired
	protected HOQSessionBean sessionBean;
	
	@Autowired
	protected Gson gson; 
	
	public String getJsonObject() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(gson.toJson(sessionBean.getPersonalInforamtionPO()));
		stringBuilder.append(gson.toJson(sessionBean.getCurrentInsurancePO()));
		stringBuilder.append(gson.toJson(sessionBean.getClaimOrLossPO()));
		stringBuilder.append(gson.toJson(sessionBean.getPropertyDetailsPO()));
		return stringBuilder.toString();
	}
	
}