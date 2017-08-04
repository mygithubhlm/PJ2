<%@page import="dataBase.Accept" import="java.io.*"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<%
request.setCharacterEncoding("utf-8");
response.setCharacterEncoding("utf-8");
String number =request.getParameter("yhm");
   String password =request.getParameter("mm");
   String newPassword = request.getParameter("qm1");
   String photoUrl = request.getParameter("pic");
   //System.out.print(number);//用于验证的
   //System.out.print(photoUrl);//用于验证的
//0代表可行。1代表不可行
//2代表特殊情况
int i = 0;
if(dataBase.Accept.see(number)== false && dataBase.Accept.prove(number,password).equals("t")){
if(photoUrl !=null){
	//System.out.println(i);用于验证
	System.out.println(photoUrl);
	FileInputStream fis = null;
	  FileOutputStream fos = null;
	  try {
	   fis = new FileInputStream(photoUrl);
	   byte[] b = new byte[128];
	   fos = new FileOutputStream("E:/WorkPlaceFor Eclipse EE/PJ2/WebContent/pics/" + number + ".jpg");
	   while(fis.read(b)!=-1){
	    fos.write(b);
	   }
	   
	  } catch (Exception e) {
		  e.printStackTrace();
		response.sendRedirect("../html/change.html?number=3&password=0");
		i=1;
	  }
	  finally{
	   try{
	    if(fis!=null) fis.close();
	    if(fos!=null) fos.close();
	   }catch(Exception e){
	    e.printStackTrace();
	   }
	   Accept.changePhoto(number,"E:/WorkPlaceFor Eclipse EE/PJ2/WebContent/pics/" + number + ".jpg");
	  }
}
}
if (dataBase.Accept.see(number)){
	response.sendRedirect("../html/change.html?number=1&password=0");
}
else{
	if(dataBase.Accept.prove(number,password).equals("t") == false){
		response.sendRedirect("../html/change.html?number=0&password=1");
	}
	else{
		if (i==0){
		if (newPassword.length()==0){
			response.sendRedirect("../html/change.html?number=0&password=2");
		}
		else{
		dataBase.Accept.changePassword(number, newPassword);
        response.sendRedirect("../jsp/Index.jsp?id="+number+"&b=3");
	}
	}
	}
}
//a=1与 pj2.JSP中的传的参数是不同的
%>
</body>
</html>