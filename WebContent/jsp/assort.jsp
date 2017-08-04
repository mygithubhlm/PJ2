<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="dataBase.assort" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset=utf-8 />		
	<title>吊炸天博客</title>
	<link rel="stylesheet" type="text/css" href="../css/index1.css">
</head>
<body onload="assortment()" >
<script type="text/javascript" src="../js/jquery-1.8.2.js"></script>
<script language='javascript'>
if(document.readyState=="complete"){ 
	assortment(); 
	} 
function assortment() {
    	var userfield = document.getElementById("assort");
		var num="hlm"<%--=(String)session.getAttribute("account")--%>;
		var n=<%=dataBase.assort.getNum((String)session.getAttribute("account"))%>;
		var x=1;
		var s=[];
		alert(n);
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
			                alert("fuck");
		            		alert(xmlHttpRequest.responseText);
		            		var y=xmlHttpRequest.responseText;
				$("ul").append("<li><a href=''>"+y+"</a></li>");  
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
	<div id="header">
		<%=session.getAttribute("account")%>的博客
	</div>
	<div id="choose">
		<a href="index.html" class="jump"><span id="home">首页</span>
		</a>
		<a href="list.jsp" class="jump">博文目录
		</a>
		<a href="" class="jump">图片
		</a>
		<a href="">关于我
		</a>
	</div>
	<div id="leftone">
		<h>个人资料
		</h>
		<img src="h1.jpg" class="avatar">
		<p id="avatar"><%=session.getAttribute("account")%></p>
		<p1 >您的个人资料为空，请及时添加您的个人资料</p1>
	</div>
	<div id="right">
		<h>博文
		</h>
		<h1>"小明滚出去！"全集一到四季，史上最全版本，就是这么任性！<span class="time">（2015-03-17 00:35）<br></span>
		</h1>
		<pre>标签：<a href="">小明 老师 同学们 小红 教室</a> 	  分类：<a href="">休闲时刻</a> </pre>
	<p2>老师把小明叫到了教室外。</p2><br><p2>老师：“你的作业做的越来越差了，这是怎么回事？”</p2><br><p2>小明：“老师，等我	找找原因，下午告诉你好吗？”</p2><br><p2>老师：“好吧！”</p2><br><p2>下午，老师又把小明叫到了教室外。</p2><br><p2>老师：“找到原因了吗？”</p2><br><p2>小明：“找到了，我爷爷说作业越来越难，他也没办法。”
	</p2>
	<h2><a href="" class="read">阅读&nbsp</a><a href="" class="discuss">评论</a><a href="" class="allarticle">查看全文>></a>
	</h2>
	<h1>零厨艺也能成功的硬菜---可乐鸡翅<span class="time">（2015-03-16 19:33）<br></span>
		</h1>
		<pre>标签：<a href="">可乐 鸡翅 零厨艺 硬菜 </a> 	  	分类：<a href="">吃货必看</a> </pre>
		<img src="chicken.jpg" class="eating"><br>
	<p2>1. 在翅中的正反面分别斜刀剌几下。目的是更好的入味儿和去血沫 。	</p2><br><p2>2. 锅内坐水，处理好的翅中放入凉水锅内，并倒入适量料酒，大火烧开。</p2><br><p2>3. 煮沸后捞出翅中用温水冲洗掉上面粘附的血沫并沥干水分备用。</p2><br><p2>
	4. 油温6成热，丢进蒜片辣椒段和姜片爆香。倒入焯好的翅中翻炒至表面金黄。
	</p2><br><p2>5. 倒入可乐，没过翅中。并调入适量老抽</p2><br><p2>6. 大火煮沸后转中小火收汁。最后调入盐即可出锅</p2>
	<h2><a href="" class="read">阅读&nbsp;</a><a href="" class="discuss">评论</a><a href="" class="allarticle">查看全文>></a>
	</h2>
	<h1>网络电台企业厮杀内容与渠道：明年或大整合<span class="time">（2015-03-15 19:33）<br></span>
		</h1>
		<pre>标签：<a href="">网络电台 厮杀 整合 </a> 	  	分类：<a href="">科技新闻</a> </pre>
	<p2>  网络电台行业过去一周因为内容版权打起了口水战，多家企业的矛头直指知名网络电台企业喜马拉雅FM。荔枝FM、多听FM双方称因喜马拉雅FM”恶意举报”它们存在内容版权问题，遭到了苹果App Store的下架。随后蜻蜓FM工作人员跳出“揭短”喜马拉雅，称为喜马拉雅站台的《罗辑思维》版权也并不是什么“独家排他的”。一时间，围绕内容版权，网络电台企业各自有话要说。
	</p2><br><p2>表面上看，这是几家网络电台在揪着版权打公关仗，但本质上这也体现出，内容的版权问题已经成为网络电台竞	争的焦点。而除了内容之外，在占领各种智能终端上，网络电台企业实际上也在暗中较劲。</p2><br><p2> 随着内容和渠道争夺的加剧，网络电台企业的厮杀或许从现在这一刻起才真正开始。</p2>
	<h3><a href="" class="read">阅读&nbsp;</a><a href="" class="discuss">评论</a><a href="" class="allarticle">查看全文>></a>
	</h3>
	</div>

	<div id="lefttwo">
		<h>分类
		</h>
		<ul class="sort" id="assort" >
			<li><a href="">全部博文</a>
			</li>
		</ul>
	</div>
	<div id="footer">
		<p>吊炸天博客版权所有</p>
		<p>COPYRIGHT &copy; 2015 ALL RIGHTS RESERVED</p>
	</div>

</body>
</html>