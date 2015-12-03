<%@include file="tagIncludes.jsp"%>

<%@ attribute rtexprvalue="true" name="path" required="true" type="java.lang.String"%>

<div class="rowRight">
	<form:input path="${path}" />
	<form:errors path="${path}" cssClass="error" />
</div>
<hr/>