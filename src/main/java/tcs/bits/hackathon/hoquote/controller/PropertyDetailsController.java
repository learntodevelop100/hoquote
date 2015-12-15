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

import tcs.bits.hackathon.hoquote.bean.PropertyDetailsPO;
import tcs.bits.hackathon.hoquote.constants.NavigationConstants;

@Controller
@RequestMapping(NavigationConstants.PROPERTY_DETAILS)
public class PropertyDetailsController extends HOQAbstractController<PropertyDetailsPO> {

	@RequestMapping(method = RequestMethod.GET)
	public String onLoad(Model model) {
		PropertyDetailsPO propertyDetailsPO = (null != sessionBean.getPropertyDetailsPO())
				? sessionBean.getPropertyDetailsPO() : new PropertyDetailsPO();
		model.addAttribute("screenPO", propertyDetailsPO);
		return NavigationConstants.PROPERTY_DETAILS_SCREEN;
	}

	@RequestMapping(method = RequestMethod.POST)
	public String onContinue(Model model, @Valid @ModelAttribute("screenPO") PropertyDetailsPO propertyDetailsPO,
			BindingResult result) {
		sessionBean.setPropertyDetailsPO(propertyDetailsPO);
		if(result.hasErrors()) {
			return NavigationConstants.PROPERTY_DETAILS_SCREEN;
		}
		Logger logger = LoggerFactory.getLogger(PropertyDetailsController.class);
		logger.info(getJsonObject());
		return NavigationConstants.PROPERTY_DETAILS_SCREEN;
	}

}
