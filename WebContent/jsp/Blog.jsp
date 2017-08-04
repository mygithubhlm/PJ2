<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="dataBase.handle" %>
<%@ page import="dataBase.HandleText" %>
<%@ page import="dataBase.SomeMethod" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>博客2.0</title>
	<link href="../css/Blog.css" rel="stylesheet" type="text/css"/>
	<script type="text/javascript" src="../js/jquery-1.8.2.js"></script>
 	<script src="../js/Blog.js"></script>
</head>
<body >

<%request.setCharacterEncoding("utf-8");
  response.setCharacterEncoding("utf-8");
  int number=0;
  String name="小明";
  String account="hlm";
  HttpSession session0 = request.getSession(); 
 try{ String number0 = request.getParameter("number");
  number = Integer.parseInt(number0);
  }catch(Exception e){}
  try {
	  name =(String)session0.getAttribute("name");
	  account=(String)session0.getAttribute("account");%>
  <%}catch(Exception e){} 
  int num0= SomeMethod.getCommentsNum(HandleText.getAllTitle()[number]);
  %>
 
 
 
	
	
		
	 <%-- if (num!=0) {
		  var p =0;
	  for(p=0;p<num0;p++){
		var cId = "ss"+i;
		$("#"+commentId).append("<div id="+cId+">" +
				"<p class='name'>"+<%=handle.getNameByTitle(HandleText.getAllTitle()[number]) %>+"</p>" +
				"<p class='commentContent'>"+<%=(String)SomeMethod.getComments(HandleText.getAllTitle()[number])[p]%>+"</p>"+
				"<p class='cTime'>" +
					"<span class='timetime'>"+(myDate.getMonth()+1)+"/"+myDate.getDate()+"  "+myDate.getHours()+":"+myDate.getMinutes()+"  </span>"+
					"<span class='delete' onclick=del('dalete',"+cId+")>删除</p>"+
				"</p>" +
				"</div>");
		i++;
	}
	}--%>

