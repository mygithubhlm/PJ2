/**
 * 
 */
function assortment() {
	var d=0;
	var k=0;
	var aa=0;
	(function(){			
		var resultt = 0;
        var xmlHttpRequest = null;
        var url = "../TheNum";//userfield.value;
//        i++;
//        var usermsg = document.getElementById("theContent");
        if (window.XMLHttpRequest) {//表示当前浏览器不是IE
            xmlHttpRequest = new XMLHttpRequest();
        } else if (window.ActiveXObject) {
            xmlHttpRequest = new ActiveXObject("Microsoft.XMLHTTP");
        }
        xmlHttpRequest.open("GET", url, true);//设置请求方式为GET，设置请求的URL，设置为异步提交
        xmlHttpRequest.onreadystatechange = function(){//将方法地址复制给onreadystatechange属性
        	
            if(xmlHttpRequest.readyState == 4){//Ajax引擎状态为成功
               if(xmlHttpRequest.status == 200){//HTTP协议状态为成功
//            	    alert(userfield);
                	result=xmlHttpRequest.responseText;
                	d = parseInt(result); 
                	
                	   for(x=4;x<d;x++){
                			(function(){
                				var i = x;
                				$("#content").append("<li>" +
            						"<a class='before'></a>" +
            						"<a class='after' href='Blog.jsp?number="+i+"'>[查看]</a>"+
            					 "</li>");
                		   })()
                		   aa++;
                	}
//                    $("#content > li:nth-child("+(i+1)+") > a:nth-child(1)").html(result.toString());
                }else{
                    alert("请求失败，错误码=" + xmlHttpRequest.status);
                }
            }
        };
        xmlHttpRequest.send(null);//将设置信息发送到Ajax引擎
//        	if (aa>=4){
        		gg();
//        	}
	   })()
//	   
//	  
//	      alert(d);
//    
		function gg(){			
		var resultt = 0;
        var xmlHttpRequest = null;
        var url = "../TheNum";//userfield.value;
//        i++;
//        var usermsg = document.getElementById("theContent");
        if (window.XMLHttpRequest) {//表示当前浏览器不是IE
            xmlHttpRequest = new XMLHttpRequest();
        } else if (window.ActiveXObject) {
            xmlHttpRequest = new ActiveXObject("Microsoft.XMLHTTP");
        }
        xmlHttpRequest.open("GET", url, true);//设置请求方式为GET，设置请求的URL，设置为异步提交
        xmlHttpRequest.onreadystatechange = function(){//将方法地址复制给onreadystatechange属性
        	
            if(xmlHttpRequest.readyState == 4){//Ajax引擎状态为成功
               if(xmlHttpRequest.status == 200){//HTTP协议状态为成功
//            	    alert(userfield);
                	result=xmlHttpRequest.responseText;
                	d = parseInt(result); 
                	
                	   for(x=0;x<d;x++){
                			(function(){
                				var i = x;
                	        var xmlHttpRequest = null;
                	        var url = "../HandleText?number="+i;//userfield.value;
//                	        i++;
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
//                	            	    alert(userfield);
//                	                	alert(i);
                	                	var result=xmlHttpRequest.responseText;
//                	                    alert(result.toString());
                	                  
                	             		   $("#content > li:nth-child("+(i+1)+") > a:nth-child(1)").html(result.toString());
                	             	
                	                   
                	                }else{
                	                    alert("请求失败，错误码=" + xmlHttpRequest.status);
                	                }
                	            }
                	        };
                	        xmlHttpRequest.send(null);//将设置信息发送到Ajax引擎
                		   })()
                	}
//                    $("#content > li:nth-child("+(i+1)+") > a:nth-child(1)").html(result.toString());
                }else{
                    alert("请求失败，错误码=" + xmlHttpRequest.status);
                }
            }
        };
        xmlHttpRequest.send(null);//将设置信息发送到Ajax引擎
	   }
}