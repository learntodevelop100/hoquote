package tcs.bits.hackathon.hoquote.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tcs.bits.hackathon.hoquote.bean.CurrentInsurancePO;
import tcs.bits.hackathon.hoquote.constants.HOQConstants;
import tcs.bits.hackathon.hoquote.constants.NavigationConstants;

@Controller
@RequestMapping(NavigationConstants.CURRENT_INSURANCE)
public class CurrentInsuranceController extends HOQAbstractController<CurrentInsurancePO> {

	@Override
	protected String getPageName() {
		return HOQConstants.CURRENT_INSURANCE;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String onLoad(Model model) {
		CurrentInsurancePO currentInsurancePO =  new CurrentInsurancePO();
		model.addAttribute(HOQConstants.SCREEN_PO, currentInsurancePO);
		return NavigationConstants.CURRENT_INSURANCE_SCREEN;
	}

	@RequestMapping(method = RequestMethod.POST)
	public String onContinue(Model model, @Valid @ModelAttribute(HOQConstants.SCREEN_PO) CurrentInsurancePO currentInsurancePO,
			BindingResult result) {
		copyValues(currentInsurancePO);
		if(result.hasErrors()) {
			return NavigationConstants.CURRENT_INSURANCE_SCREEN;
		}
		if(HOQConstants.YES.equalsIgnoreCase(currentInsurancePO.getClaimOrLossIndicator())) {
			return NavigationConstants.REDIRECT_CLAIM_LOSS;
		}
		return NavigationConstants.REDIRECT_PROPERTY_DETAILS;
	}

}
