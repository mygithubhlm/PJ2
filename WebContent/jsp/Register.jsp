<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="dataBase.handle" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>注册</title>
	<meta http-equiv="Content-Type" content="text/html; charset="utf-8">
	<link href="../css/Register.css" type="text/css" rel="stylesheet">
	<script type="text/javascript" src="../js/Register.js"></script>
	<style type="text/css">
		td.check{ 
		line-height:26px;
		color:#C00; 
		font-weight:bold; 
		}
		.button {
		width:40px;
		}
	</style>
</head>
<body>
 <h2>新用户注册！</h2>
 <%try{if(session.getAttribute("name").equals("session0")){%>
		<script type="text/javascript">
			alert("该用户名已存在！");
		</script>
		<%session.invalidate();%>
	<%}}catch(Exception e){%>
	<%} %>
 <p id="log">已有账号<a href="login.jsp">登录</a>
 <div id = "div1">
	<form id="test" name = "form1" onsubmit="return validate()" action="http://localhost:8080/PJ2/jsp/RegBetween.jsp" method="post">
		<table>
			<tr>
				<td>昵称*:</td>
				<td><input type="text" name="Name" id="name" size="20" onchange='check("name")'></td>
				<td id="nameCheck" class="check" hidden="true">*昵称不能为空</td>
			</tr>
			<tr>
				<td>账号*:</td>
				<td><input type="text" name="Account" id="account" onchange='check("account")'></td>
				<td id="accountCheck" class="check" hidden="true">*账号必须为2-14个长度的数字、字母或下划线</td>
			</tr>
			<tr>
				<td>密码*:</td>
				<td><input type="password" name="Password" id="password" size="20" onchange='check("password")'></td>
				<td id="passwordCheck" class="check" hidden="true">*密码必须是长度不能小于6的数字、字母且不能全为数字</td>
			</tr>
			<tr>
				<td>确认密码*：</td>
				<td><input type="password" name="cpassword" id="cpassword" size="20" onchange='check("cpassword")'></td>
				<td id="cpasswordCheck" class="check" hidden="true">*两次密码必须相同</td>
			</tr>
			<tr>
				<td>Email*:</td>
				<td><input type="text" name="Email" id="email" size="20" onchange='check("email")'></td>
				<td id="emailCheck" class="check" hidden="true" >*邮箱格式不正确</td>
			</tr>			
			<tr> 
				<td>TEL:</td> 
				<td><input type="text" name="TEL" id="TEL" size="20"></td> 
			</tr> 
			<tr> 
				<td>Age:</td> 
				<td><input type="text" name="Age" id="age" size="20" onchange='check("age")'></td> 
				<td id="ageCheck" class="check" hidden="true">*年龄不能小于17岁</td> 
			</tr> 
			<tr> 
				<td>QQ:</td> 
				<td><input type="text" name="QQ" id="QQ" size="20"></td> 
			</tr> 
			<tr> 
				<td>个性签名:</td> 
				<td><textarea rows="5" name="pi" cols="21"></textarea></td> 
			</tr> 
			<tr> 
				<td colspan="5"> 
					<input class="button" type="submit" name="submit"> 
					<input class="button" type="reset" name="reset"> 
			    </td> 
			</tr>
		</table>
	</form> 
	</div>
</body>
</html>