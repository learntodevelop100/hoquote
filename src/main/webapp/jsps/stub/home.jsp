<%@ include file="../includes/taglib.jsp"%>
<html>
	<head>
	<meta charset="utf-8">
	<title>Stub Page to Launch HOQ Application</title>
	<link rel="stylesheet" href="stylesheet/bootstrap.css"/>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
	<script type="text/javascript">
		$("form[name='stubForm']").submit();
	</script>
	</head>
	<body>
		<form id="stubFormId" name="stubForm" action="personalInformation" method="get">
			<h3>Stub Page to Launch HOQ Application</h3>
			<br/>
			<div>
				<label>Select State: </label> <select name="state">
					<option value="">-Select-</option>
					<option value="IL">Illinois</option>
					<option value="OK">Oklahoma</option>
					<option value="MI">Michigan</option>
				</select>
			</div>
			<br/>
			<div>
				<button>Get A Quote</button>
			</div>
		</form>
	</body>
</html>
