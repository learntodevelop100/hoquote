package tcs.bits.hackathon.hoquote.controller;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tcs.bits.hackathon.hoquote.bean.QuoteSummaryPO;
import tcs.bits.hackathon.hoquote.constants.HOQConstants;
import tcs.bits.hackathon.hoquote.constants.NavigationConstants;

@Controller
@RequestMapping(NavigationConstants.QUOTE_SUMMARY)
public class QuoteSummaryController extends HOQAbstractController<QuoteSummaryPO> {

	QuoteSummaryPO quoteSummaryPO;
	
	String THOUSAND = "1000";
	
	@Override
	protected String getPageName() {
		return HOQConstants.QUOTE_SUMMARY;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String onLoad(Model model) {
		QuoteSummaryPO quoteSummaryPO = calculateQuote();
		copyValues(quoteSummaryPO);
		sendEvent(HOQConstants.CALCULATED_EVENT);
		model.addAttribute(HOQConstants.SCREEN_PO, quoteSummaryPO);
		return NavigationConstants.QUOTE_SUMMARY_SCREEN;
	}

	@RequestMapping(method = RequestMethod.POST)
	public String onContinue(Model model) {
		return NavigationConstants.REDIRECT_PAYMENT;
	}
	
	private QuoteSummaryPO calculateQuote() {
		QuoteSummaryPO quoteSummaryPO = new QuoteSummaryPO();
		double sqft, dwelling, otherStructures, personalPropertyCov, lossOfUse; 
		if (StringUtils.isNotBlank(sessionBean.getSqftOfHome())) {
			sqft = Double.parseDouble(sessionBean.getSqftOfHome());
		} else {
			sqft = 1500;
		}
		dwelling = sqft * 50;
		otherStructures = dwelling * 10/100;
		personalPropertyCov = dwelling * 50/100;
		lossOfUse = dwelling * 20/100;
		quoteSummaryPO.setDwelling(Double.toString(dwelling));
		quoteSummaryPO.setOtherStructures(Double.toString(otherStructures));
		quoteSummaryPO.setPersonalPropertyCov(Double.toString(personalPropertyCov));
		quoteSummaryPO.setLossOfUse(Double.toString(lossOfUse));
		quoteSummaryPO.setMedicalPayment(THOUSAND);
		quoteSummaryPO.setDeductible(THOUSAND);
		return quoteSummaryPO;
	}
}
