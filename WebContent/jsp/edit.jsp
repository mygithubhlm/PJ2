<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%HttpSession session0 = request.getSession();
	session0.setAttribute("account", "hlm");
	request.setCharacterEncoding("utf-8");
	response.setCharacterEncoding("utf-8");
String  number = session0.getAttribute("account").toString();
//System.out.print(number);用于验证的
String input=request.getParameter("input");
String article=request.getParameter("article");
String sign=request.getParameter("sign");
String time =new java.sql.Timestamp(System.currentTimeMillis()).toString();
String style = request.getParameter("select");
//System.out.println(style);
dataBase.Accept.inputArticle(number,time,article,style,sign,input);
dataBase.HandleText.InsertContent(input, number, "0", article, time, style);
dataBase.SomeMethod.insertComment(input, number, "", time);
response.sendRedirect("../jsp/Blog_list.jsp");
//System.out.print(time);用于验证的
%>
</body>
</html>