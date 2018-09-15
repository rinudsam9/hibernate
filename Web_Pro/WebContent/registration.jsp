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
			<div class="alert alert-info">
				<strong>Thank you for Registering with US! Login to
					continue....</strong>
			</div>
			<h1 align=center>Registration Form</h1>
			<p>Please fill in this form to create an account.</p>
			<hr>
			<div class="form-group">
				<label class="control-label col-sm-2">Email:</label>
				<div class="col-sm-10">
					<input type="email" class="form-control" name="email"
						placeholder="Enter email">
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2">Password:</label>
				<div class="col-sm-10">
					<input type="password" class="form-control" name="password"
						placeholder="Enter password">
				</div>
			</div>


			<div class="form-group">
				<label class="control-label col-sm-2">Which
					is your super hero?:</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" name="answer"
						placeholder="Enter your answer ">
				</div>
			</div>


			<div class="clearfix">
				<button type="reset" class="btn btn-danger">Cancel</button>
				<button type="submit" class="btn btn-success">Sign Up</button>
			</div>
		</div>
	</form>
	<%@ include file="footer.html" %>
</body>
</html>