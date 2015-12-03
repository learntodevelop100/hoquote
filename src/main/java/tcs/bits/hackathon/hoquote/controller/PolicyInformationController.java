package tcs.bits.hackathon.hoquote.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tcs.bits.hackathon.hoquote.constants.NavigationConstants;

@Controller
@RequestMapping(NavigationConstants.POLICY_INFORMATION)
public class PolicyInformationController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String onLoad(Model model){
		
		return NavigationConstants.POLICY_INFORMATION_SCREEN;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String onContinue(Model model){
		
		return NavigationConstants.POLICY_INFORMATION_SCREEN;
	}

}
