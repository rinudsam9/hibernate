<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="bootstrap.min.css">
<script type="text/javascript" src="bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:indianred;color:azure">
<jsp:include page="banner.jsp" />
<!-- <form action="index.jsp"> -->
<div class="container">
<h1>You resembles to Super Hero</h1>
<% String hero = (String) request.getAttribute("Hero"); %>
<img src="<%= hero %>">
<br><br>
<a href="dashboard.jsp">Go Back</a>
<!--  <button type="submit" class="btn btn-success">Go Back</button> -->
<%@ include file="footer.html" %>
</div>
</form>
</body>
</html>



<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

</body>
</html> --%>