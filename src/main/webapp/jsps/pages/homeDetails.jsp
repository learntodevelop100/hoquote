<%@include file="../includes/taglib.jsp"%>

<div class="contentRow">
	<div>
		<label>Type of Home</label>
	</div>
	<div>
		<form:select path="typeOfHome">
			<form:option value="">-Select-</form:option>
			<form:option value="1">One Family</form:option>
			<form:option value="2">Multiple Families</form:option>
		</form:select>
		<form:errors path="typeOfHome" cssClass="leftError" />
	</div>
	<hr />
</div>
<div class="contentRow">
	<div>
		<label>Style of Home</label>
	</div>
	<div>
		<form:select path="styleOfHome">
			<form:option value="">-Select-</form:option>
			<form:option value="1">1 Story</form:option>
			<form:option value="2">2 Story</form:option>
			<form:option value="3">3 Story</form:option>
			<form:option value="4">3+ Story</form:option>
		</form:select>
		<form:errors path="styleOfHome" cssClass="leftError" />
	</div>
	<hr />
</div>
<div class="contentRow">
	<div>
		<label>Year Current Roof Installed</label>
	</div>
	<div>
		<form:select path="yearRoofInstalled">
			<form:option value="">-Select-</form:option>
			<form:option value="2015">2015</form:option>
			<form:option value="2014">2014</form:option>
			<form:option value="2013">2013</form:option>
			<form:option value="2012">2012</form:option>
			<form:option value="2011">2011</form:option>
		</form:select>
		<form:errors path="yearRoofInstalled" cssClass="leftError" />
	</div>
	<hr />
</div>
<div class="contentRow">
	<div>
		<label>Primary Roof Material</label>
	</div>
	<div>
		<form:select path="roofMaterial">
			<form:option value="">-Select-</form:option>
			<form:option value="1">Tar and Gravel</form:option>
			<form:option value="2">Hall Proof</form:option>
			<form:option value="3">Mission Tile</form:option>
			<form:option value="4">Rubber</form:option>
			<form:option value="5">Slate</form:option>
		</form:select>
		<form:errors path="roofMaterial" cssClass="leftError" />
	</div>
	<hr />
</div>
<div class="contentRow">
	<div>
		<label>Square Feet of the Home</label>
	</div>
	<div>
		<form:select path="sqftOfHome">
			<form:option value="">-Select-</form:option>
			<form:option value="1">Less than 1000</form:option>
			<form:option value="2">Between 1001 and 2000</form:option>
			<form:option value="3">Between 2001 and 3000</form:option>
			<form:option value="4">Between 3001 and 5000</form:option>
			<form:option value="5">5000 and above</form:option>
		</form:select>
		<form:errors path="sqftOfHome" cssClass="leftError" />
	</div>
	<hr />
</div>
