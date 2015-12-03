<%@include file="../includes/taglib.jsp" %>

<div class="pageContent">
	<h4 class="pageHeading">Customer Information</h4>
	<div class="contentRow">
		<div class="rowLeft">
			<label>First Name</label>
		</div>
		<div class="rowRight">
			<form:input path="firstName"/>
		</div>
		<hr/>
	</div>
	<div class="contentRow">
		<div class="rowLeft">
			<label>Last Name</label>
		</div>
		<div class="rowRight">
			<form:input path="lastName"/>
		</div>
		<hr/>
	</div>
	<div class="contentRow">
		<div class="rowLeft">
			<label>Date of Birth</label>
		</div>
		<div class="rowRight">
			<form:input path="dob"/>
		</div>
		<hr/>
	</div>	
	<div class="contentRow">
		<div class="rowLeft">
			<label>Street Address</label>
		</div>
		<div class="rowRight">
			<form:input path="streetAddress"/>
		</div>
		<hr/>
	</div>
	<div class="contentRow">
		<div class="rowLeft">
			<label>City</label>
		</div>
		<div class="rowRight">
			<form:input path="city"/>
		</div>
		<hr/>
	</div>
	<div class="contentRow">
		<div class="rowLeft">
			<label>State</label>
		</div>
		<div class="rowRight">
			<form:input path="state"/>
		</div>
		<hr/>
	</div>
	<div class="contentRow">
		<div class="rowLeft">
			<label>Zip Code</label>
		</div>
		<div class="rowRight">
			<form:input path="zipCode"/>
		</div>
		<hr/>
	</div>
</div>    
		
