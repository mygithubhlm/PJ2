<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="dataBase.handle" %>
<%@ page import="dataBase.Accept" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Register</title>
</head>
<body>
	<%request.setCharacterEncoding("utf-8"); %>
	<%String name0=request.getParameter("Name");
	  String account0=request.getParameter("Account");
	  String password0=request.getParameter("Password");
	  String email0=request.getParameter("Email");
	  String tel0=request.getParameter("TEL");
	  String age0=request.getParameter("Age");
	  String qq0=request.getParameter("QQ");
	  String pi0=request.getParameter("pi");
	  String photourl0 = "E:/WorkPlaceFor Eclipse EE/PJ2/WebContent/pics/logo.jpg";
	  %>	
	  <%if(handle.CheckAccount(account0)){%>
	  	 <%session.setAttribute("name", "session0"); %>
	  	 <%response.sendRedirect("Register.jsp"); %>
	 <%}else{
	     session.setAttribute("account", account0);%> 
	 	<%handle.insert(account0, password0,email0,tel0,age0,qq0,pi0,name0,photourl0);%>
	 	<%response.sendRedirect("Index.jsp"); %>
	 	<% }%>
</body>
</html>