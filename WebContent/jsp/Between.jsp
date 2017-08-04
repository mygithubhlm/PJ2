<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="dataBase.handle" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>insert</title>
</head>
<body>
	<%
	  String account0 = request.getParameter("userName");
	  String password0 = request.getParameter("password");
	  session.setAttribute("session","session0");
	  session.setAttribute("account", account0);
	  if(handle.checkPassword(account0,password0)) {%>
	 	 <%response.sendRedirect("Index.jsp"); %>
	 	 <%--<jsp:forward page="Index.jsp"></jsp:forward> --%>
	  <%}else {%>
	     <%session.setAttribute("name","mingming");%>
	  	 <%response.sendRedirect("login.jsp"); %>
	  	 <%--<jsp:forward page="login.jsp"></jsp:forward> --%>
	  <%} %>
</body>
</html>