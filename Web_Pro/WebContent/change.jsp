<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<link rel="stylesheet" type="text/css" href="bootstrap.min.css">
<script type="text/javascript" src="bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="banner.jsp" />

	<form class="form-horizontal" action="user.quiz">
		<div class="container" style="margin-top: 100px">

			<h1 align=center>Change Password</h1>
			<hr>
			<div class="form-group">
				<label class="control-label col-sm-2">Email : </label>
				<div class="col-sm-10">
					<input type="email" class="form-control" name="email">
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2">Enter New Password:</label>
				<div class="col-sm-10">
					<input type="password" class="form-control" name="password">
				</div>
			</div>

			<div class="clearfix">
				<button type="submit" class="btn btn-success">Submit</button>

			</div>

		</div>
	</form>
	<%@ include file="footer.html"%>
</body>
</html>