<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="dataBase.handle"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>登录</title>
	<link href="../css/login.css" rel="stylesheet" type="text/css"/>  
  <!-- <script language="javascript" src="../js/login.js">  --> 
  <!-- </script> -->   
</head>
<body>
	<div class="login_1">
	<%HttpSession session0 = request.getSession(); %> 
	<%try{if(request.getParameter("function").equals("tuichu")){
		session0.invalidate();
	}}catch(Exception e){}%>
	<%try{if(session.getAttribute("session").equals("session0")){%>
		<%session0.invalidate(); %>
	    <%//request.getSession().getAttribute("name") %>
		<script type="text/javascript">
		   // alert(rr);
			alert("用户名和密码不匹配！");
		</script>
	<%}}catch(Exception e){%>
	<%} %>
	
 	<!--图标和名称-->
 	 <label id="name"><img class="logo" src="../图片/logoTT.jpg" alt="logo"> 博客 </label><a href="Register.jsp" id="regg">注册</a>

 	<form method="post" action ="http://localhost:8080/PJ2/jsp/Between.jsp" name="form1" id="form1">
   		<p id="tip">请输入您的账号和密码</p>
   		<p id="userName_1">
    		账号：
    		<input id="userNameInput" type="text" name="userName" placeholder="用户名" required="required" >   		
    	</p>
    	<p id="passWord_1">
    	密码：
    	<input id="passWordInput" type="password" name="password" placeholder="密码" required="required"></p>
        <label id="theButtons">
            <input type="hidden" id="hidden1" name="hidden1" value="">
            <input type="submit" id="button1" name = "btLogin" value="登录" >
            <input type="button" id="button2" name = "btRegister" value="取消" onclick="window.open('Index02.jsp')">
        </label>
    	
     </form>
     <script>
    		
    		
    	</script>
    </div>
</body>
</html>