<%@include file="../includes/taglib.jsp"%>

<div class="pageContent">
	<h4 class="pageHeading">Customer Information</h4>
	<div class="contentRow">
		<hoq:rowLeft label="First Name"/>
		<hoq:inputRowRight path="firstName"/>
	</div>
	<div class="contentRow">
		<hoq:rowLeft label="Last Name"/>
		<hoq:inputRowRight path="lastName"/>
	</div>
	<div class="contentRow">
		<hoq:rowLeft label="Date Of Birth"/>
		<hoq:inputRowRight path="dob" placeHolder="MM/DD/YYYY"/>
	</div>	
	<div class="contentRow">
		<hoq:rowLeft label="Street Address"/>
		<hoq:inputRowRight path="streetAddress" />
	</div>
	<div class="contentRow">
		<hoq:rowLeft label="City"/>
		<hoq:inputRowRight path="city" />
	</div>
	<div class="contentRow">
		<hoq:rowLeft label="State"/>
		<hoq:inputRowRight path="state" />
	</div>
	<div class="contentRow">
		<hoq:rowLeft label="Zip Code"/>
		<hoq:inputRowRight path="zipCode" />
	</div>
		<div class="contentRow">
		<hoq:rowLeft label="Email ID"/>
		<hoq:inputRowRight path="email" />
	</div>
		<div class="contentRow">
		<hoq:rowLeft label="Phone No."/>
		<hoq:inputRowRight path="phoneNumber" />
	</div>
</div>    