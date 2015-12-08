<%@include file="../includes/taglib.jsp"%>

<div class="pageContent">
	<h4 class="pageHeading">Current Insurance Details</h4>
	<div class="contentRow">
		<div>
			<label>Do You have Home Insurance at current residence ?</label>
		</div>
		<div>
			<form:select path="priorInsurance">
				<form:option value="1">Yes, with another Insurance Company</form:option>
				<form:option value="2">No, first time Home Buyer or Rener</form:option>
				<form:option value="3">No, do not have insurance</form:option>
			</form:select>
		</div>
	</div>
</div>

