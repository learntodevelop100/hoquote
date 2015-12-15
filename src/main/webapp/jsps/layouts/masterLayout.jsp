<!DOCTYPE html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<title><tiles:insertAttribute name="title" ignore="true" /></title>
<link rel="stylesheet" href="stylesheet/customStyles.css">
<link rel="stylesheet" href="stylesheet/navigationBar.css">
<link rel="stylesheet" href="stylesheet/sideBar.css">
<link rel="stylesheet" href="stylesheet/bootstrap.css">
</head>
<body>
	<div id="banner_wrapper">
		<tiles:insertAttribute name="header" />
	</div>
	<div id="navigationBar_wrapper">
		<tiles:insertAttribute name="navigationBar" />
	</div>
	<div id="mainContent_wrapper">
		<form:form id="hoqFormId" name="hoqForm" action="" method="post" commandName="screenPO">
			<c:set var="validationErrors">
				<form:errors path="*" />
			</c:set>
			<c:if test="${not empty validationErrors}"> 
				<div id="pageErrors" class="errorblock">
					Please answer all the required fields to continue.
				</div>
			</c:if>
			<div id="pageAndSideBar_Wrapper">
				<div id="pageContent_Wrapper">
					<tiles:insertAttribute name="content" />
					<div id="navgationButton_Wrapper">
						<div class="navigationButtonRow">
							<button id="continueButtonId">Continue</button>
							<button id="closeButtonId">Close</button>
						</div>
					</div>
				</div>
				<div id="sideBar_wrapper">
					<tiles:insertAttribute name="sideBar" />
				</div>
			</div>
		</form:form>
	</div>
	<div id="footer_wrapper">
		<tiles:insertAttribute name="footer" />
		<tiles:insertAttribute name="page_Footer" ignore="true"/>
	</div>
</body>
</html>