package tcs.bits.hackathon.hoquote.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tcs.bits.hackathon.hoquote.bean.ClaimOrLossPO;
import tcs.bits.hackathon.hoquote.constants.HOQConstants;
import tcs.bits.hackathon.hoquote.constants.NavigationConstants;

@Controller
@RequestMapping(NavigationConstants.CLAIM_LOSS)
public class ClaimOrLossController extends HOQAbstractController<ClaimOrLossPO> {

	@Override
	protected String getPageName() {
		return HOQConstants.CLAIM_OR_LOSS;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String onLoad(Model model) {
		ClaimOrLossPO claimOrLossPO = new ClaimOrLossPO();
		model.addAttribute(HOQConstants.SCREEN_PO, claimOrLossPO);
		return NavigationConstants.CLAIM_LOSS_SCREEN;
	}

	@RequestMapping(method = RequestMethod.POST)
	public String onContinue(Model model, @Valid @ModelAttribute(HOQConstants.SCREEN_PO) ClaimOrLossPO claimOrLossPO,
			BindingResult result) {
		copyValues(claimOrLossPO);
		if (result.hasErrors()) {
			return NavigationConstants.CLAIM_LOSS_SCREEN;
		}
		return NavigationConstants.REDIRECT_PROPERTY_DETAILS;
	}

}
