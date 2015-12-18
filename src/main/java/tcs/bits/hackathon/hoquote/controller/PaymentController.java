package tcs.bits.hackathon.hoquote.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tcs.bits.hackathon.hoquote.bean.PaymentPO;
import tcs.bits.hackathon.hoquote.constants.HOQConstants;
import tcs.bits.hackathon.hoquote.constants.NavigationConstants;

@Controller
@RequestMapping(NavigationConstants.PAYMENT)
public class PaymentController extends HOQAbstractController<PaymentPO> {
	
	@Override
	protected String getPageName() {
		return HOQConstants.PAYMENT_DETAILS;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String onLoad(Model model) {
		PaymentPO paymentPO = new PaymentPO();
		model.addAttribute(HOQConstants.SCREEN_PO, paymentPO);
		return NavigationConstants.PAYMENT_SCREEN;
	}

	@RequestMapping(method = RequestMethod.POST)
	public String onContinue(Model model, @Valid @ModelAttribute(HOQConstants.SCREEN_PO) PaymentPO paymentPO,
			BindingResult result) {
		if(result.hasErrors()) {
			return NavigationConstants.PAYMENT_SCREEN;
		}
		copyValues(paymentPO);
		return NavigationConstants.REDIRECT_THANK_YOU;
	}

}