<div id="wrapper">
	<p id="title"><%=name%>的博客</p>
    <p id="littleTitle">http://blog.xiaoming.com.cn/heheda2015</p>

	<!--页眉的导航栏-->
	<ul id="mainMeau">
			<li class="border"><a href="Index.jsp">首页&nbsp;</a></li>
			<li class="border"><a href="Blog_list.jsp">&nbsp;博文目录&nbsp;</a></li>
			<li class="border"><a href="Blog.jsp">&nbsp;博文显示&nbsp;</a></li>
			<li><a href="AboutMe.jsp">&nbsp;关于我</a></li>
	</ul>
    
    <!--左上角的块-->
    <div id="left_up">
            <p id="classOne">个人资料</p>
            <img src="<%=handle.getURL(account)%>" alt="logo"> 
            <p class="name"><%=name %></p>
            <p class="two">大家好，我是<%=name %>！欢迎光临我的博客！</p>
    </div>

    <!--中间的正文-->
    <div id="center">
        <p>正文</p>
             <div id="Blog_3" class="bottom">
                <p class="title"> 
                    <span id="bigTitle"><%=HandleText.getAllTitle()[number]%></span><!-- 标题 -->
                    <span id="time"></span><!-- 时间 -->
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
                 <p id="mainNews" ><%=HandleText.getAllText()[number]%></p><!-- 正文 -->
          
                <ul id="read" >
                     <li class="border">阅读(<%=SomeMethod.getRead()%>)</li>
                     <li class="border" id="praise" onclick=praise('<%=HandleText.getAllTitle()[number]%>','<%=dataBase.SomeMethod.getPraisesNum(HandleText.getAllTitle()[number]) %>')>&nbsp;赞(<%=dataBase.SomeMethod.getPraisesNum(HandleText.getAllTitle()[number]) %>)&nbsp;</li>
                     <li class="border" id="com"> &nbsp;<a href="#pos" id="numCom" >评论(<%=dataBase.SomeMethod.getCommentsNum(HandleText.getAllTitle()[number]) %>)</a>&nbsp;</li>
                     <li class="border">&nbsp;编辑&nbsp;</li>
                     <li id="btn" onclick = "del('btn','Blog_3')">&nbsp;删除</li>
                </ul>
                
                <!--评论区-->
                <p class="comment0">评论</p>
                
             <div id="comment">
              <%if (num0==0) {}
              	 else if (num0==1){%>
              	
              		<div id="comment1" >
                	<p class="name"><%=handle.getNameByTitle(HandleText.getAllTitle()[number]) %></p>
                	<p class="commentContent"><%=SomeMethod.getComments(HandleText.getAllTitle()[number])[0] %></p>
                		<!-- 镁元素可能在这个天体系统中扮演着神秘作用，科学家推测镁元素堆积在行星磁场的前缘，形成了弧形冲击波，当行星近距离通过恒星附近时可探测到这个现象。<br/> -->
                		<p class="cTime"><span class="timetime"></span><span class="delete" onclick="del('delete','comment1')"></span>
                		</p> 
                	</div>
                
              	<%}else if (num0==2){%>
              	 
                	<div id="comment1" >
                	<p class="name"><%=handle.getNameByTitle(HandleText.getAllTitle()[number]) %></p>
                	<p class="commentContent"><%=SomeMethod.getComments(HandleText.getAllTitle()[number])[0] %></p>
                		<!-- 镁元素可能在这个天体系统中扮演着神秘作用，科学家推测镁元素堆积在行星磁场的前缘，形成了弧形冲击波，当行星近距离通过恒星附近时可探测到这个现象。<br/> -->
                		<p class="cTime"><span class="timetime"></span><span class="delete" onclick=del('delete','comment1')></span>
                		</p> 
               		</div>
                	<div id="comment2">
                	<p class="name"><%=handle.getNameByTitle(HandleText.getAllTitle()[number])%></p>
                	<p class="commentContent" id="jq"><%=SomeMethod.getComments(HandleText.getAllTitle()[number])[1] %></p>
                		<!-- 在新的WAP-12b热木行星观测任务中确认了行星大气较快出现的氢逃逸现象，此外还有较多的元素也逃逸进入太空，比如镁元素。<br/> -->
                		<p class="cTime"><span class="timetime"></span><span class="delete" onclick="del('delete','comment2')"></span>
                		</p> 
                	</div>
             
                <%} %>
                </div>
              
                  
                <!--发表评论的区域-->
                <form id ="form">
                	<p class="comment1" >发评论
                		<textarea class="writeComment" id="pos"></textarea>
              		</p>
               
                邮箱：<input type="text">
                昵称：<input type="text">
                
                <P id="submit" >
                <!--发评论的按钮-->
                <input type="button" id="sendC" onclick="deliver('pos','comment','<%=session0.getAttribute("name")%>')" value="发评论" >
			    </P>
			     </form>
			    <%--<p class="sb"><span class="first"> &lt;前一篇</span><span class="last0">后一篇&gt;</span></p>
			    <p><span id = "haha" class="sb" onclick="change()"> 木卫二的生命迹象，亟待人类发射探测器</span><span id="last" class="sb">番茄酱鳕鱼的做法</span></p> --%>
			    </div>
    </div>

    <!--左下角的块-->
    <div id="left_down">
             <p class="left_DownMeau">分类</p>
             <ul id="mainMenu">
                <li><a class="light" href="Blog.jsp?number=0">全部博文</a>(<%=dataBase.HandleText.getBlogNum() %>)</li>
                <li><a href="Blog.jsp?number=2">科技新闻</a></li>
                <li><a href="Blog.jsp?number=0">休闲时刻</a></li>
                <li><a href="Blog.jsp?number=1">吃货必看</a></li>
             </ul>
    </div>

    <!--底部的版权栏-->
    <div id="footer">
                 <p id="footer1">小明博客/网站地图/隐私条款/使用说明/复旦大学</p>
                 <p id="footer2">copyright &copy; 2015 all rights reserved </p>
    </div>
    </div>
    
    

</body>
</html>