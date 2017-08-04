<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="dataBase.handle" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="../css/AboutMe.css" rel="stylesheet" type="text/css"/> 
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	  <%HttpSession session0 = request.getSession(); 
	  request.setCharacterEncoding("utf-8");
	  response.setCharacterEncoding("utf-8");
	  String account="hlm";
	  try{account = (String)session0.getAttribute("account");
	 	  ;//handle.getName(account));
	  }
	  catch(Exception e){}%>
	  <%-- account="hlm"; --%>
	  <%account="hlm";
	    session0.setAttribute("name",handle.getName(account)); 
	    session0.setAttribute("account",account);
	    %>
<div id="wrapper">
		<p id="title"><%=handle.getName(account)%>的博客</p>
		<p id="littleTitle">http://blog.xiaoming.com.cn/heheda2015</p>
	<!--页眉的导航栏-->
	<ul id="mainMeau">
			<li class="border"><a href="Index.jsp">首页&nbsp;</a></li>
			<li class="border"><a href="Blog_list.jsp">&nbsp;博文目录&nbsp;</a></li>
			<li class="border"><a href="Blog.jsp">&nbsp;博文显示&nbsp;</a></li>
			<li><a href="AboutMe.jsp">&nbsp;关于我</a></li>
	</ul>
		
		 <!--个人资料-->
   		 <div id="left_up">
            <p id="classOne">个人资料</p>
            <img src="<%=handle.getURL(account)%>" alt="logo"> 
            <p class="name"><%=handle.getName(account)%></p>
 	    </div>
 	    <div id = "right">
 	    	<p class="two">大家好，我是<%=handle.getName(account)%>！欢迎光临我的博客！</p>
 	    	<p>
 	    		昵称：<%=handle.getName(account) %>
 	    	</p>
 	    	<p>
 	    		账号：<%=account%>
 	    	</p>
 	    	<p>
 	    	        电话：<%--= --%>
 	    	</p>
 	    	<p>
 	    		邮箱：<%--= --%>
 	    	</p>
 	    	<a href="../html/change.html">更改头像</a>
 	    	<a href="login.jsp?function=tuichu">退出登录</a>
 	    </div>
</div>    
 	    
 	
</body>
</html>