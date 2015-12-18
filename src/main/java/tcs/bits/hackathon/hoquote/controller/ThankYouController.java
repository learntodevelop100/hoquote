package tcs.bits.hackathon.hoquote.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tcs.bits.hackathon.hoquote.bean.PaymentPO;
import tcs.bits.hackathon.hoquote.bean.PropertyDetailsPO;
import tcs.bits.hackathon.hoquote.constants.HOQConstants;
import tcs.bits.hackathon.hoquote.constants.NavigationConstants;

@Controller
@RequestMapping(NavigationConstants.THANK_YOU)
public class ThankYouController extends HOQAbstractController<PropertyDetailsPO> {

	@Override
	protected String getPageName() {
		return HOQConstants.THANK_YOU;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String onLoad(Model model) {
		PaymentPO paymentPO = new PaymentPO();
		model.addAttribute(HOQConstants.SCREEN_PO, paymentPO);
		return NavigationConstants.THANK_YOU_SCREEN;
	}
}
