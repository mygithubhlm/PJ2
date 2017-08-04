<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="dataBase.HandleText" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <link href="../css/Blog_list.css" rel="stylesheet" type="text/css"/>  ">
	<title>博文目录</title>
	<script type="text/javascript" src="../js/jquery.min.js"></script>
	<script type="text/javascript" src="../js/Blog_list.js"></script>
</head>
<body onload="assortment()">
<script type="text/javascript">
	if(document.readyState=="complete"){ 
	assortment(); 
	} 
		
</script>
   

	<!-- input type="button" onclick="hehe('<% %>')"> -->
	<div id = "theContent"></div>
	
	 <!--博文目录页面-->
    <div id="wrapper">
	<p id="title">小明见天的博客</p>
	<p id="littleTitle">http://blog.xiaoming.com.cn/heheda2015</p>
	<ul id="mainMeau">
			<li class="border"><a href="Index.jsp">首页</a></li>
			<li class="border" id="light"><a href="blog_list.jsp">博文目录</a></li>
			<li class="border"><a href="Blog.jsp?number=0">博文显示</a></li>
			<li><a href="AboutMe.jsp">关于我</a></li>
	</ul>
    
    <div id="writeBlog">
            <img id="writeBlogImg" src="../图片/writeBlog.jpg" alt="logo" >
            <a href="../html/Edit.html">发博文</a>
    </div>

    <!--左上角的块-->
    <div id="left_up">
            <p>博文</p>
            <ul id="meau">
                 <li><a href="Blog.jsp?number=0">全部博文</a>(<%=dataBase.HandleText.getBlogNum() %>)</li>
                 <li><a href="Blog.jsp?number=2">科技新闻</a></li>
                 <li><a href="Blog.jsp?number=0">休闲时刻</a></li>
                 <li><a href="Blog.jsp?number=1">吃货必看</a></li>
                 <li><a href="#">未分类博文</a></li>
            </ul>
    </div>

    <!--中间部分-->
    <div id="center">
             <p>全部博文</p>
             <ul id="content">    
                <li><a class="before" href="Blog.jsp?number=0"></a><a class="after" href="Blog.jsp?number=0">[查看]</a></li>
                <li><a class="before" href="Blog.jsp?number=1"></a><a class="after" href="Blog.jsp?number=1">[查看]</a></li>
                <li><a class="before" href="Blog.jsp?number=2"></a><a class="after" href="Blog.jsp?number=2">[查看]</a></li>
                <li><a class="before" href="Blog.jsp?number=3"></a><a class="after" href="Blog.jsp?number=3">[查看]</a></li>
             </ul>

    </div>

    <!--左下角的搜索框-->
    <div id="left_down">
         <p>搜博主文章</p>
         <p id="search"><input type="text" class="in" id="search" name="sss"/>
                        <input type="button" onclick="search0.jsp" value="搜索"/>
         </p> 
    </div>
    <div id="footer">
                 <p id="footer1">博客/网站地图/隐私条款/使用说明/复旦大学</p>
                 <p id="footer2">copyright &copy; 2015 all rights reserved </p>
    </div>

    </div>
</body>
</html>