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
		$("#currentInsuranceDetailsId").hide();
		module()._bindEvents();
	}
	module()._bindEvents = function() {
		$("#currentInsuranceIndicator").change(function() {
			if(this.value == "1") {
				$("#currentInsuranceDetailsId").show();
			}else {
				$("#currentInsuranceDetailsId").hide();
			}
		});
	}
})(function(){return hoq.currentInsurance;},jQuery);