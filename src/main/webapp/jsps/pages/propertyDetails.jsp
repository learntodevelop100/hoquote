<%@include file="../includes/taglib.jsp"%>

<div class="pageContent">
	<h4 class="pageHeading">Property Details</h4>
	<div class="contentRow">
		<hoq:rowLeft label="When would you like your home oplicy to begin?" />
		<div class="rowRight">
			<form:input path="effectiveDate" cssClass="date" placeholder="MM/DD/YYYY" size="10"/>
			<form:errors path="effectiveDate" cssClass="error" />
		</div>
		<hr />
	</div>
	<div class="contentRow">
		<div>
			<label>Will your policy premium be included in your mortgage payment?</label>
		</div>
		<div>
			<form:radiobutton path="mortgagePayment" value="Yes" label="Yes" />
			<form:radiobutton path="mortgagePayment" value="No" label="No" />
			<form:errors path="mortgagePayment" cssClass="leftError" />
		</div>
		<hr />
	</div>
	<div class="contentRow">
		<div>
			<label>Home purchase year</label>
		</div>
		<div>
			<form:select path="yearOfPurchase">
				<form:option value="">-Select-</form:option>
				<form:option value="2015">2015</form:option>
				<form:option value="2014">2014</form:option>
				<form:option value="2013">2013</form:option>
				<form:option value="2012">2012</form:option>
				<form:option value="2011">2011</form:option>
			</form:select>
			<form:errors path="yearOfPurchase" cssClass="leftError" />
		</div>
		<hr />
	</div>
	<div class="contentRow">
		<div>
			<label>Approximate Year built</label>
		</div>
		<div>
			<form:select path="yearBuilt">
				<form:option value="">-Select-</form:option>
				<form:option value="2015">2015</form:option>
				<form:option value="2014">2014</form:option>
				<form:option value="2013">2013</form:option>
				<form:option value="2012">2012</form:option>
				<form:option value="2011">2011</form:option>
			</form:select>
			<form:errors path="yearBuilt" cssClass="leftError" />
		</div>
		<hr />
	</div>
	<div class="contentRow">
		<div>
			<label>How would you describe this home?</label>
		</div>
		<div>
			<form:select path="homeDescription">
				<form:option value="">-Select-</form:option>
				<form:option value="1">Primary Home</form:option>
				<form:option value="2">Secondary Home</form:option>
			</form:select>
			<form:errors path="homeDescription" cssClass="leftError" />
		</div>
		<hr />
	</div>
	<div class="contentRow">
		<div>
			<label>How many people are living in this home?</label>
		</div>
		<div>
			<form:select path="noOfPeople">
				<form:option value="">-Select-</form:option>
				<form:option value="1">1</form:option>
				<form:option value="2">2</form:option>
				<form:option value="3">3</form:option>
				<form:option value="4">4</form:option>
				<form:option value="5">5</form:option>
				<form:option value="6">6</form:option>
				<form:option value="7">7 and above</form:option>
			</form:select>
			<form:errors path="noOfPeople" cssClass="leftError" />
		</div>
		<hr />
	</div>
	<div class="contentRow">
		<div>
			<label>Number over age 18</label>
		</div>
		<div>
			<form:select path="nonJuvenile">
				<form:option value="">-Select-</form:option>
				<form:option value="0">None</form:option>
				<form:option value="1">1</form:option>
				<form:option value="2">2</form:option>
				<form:option value="3">3</form:option>
				<form:option value="4">4</form:option>
				<form:option value="5">5</form:option>
				<form:option value="6">6</form:option>
				<form:option value="7">7 and above</form:option>
			</form:select>
			<form:errors path="nonJuvenile" cssClass="leftError" />
		</div>
		<hr />
	</div>
	<div class="contentRow">
		<div>
			<label>Number of Smokers</label>
		</div>
		<div>
			<form:select path="noOfSmokers">
				<form:option value="">-Select-</form:option>
				<form:option value="0">None</form:option>
				<form:option value="1">1</form:option>
				<form:option value="2">2</form:option>
				<form:option value="3">3</form:option>
				<form:option value="4">4</form:option>
				<form:option value="5">5</form:option>
				<form:option value="6">6</form:option>
				<form:option value="7">7 and above</form:option>
			</form:select>
			<form:errors path="noOfSmokers" cssClass="leftError" />
		</div>
		<hr />
	</div>
		<div class="contentRow">
		<div>
			<label>Are there any dogs in your home?</label>
		</div>
		<div>
			<form:radiobutton path="petIndicator" value="Yes" label="Yes" />
			<form:radiobutton path="petIndicator" value="No" label="No" />
			<form:errors path="petIndicator" cssClass="leftError" />
		</div>
		<hr />
	</div>
	<jsp:include page="homeDetails.jsp"/>
</div>

