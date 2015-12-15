package tcs.bits.hackathon.hoquote.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tcs.bits.hackathon.hoquote.bean.ClaimOrLossPO;
import tcs.bits.hackathon.hoquote.constants.NavigationConstants;

@Controller
@RequestMapping(NavigationConstants.CLAIM_LOSS)
public class ClaimOrLossController extends HOQAbstractController<ClaimOrLossPO> {

	@RequestMapping(method = RequestMethod.GET)
	public String onLoad(Model model) {
		ClaimOrLossPO claimOrLossPO = (null != sessionBean.getClaimOrLossPO())
				? sessionBean.getClaimOrLossPO() : new ClaimOrLossPO();
		model.addAttribute("screenPO", claimOrLossPO);
		return NavigationConstants.CLAIM_LOSS_SCREEN;
	}

	@RequestMapping(method = RequestMethod.POST)
	public String onContinue(Model model, @Valid @ModelAttribute("screenPO") ClaimOrLossPO claimOrLossPO,
			BindingResult result) {
		sessionBean.setClaimOrLossPO(claimOrLossPO);
		if(result.hasErrors()) {
			return NavigationConstants.CLAIM_LOSS_SCREEN;
		}
		Logger logger = LoggerFactory.getLogger(ClaimOrLossController.class);
		logger.info(getJsonObject());
		return NavigationConstants.REDIRECT_PROPERTY_DETAILS;
	}

}
