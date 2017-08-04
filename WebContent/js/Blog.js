/**
 * 
 */
var i=2;
function del(btnId,divId) {
//	alert("ds");
	var x = document.getElementById(btnId);
	var y = document.getElementById(divId);
	$("#"+divId).remove();
	var b= --i;
	$("#numCom").html("评论("+(b)+")");
}

function change() {
	$.ajax({
		url:"../file0.php",
		dateType:"xml",
		success: function(date) {
			var content = $(date).html()
				//$("#center").html(content);
				alert(content);
			
			
		}
	})
}
function deliver(content,commentId,name) {
	var myDate = new Date();
	var x = document.getElementById(commentId);
	var y = $("#"+content).val();
	if (y){
		var cId = i; 
		$("#"+commentId).append("<div id="+cId+">" +
				"<p class='name'>"+name+"</p>" +
				"<p class='commentContent'>"+y+"</p>"+
				"<p class='cTime'>" +
					"<span class='timetime'>"+(myDate.getMonth()+1)+"/"+myDate.getDate()+"  "+myDate.getHours()+":"+myDate.getMinutes()+"  </span>"+
					"<span class='delete' onclick=del('dalete',"+cId+")>删除</p>"+
				"</p>" +
				"</div>");
		//$("#"+commentId).last-child.append("<p>多人恶地说道</p>");
		$("#"+content).val("");
		var a = ++i;
		$("#numCom").html("评论("+(a)+")");
	}else{
		alert("您还没有输入内容！")
	}
		
}

function commits02() {
			var i = x;
	        var xmlHttpRequest = null;
	        var url = "../HandleText?number="+i;//userfield.value;
//	        i++;
	        var usermsg = document.getElementById("theContent");
	        if (window.XMLHttpRequest) {//表示当前浏览器不是IE
	            xmlHttpRequest = new XMLHttpRequest();
	        } else if (window.ActiveXObject) {
	            xmlHttpRequest = new ActiveXObject("Microsoft.XMLHTTP");
	        }
	        xmlHttpRequest.open("GET", url, true);//设置请求方式为GET，设置请求的URL，设置为异步提交
	        xmlHttpRequest.onreadystatechange = function(){//将方法地址复制给onreadystatechange属性
	        	
	       
	            if(xmlHttpRequest.readyState == 4){//Ajax引擎状态为成功
	               if(xmlHttpRequest.status == 200){//HTTP协议状态为成功
//	            	    alert(userfield);
//	                	alert(i);
	                	var result=xmlHttpRequest.responseText;
//	                    alert(result.toString());
	                    $("#content").append("<li>" +
	                    						"<a class='before'></a>" +
	                    						"<a class='after' href='Blog.jsp?number="+i+"'>[查看]</a>"+
	                    					 "</li>");
	                   
	                }else{
	                    alert("请求失败，错误码=" + xmlHttpRequest.status);
	                }
	            }
	        };
	        xmlHttpRequest.send(null);//将设置信息发送到Ajax引擎
		   }




function praise(title,numm) {
//	    alert("ds");
	    var num = parseInt(numm);
	    $("#praise").html("赞("+(num+1)+")");
//	 for(x=0;x<num;x++){
		
//				var i = x;
	        var xmlHttpRequest = null;
	        var url = "../setPraise?title="+title;
//	        i++;
	        var usermsg = document.getElementById("theContent");
	        if (window.XMLHttpRequest) {//表示当前浏览器不是IE
	            xmlHttpRequest = new XMLHttpRequest();
	        } else if (window.ActiveXObject) {
	            xmlHttpRequest = new ActiveXObject("Microsoft.XMLHTTP");
	        }
	        xmlHttpRequest.open("GET", url, true);//设置请求方式为GET，设置请求的URL，设置为异步提交
	        xmlHttpRequest.onreadystatechange = function(){//将方法地址复制给onreadystatechange属性
	        	
	       
	            if(xmlHttpRequest.readyState == 4){//Ajax引擎状态为成功
	               if(xmlHttpRequest.status == 200){//HTTP协议状态为成功
//	            	    alert(userfield);
//	                	alert(i);
//	                	var result=xmlHttpRequest.responseText;
//	                    alert(result.toString());
//	                  
//	             		   $("#content > li:nth-child("+(i+1)+") > a:nth-child(1)").html(result.toString());
	             	
	                   
	                }else{
	                    alert("请求失败，错误码=" + xmlHttpRequest.status);
	                }
	            }
	        };
	        xmlHttpRequest.send(null);//将设置信息发送到Ajax引擎
			}
	
// $("#content > li:nth-child("+(i+1)+") > a:nth-child(1)").html(result.toString());

//   