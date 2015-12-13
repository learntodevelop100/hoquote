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

	@RequestMapping(method = RequestMethod.GET)
	public String onLoad(Model model) {
		CurrentInsurancePO currentInsurancePO = (null != sessionBean.getCurrentInsurancePO())
				? sessionBean.getCurrentInsurancePO() : new CurrentInsurancePO();
		model.addAttribute("screenPO", currentInsurancePO);
		return NavigationConstants.CURRENT_INSURANCE_SCREEN;
	}

	@RequestMapping(method = RequestMethod.POST)
	public String onContinue(Model model, @Valid @ModelAttribute("screenPO") CurrentInsurancePO currentInsurancePO,
			BindingResult result) {
		sessionBean.setCurrentInsurancePO(currentInsurancePO);
		if(result.hasErrors()) {
			return NavigationConstants.CURRENT_INSURANCE_SCREEN;
		}
		if(HOQConstants.YES.equalsIgnoreCase(currentInsurancePO.getClaimOrLossIndicator())) {
			return NavigationConstants.REDIRECT_CLAIM_LOSS;
		}
		return NavigationConstants.REDIRECT_PROPERTY_DETAILS;
	}

}
