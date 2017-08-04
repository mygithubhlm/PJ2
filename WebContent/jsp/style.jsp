<%--@page import="dataBase.Accept.GetInformationServlet"--%>
<%@page import="dataBase.Accept"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
request.setCharacterEncoding("utf-8");
response.setCharacterEncoding("utf-8");
String style=request.getParameter("style");
String number=session.getAttribute("account").toString();
String styleExisted=dataBase.Accept.getStyle(number);
String[] ar=styleExisted.split(",");
int ii=0;
boolean right = true;
for (int i=0;i<ar.length;i++){
	System.out.println(ar[i]);//用于验证的
	if (ar[i].equals(style)){
		response.sendRedirect("../html/style.html?a=0&styleProve=1");
		right=false;
	}
	else{
		ii++;
	}
}
if (ii==ar.length && right){
	Accept.createStyle(number,style);
	response.sendRedirect("../html/Edit.html");//zhehangmeixiewan
	}
%>
</body>
</html>