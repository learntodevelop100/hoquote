<%@include file="../includes/taglib.jsp"%>

<div class="pageContent">
	<h4 class="pageHeading">Property Details</h4>
	<div class="contentRow">
		<hoq:rowLeft label="When would you like your home oplicy to begin?"/>
		<div class="rowRight">
			<form:input path="effectiveDate" cssClass="date" />
			<form:errors path="effectiveDate" cssClass="error" />
		</div>
		<hr />
	</div>
</div>

