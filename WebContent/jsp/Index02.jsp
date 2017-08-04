<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="dataBase.handle" %>
<%@ page import="dataBase.assort" %>
<%@ page import="dataBase.HandleText" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<link href="../css/Index.css" rel="stylesheet" type="text/css"/>
	<script type="text/javascript" src="../js/jquery-1.8.2.js"></script>
 	<script src="../js/Index.js"></script>
	<title>主页面</title>
</head>
<body onload="assortment()" >
<script language='javascript'>
if(document.readyState=="complete"){ 
	assortment(); 
	} 
function assortment() {
    	var userfield = document.getElementById("assort");
		var num="hlm";<%=(String)session.getAttribute("account")%>;
		
		var n=<%=dataBase.assort.getNum("hlm")%>//(String)session.getAttribute("account"))
		var x=1;
		var s=[];
		alert(1);
	   for(x=1;x<=n;x++){	   
		   (function(){
			   var xmlHttpRequest = null;
		        var url = "../assortServlet?account=" + num + "&cixu=" +x;
		        if (window.XMLHttpRequest) {//表示当前浏览器不是IE
		            xmlHttpRequest = new XMLHttpRequest();
		        } else if (window.ActiveXObject) {
		            xmlHttpRequest = new ActiveXObject("Microsoft.XMLHTTP");
		        }
		        xmlHttpRequest.open("GET", url, true);//设置请求方式为GET，设置请求的URL，设置为异步提交
		        xmlHttpRequest.onreadystatechange = function(){//将方法地址复制给onreadystatechange属性
		            if(xmlHttpRequest.readyState == 4){//Ajax引擎状态为成功
		            	if(xmlHttpRequest.status == 200){//HTTP协议状态为成功
			                //alert("fuck");
		            		//alert(xmlHttpRequest.responseText);
		            		var y=xmlHttpRequest.responseText;
		            		//alert(y);
				          $("#left_down > ul").append("<li><a href=''>"+y+"</a></li>");  
		                }else{
		                    alert("请求失败，错误码=" + xmlHttp.status);
		                }
		            }
		        };
		        xmlHttpRequest.send(null);//将设置信息发送到Ajax引擎
		}());
}
}
</script>
	<%HttpSession session0 = request.getSession(); 
	  request.setCharacterEncoding("utf-8");
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
	  <%--script type="text/javascript">
	  alert("<%=session0.getAttribute("name")%>");
	  </script>
	 --%>
	<div id="wrapper">
		<p id="title"><%=handle.getName(account)%>的博客</p>
		<p id="littleTitle">http://blog.xiaoming.com.cn/heheda2015</p>
		<!--页眉的菜单栏-->
		<ul id="mainMeau">
			<li class="border" id="light"><a href=#>首页</a></li>
			<li class="border"><a href="Blog_list02.jsp">博文目录</a></li>
			<li><a href="Blog02.jsp?number=0"+<%=handle.getName(account)%>>博文显示</a></li>
			<!-- li><a href="AboutMe.jsp">关于我</a></li> -->
			<%-- li class="border"><a href="http://www.baidu.com">退出登录</a></li> --%>
		</ul>
		
		 <!--个人资料-->
   		 <div id="left_up">
            <!-- p id="classOne">个人资料</p> -->
            <img src="<%=handle.getURL(account)%>" alt="logo"> 
            <%-- p class="name"><%=handle.getName(account)%></p> 
            <p class="two">大家好，我是<%=handle.getName(account)%>！欢迎光临我的博客！</p>--%>
 	    </div>
 	    <!--中间的显示部分-->
    <div id="center">
        <p>全部博文</p>
        <!--第一篇文章-->
             <div id="Blog_1" class="bottom">
                <p class="title">
                    <span class="bigTitle"><%=HandleText.getAllTitle()[0] %><!-- “小明，滚出去！”全集一到四季，史上最全版本！就是这么任性！ --></span>
                    <span id="time"></span>
                </p>
                <div class="tip0">
                       <ul class="tip">
                            <li>标签:</li>
                            <li class="color">小明</li>
                            <li class="color">老师</li>
                            <li class="color">同学们</li>
                            <li class="color">小红</li>
                            <li class="color">教师</li>
                            <li>分类:</li>
                            <li class="color" id="kindd">休闲娱乐</li>
                        </ul>
                        
                </div>
                 <%--<p class="content01">老师把小明叫到了教室外。</p>
                <ul class="AllContent">
                     <li>老师：“你的作业做的越来越差了，这是怎么回事？”</li>
                     <li>小明：“老师，等我找找原因，下午告诉你好吗？”</li>
                     <li>老师：“好吧！”</li>
                     <li>下午，老师又把小明叫到了教师外。老师：“找到原因了吗？”</li>
                     <li>小明：“找到了，我爷爷说作业越来越难，他也没办法。”</li>
                </ul>--%>
                <p class="content01"></p>
                <P class="content02"></P>
                <ul class="read" > 
                     <li><a class="border" href="Blog.jsp?number=0">阅读</a></li>
                     <%--li><a href="Blog.jsp?number=0">评论</a></li> --%>
                </ul>
             </div>

             <!--第二篇文章-->
             <div id="Blog_2" class="bottom" >
                <p class="title">
                    <span class="bigTitle"><%=HandleText.getAllTitle()[1] %></span>
                    <span class="time"></span>
                </p>
                <div class="tip0">
                        <ul class="tip">
                            <li>标签:</li>
                            <li class="color">鳕鱼</li>
                            <li class="color">番茄酱</li>
                            <li class="color">深水鱼</li>
                            <li class="color">维生素</li>
                            <li class="color">酱汁</li>
                            <li>分类:</li>
                            <li class="color">吃货必看</li>
                        </ul>
                        
                </div>
                 <p class="content02"> <%=HandleText.getSubString(HandleText.getText(handle.getName(account))[1])%></p><%-- “鳕鱼，是海洋深水鱼，肉质厚实，刺极少，味道甘美。鳕鱼肉中的蛋白质含量比一般的鱼都高，所含脂肪却很少，是特别营养的美食。除了富含普通鱼油中的DHA、DPA，还含有人体所需的维生素A、D、E和其他各种维生素，有餐桌上的“营养师”之称！
                　鳕鱼一般是油煎食用，这次花儿做成勾芡番茄酱汁的酸甜口，拌米饭吃相当营养美味，   和大家来分享吧。” --%>
                <ul class="read" >
                     <li><a class="border" href="Blog.jsp?number=1">阅读</a></li>
                     <%--li><a href="Blog.jsp?number=1">评论</a></li> --%>
                </ul>
             </div>
             
             <!--第三篇文章-->
             <div id="Blog_3" class="bottom">
                <p class="title"> 
                    <span class="bigTitle"><%=HandleText.getAllTitle()[2] %></span>
                    <span class="time"></span>
                </p>
                <div class="tip0">
                       <ul class="tip">
                            <li>标签:</li>
                            <li class="color">行星</li>
                            <li class="color">恒星</li>
                            <li class="color">炽热</li>
                            <li class="color">气体</li>
                            <li class="color">探索</li>
                            <li>分类:</li>
                            <li class="color">科技新闻</li>
                        </ul>
                        
                </div>
                 <p><%=HandleText.getSubString(HandleText.getText("小明")[2]) %></p>
                <ul class="read" >
                     <li><a class="border" href="Blog.jsp?number=2">阅读</a></li>
                     <%--li><a href="Blog.jsp?number=2">评论</a></li> --%>
                </ul>
             </div>
             
             <!--第四篇文章-->
            <div id="Blog_4" class="bottom">
                <p class="title">
                    <span class="bigTitle"><%=HandleText.getAllTitle()[3] %></span>
                    <span class="time">2015-04-19</span>
                 </p>
                <div class="tip0">
                        <ul class="tip">
                            <li>标签:</li>
                            <li class="color">科技</li>
                            <li class="color">探索</li>
                            <li class="color">木卫二</li>
                            <li class="color">探测器</li>
                            <li class="color">地球</li>
                            <li>分类:</li>
                            <li class="color">科技新闻</li>
                        </ul>
                        
                </div>
                 <p class="content02"><%=HandleText.getSubString(HandleText.getText("小明")[3])%></p>
                <%--img id="muwei" src="../图片/muwei.jpg" alt="木卫二"> --%>
                <ul class="read" >
                     <li><a class="border" href="Blog.jsp?number=2">阅读</a></li>
                     <%--li><a href="Blog.jsp?number=2">评论</a></li> --%>
                </ul>
            </div>

    </div>

    <!--左下角的导航栏-->
    <div id="left_down">
             <p class="left_DownMeau">分类</p>
             <ul id="mainMenu">
                <li><a href="Blog_list.jsp">全部博文</a>(<%=dataBase.HandleText.getBlogNum() %>)</li><%--div onclick=shi("hlm")>点击</div> --%>
               <%-- <li><a href="http://www.baidu.com">科技新闻</a>(2)</li>
                <li><a href="http://www.baidu.com">休闲时刻</a>(1)</li>
                <li><a href="http://www.baidu.com">吃货必看</a>(1)</li> --%>
             </ul>
    </div>

    <!--底部的版权兰-->
    <div id="footer">
                 <p id="footer1">博客/网站地图/隐私条款/使用说明/复旦大学</p>
                 <p id="footer2">copyright &copy; 2015 all rights reserved </p>
    </div>
	</div>
</body>
</html>