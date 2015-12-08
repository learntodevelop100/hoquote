package tcs.bits.hackathon.hoquote.controller;

import org.springframework.beans.factory.annotation.Autowired;

import tcs.bits.hackathon.hoquote.bean.HOQAbstractBean;
import tcs.bits.hackathon.hoquote.bean.HOQSessionBean;

public abstract class HOQAbstractController <T extends HOQAbstractBean> {
	
	@Autowired
	protected HOQSessionBean sessionBean;
	
}
