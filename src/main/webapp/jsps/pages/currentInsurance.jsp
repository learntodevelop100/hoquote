<%@include file="../includes/taglib.jsp"%>

<div class="pageContent">
	<h4 class="pageHeading">Current Insurance Information</h4>
	<div class="contentRow">
		<div>
			<label>Do You have Home Insurance at current residence?</label>
		</div>
		<div>
			<form:select path="currentInsuranceIndicator">
				<form:option value="">-Select-</form:option>
				<form:option value="1">Yes, with another Insurance Company</form:option>
				<form:option value="2">No, first time Home Buyer or Renter</form:option>
				<form:option value="3">No, do not have insurance</form:option>
			</form:select>
			<form:errors path="currentInsuranceIndicator" cssClass="leftError" />
		</div>
		<hr />
	</div>
	<div id="currentInsuranceDetailsId" class="hideShow">
		<div class="contentRow">
			<div>
				<label>Who is your current home insurance company?</label>
			</div>
			<div>
				<form:select path="currentInsuranceCompany">
					<form:option value="">-Select-</form:option>
					<form:option value="1">Statefarm Group</form:option>
					<form:option value="2">Geico</form:option>
					<form:option value="3">All State</form:option>
					<form:option value="4">Nationwide</form:option>
					<form:option value="5">USAA</form:option>
					<form:option value="6">Other</form:option>
				</form:select>
				<form:errors path="currentInsuranceCompany" cssClass="leftError" />
			</div>
			<hr />
		</div>
		<div class="contentRow">
			<div>
				<label>When does your current policy expire?</label>
			</div>
			<div>
				<form:select path="currentPolicyExpiration">
					<form:option value="">-Select-</form:option>
					<form:option value="1">Tomorrow</form:option>
					<form:option value="2">In 2 to 30 days</form:option>
					<form:option value="3">31+ days</form:option>
				</form:select>
				<form:errors path="currentPolicyExpiration" cssClass="leftError" />
			</div>
			<hr />
		</div>
		<div class="contentRow">
			<div>
				<label>During the last five years, have you had a claim or loss at any residence?</label>
			</div>
			<div>
				<form:radiobutton path="claimOrLossIndicator" value="Yes" label="Yes" />
				<form:radiobutton path="claimOrLossIndicator" value="No" label="No" />
				<form:errors path="claimOrLossIndicator" cssClass="leftError" />
			</div>
			<hr />
		</div>
	</div>
</div>

