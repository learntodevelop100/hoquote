var hoq = hoq || {};

hoq.navigation = {};

(function(module, $, undefined) {
	var postEnabled = false;
	module().init = function() {
		postEnabled = false;
		module()._bindEvents();
	}
	module()._bindEvents = function() {
		$("#continueButtonId").unbind("click").click(module()._onContinue);
	}
	module()._onContinue = function() {
		postEnabled = true;
		$("form[name='hoqForm']").submit();
	}
	
	window.onbeforeunload = function(e) {
		if (!postEnabled) {
			$.post("", {closeEvent:"closeEvent"});
			return 'All information entered will not be saved';
		}
	};
	
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
			$("[name='claimOrLossIndicator']").prop('checked', false);
		}
	}
})(function(){return hoq.currentInsurance;},jQuery);


hoq.claimOrLoss = {};

(function(module, $, undefined) {
	module().init = function() {
		module()._bindEvents();
	}
	module()._bindEvents = function() {
		$("#lossAmount").blur(function() {
			$(this).formatCurrency({roundToDecimalPlace:-2});
		});
	}
})(function(){return hoq.claimOrLoss;},jQuery);

hoq.quoteSummary = {};

(function(module, $, undefined) {
	module().init = function() {
		module()._bindEvents();
	}
	module()._bindEvents = function() {
		$(".spanRight").formatCurrency({roundToDecimalPlace:-2});
		$(".plan-tier .plan-price").formatCurrency({roundToDecimalPlace:-2, symbol:''});
	}
})(function(){return hoq.quoteSummary;},jQuery);

hoq.payment = {};

(function(module, $, undefined) {
	module().init = function() {
		module()._bindEvents();
	}
	module()._bindEvents = function() {
		$("#continueButtonId").text("Pay Now");
		$("input[name=paymentAmount]").blur(function() {
			$(this).formatCurrency();
		});
		
	}
})(function(){return hoq.payment;},jQuery);

hoq.thankYou = {};

(function(module, $, undefined) {
	module().init = function() {
		module()._bindEvents();
	}
	module()._bindEvents = function() {
		$("#continueButtonId").hide();
	}
})(function(){return hoq.thankYou;},jQuery);