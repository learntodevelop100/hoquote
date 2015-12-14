var hoq = hoq || {};

hoq.navigation = {};
(function(module, $, undefined) {
	module().init = function() {
		module()._bindEvents();
	}
	module()._bindEvents = function() {
		$("#continueButtonId").unbind("click").click(module()._onContinue);
		module()._onContinue = function() {
			$("form[name='hoqForm']").submit();
		}
	}
})(function(){return hoq.navigation;},jQuery);

hoq.currentInsurance = {};
(function(module, $, undefined) {
	module().init = function() {
		module()._hideShow();
		module()._bindEvents();
	}
	module()._bindEvents = function() {
		$("#currentInsuranceIndicator").change(module()._hideShow);
	}
	module()._hideShow = function() {
		if($("#currentInsuranceIndicator").val() == "1") {
			$("#currentInsuranceDetailsId").show();
		}else {
			$("#currentInsuranceDetailsId").hide();
			$("[name='claimOrLossIndicator']").val("")
		}
	}

})(function(){return hoq.currentInsurance;},jQuery);