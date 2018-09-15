<%@page import="lti.quiz.bean.RegistrationBean"%>
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
<%
	RegistrationBean user = (RegistrationBean) session.getAttribute("USER");
%>
<body style="background-color: steelblue; color: azure">
 <jsp:include page="banner.jsp" />
	<div class="container">
		<h1 align=center>MY DASHBOARD</h1>
		<h2>Dear :<%=user.getEmail()%> </h2>
		<img src="<%=user.getProfile()%>" height="200" width="250">
		<hr>
		<h2>Ever wondered which Super Hero you are?</h2>
		<a href="quiz.quiz" class="btn btn-info"> Take Quiz to Discover</a>

	</div>
  <%@ include file="footer.html" %>
</body>
</html>