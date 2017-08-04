<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" >
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<%	
	 request.setCharacterEncoding("utf-8");
	String name = request.getParameter("qm");
	String number = request.getParameter("yhm");
	String password = request.getParameter("mm");
	String hobby = request.getParameter("qxmm");
	String sex = request.getParameter("sex");
	String email = request.getParameter("lxfs");
	entrance.Accept.input(name, number, password, hobby, sex, email);
%>
注册成功！
</body>
</html>
