package tcs.bits.hackathon.hoquote.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tcs.bits.hackathon.hoquote.bean.PersonalInforamtionPO;
import tcs.bits.hackathon.hoquote.constants.NavigationConstants;

@Controller
@RequestMapping(NavigationConstants.PERSONAL_INFORMATION)
public class PersonalInformationController extends HOQAbstractController<PersonalInforamtionPO> {

	@RequestMapping(method = RequestMethod.GET)
	public String onLoad(Model model, HttpServletRequest request, HttpServletResponse response) {

		PersonalInforamtionPO personalInforamtionPO = null;
		if (null != sessionBean.getPersonalInforamtionPO()) {
			personalInforamtionPO = sessionBean.getPersonalInforamtionPO();
		} else {
			personalInforamtionPO = new PersonalInforamtionPO();
			personalInforamtionPO.setState(request.getParameter("state"));
		}
		model.addAttribute("screenPO", personalInforamtionPO);
		return NavigationConstants.PERSONAL_INFORMATION_SCREEN;
	}

	@RequestMapping(method = RequestMethod.POST)
	public String onContinue(Model model, @Valid @ModelAttribute("screenPO") PersonalInforamtionPO personalInforamtionPO,
			BindingResult result) {
		if (result.hasErrors()) {
			return NavigationConstants.PERSONAL_INFORMATION_SCREEN;
		}
		sessionBean.setPersonalInforamtionPO(personalInforamtionPO);
		return NavigationConstants.REDIRECT_CURRENT_INSURANCE;
	}

}
