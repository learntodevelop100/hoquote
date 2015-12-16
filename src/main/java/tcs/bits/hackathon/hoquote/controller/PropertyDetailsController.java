package tcs.bits.hackathon.hoquote.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tcs.bits.hackathon.hoquote.bean.PropertyDetailsPO;
import tcs.bits.hackathon.hoquote.constants.NavigationConstants;

@Controller
@RequestMapping(NavigationConstants.PROPERTY_DETAILS)
public class PropertyDetailsController extends HOQAbstractController<PropertyDetailsPO> {

	@Override
	protected String getPageName() {
		return "Property Details";
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String onLoad(Model model) {
		PropertyDetailsPO propertyDetailsPO = new PropertyDetailsPO();
		model.addAttribute("screenPO", propertyDetailsPO);
		return NavigationConstants.PROPERTY_DETAILS_SCREEN;
	}

	@RequestMapping(method = RequestMethod.POST)
	public String onContinue(Model model, @Valid @ModelAttribute("screenPO") PropertyDetailsPO propertyDetailsPO,
			BindingResult result) {
		copyValues(propertyDetailsPO);
		if(result.hasErrors()) {
			return NavigationConstants.PROPERTY_DETAILS_SCREEN;
		}
		sendEvent("CQ");
		return NavigationConstants.PROPERTY_DETAILS_SCREEN;
	}

}
