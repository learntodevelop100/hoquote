<%@include file="../includes/taglib.jsp" %>

<div class="pageContent">
	<h4 class="pageHeading">Claim or Loss Details</h4>
	<div class="contentRow">
		<div>
			<label>Type of Loss?</label>
		</div>
		<div>
			<form:select path="typeOfLoss">
				<form:option value="">-Select-</form:option>
				<form:option value="1">Theft</form:option>
				<form:option value="2">Flood</form:option>
				<form:option value="3">Vandalism</form:option>
				<form:option value="3">Fire</form:option>
			</form:select>
			<form:errors path="typeOfLoss" cssClass="leftError" />
		</div>
		<hr />
	</div>
	<div class="contentRow">
		<div>
			<label>Approximate Date of Loss</label>
		</div>
		<div>
			<form:select path="yearOfLoss">
				<form:option value="">-Select-</form:option>
				<form:option value="2015">2015</form:option>
				<form:option value="2014">2014</form:option>
				<form:option value="2013">2013</form:option>
				<form:option value="2012">2012</form:option>
				<form:option value="2011">2011</form:option>
			</form:select>
			<form:errors path="yearOfLoss" cssClass="leftError" />
		</div>
		<hr />
	</div>
	<div class="contentRow">
		<hoq:rowLeft label="Total Amount Paid for Loss"/>
		<hoq:inputRowRight path="lossAmount"/>
	</div>
</div>    
		
