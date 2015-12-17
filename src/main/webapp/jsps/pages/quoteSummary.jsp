<%@include file="../includes/taglib.jsp"%>
<div class="pageContent">
	<h4 class="pageHeading">Quote Summary</h4>
	<div class="contentRow">
		<hr class="coverageRuler" />
		<a href="#" class="coverageHeader" data-toggle="collapse" data-target="#dwellingId">Dwelling</a> <span
			class="spanRight">${screenPO.dwelling}</span>
		<div id="dwellingId" class="coverageDesc collapse">This is an estimated Dwelling Coverage Limit.</div>
	</div>
	<div class="contentRow">
		<hr class="coverageRuler" />
		<a href="#" class="coverageHeader" data-toggle="collapse" data-target="#otherStructuresId">Other Structures</a> <span
			class="spanRight">${screenPO.otherStructures}</span>
		<div id="otherStructuresId" class="coverageDesc collapse">Your policy automatically includes a coverage limit
			equal to 10% of your Dwelling Coverage Limit.</div>
	</div>
	<div class="contentRow">
		<hr class="coverageRuler" />
		<a href="#" class="coverageHeader" data-toggle="collapse" data-target="#personalPropertyCovId">Personal Property</a> <span
			class="spanRight">${screenPO.personalPropertyCov}</span>
		<div id="personalPropertyCovId" class="coverageDesc collapse">Your policy automatically includes a Personal
			Property Coverage Limit equal to 50% of your Dwelling Coverage Limit.</div>
	</div>
	<div class="contentRow">
		<hr class="coverageRuler" />
		<a href="#" class="coverageHeader" data-toggle="collapse" data-target="#lossOfUseId">Loss of Use</a> <span
			class="spanRight">${screenPO.lossOfUse}</span>
		<div id="lossOfUseId" class="coverageDesc collapse">Your policy automatically includes a coverage limit equal to
			20% of your Dwelling Coverage Limit. Liability.</div>
	</div>
	<div class="contentRow">
		<hr class="coverageRuler" />
		<a href="#" class="coverageHeader" data-toggle="collapse" data-target="#medicalPaymentId">Medical Payments</a> <span
			class="spanRight">${screenPO.medicalPayment}</span>
		<div id="medicalPaymentId" class="coverageDesc collapse">Our standard policy includes $1,000 in Medical Payments
			Coverage.</div>
	</div>
	<div class="contentRow">
		<hr class="coverageRuler" />
		<a href="#" class="coverageHeader" data-toggle="collapse" data-target="#deductibleId">Deductible</a> <span
			class="spanRight">${screenPO.deductible}</span>
		<div id="deductibleId" class="coverageDesc collapse">Standard deductible is $1000.</div>
	</div>
</div>

