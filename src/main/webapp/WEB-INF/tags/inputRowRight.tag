<%@include file="tagIncludes.jsp"%>

<%@ attribute rtexprvalue="true" name="path" required="true" type="java.lang.String"%>
<%@ attribute rtexprvalue="true" name="placeHolder" required="false" type="java.lang.String"%>

<div class="rowRight">
	<form:input path="${path}" placeholder="${placeHolder}"/>
	<form:errors path="${path}" cssClass="error" />
</div>
<hr/>