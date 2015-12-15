package tcs.bits.hackathon.hoquote.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tcs.bits.hackathon.hoquote.bean.PropertyDetailsPO;
import tcs.bits.hackathon.hoquote.bean.QuoteSummaryPO;
import tcs.bits.hackathon.hoquote.constants.NavigationConstants;

@Controller
@RequestMapping(NavigationConstants.QUOTE_SUMMARY)
public class QuoteSummaryController extends HOQAbstractController<PropertyDetailsPO> {

	QuoteSummaryPO quoteSummaryPO;
	
	@Override
	protected String getPageName() {
		return "Quote Summary";
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String onLoad(Model model) {
		model.addAttribute("screenPO", calculateQuote());
		return NavigationConstants.QUOTE_SUMMARY_SCREEN;
	}

	@RequestMapping(method = RequestMethod.POST)
	public String onContinue(Model model, @Valid @ModelAttribute("screenPO") QuoteSummaryPO quoteSummaryPO,
			BindingResult result) {
		if(result.hasErrors()) {
			return NavigationConstants.QUOTE_SUMMARY_SCREEN;
		}
		return NavigationConstants.REDIRECT_PAYMENT;
	}
	
	private QuoteSummaryPO calculateQuote() {
		QuoteSummaryPO quoteSummaryPO = new QuoteSummaryPO();
		
		return quoteSummaryPO;
		
	}

}
