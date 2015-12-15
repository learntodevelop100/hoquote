package tcs.bits.hackathon.hoquote.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tcs.bits.hackathon.hoquote.bean.PaymentPO;
import tcs.bits.hackathon.hoquote.bean.PropertyDetailsPO;
import tcs.bits.hackathon.hoquote.constants.NavigationConstants;

@Controller
@RequestMapping(NavigationConstants.THANK_YOU)
public class ThankYouController extends HOQAbstractController<PropertyDetailsPO> {

	@Override
	protected String getPageName() {
		return "Thank You";
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String onLoad(Model model) {
		PaymentPO paymentPO = (null != sessionBean.getPaymentPO())
				? sessionBean.getPaymentPO() : new PaymentPO();
		model.addAttribute("screenPO", paymentPO);
		return NavigationConstants.THANK_YOU_SCREEN;
	}

/*	@RequestMapping(method = RequestMethod.POST)
	public String onContinue(Model model, @Valid @ModelAttribute("screenPO") PaymentPO paymentPO,
			BindingResult result) {
		if(result.hasErrors()) {
			return NavigationConstants.THANK_YOU_SCREEN;
		}
		Logger logger = LoggerFactory.getLogger(ThankYouController.class);
		logger.info(getJsonObject());
		return NavigationConstants.REDIRECT_THANK_YOU;
	}*/

}
