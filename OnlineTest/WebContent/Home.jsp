<%@page import="com.onlinetest.start.Login"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!int n1=2, n2=3; %>
<% String name = request.getParameter("username"); %>
<%	Login login =new Login();
	login.setUsername(name);
%>	
name is <%=login.getUsername() %> 
<h1> to deloitte </h1>

</body>
</html>