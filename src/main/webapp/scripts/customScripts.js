var hoq = hoq || {};

hoq.navigation = {};
(function(module, $, undefined) {
	module().init = function() {
	}
	
	$("#continueButtonId").unbind("click").click(module()._onContinue);
	module()._onContinue = function() {
		$("form[name='hoqForm']").submit();
	}
})(function(){return hoq.navigation;},jQuery);