window.onload=function(){
	var url = document.location.search;
	var ars= url.split('=');
	if (ars[0]=="?number"){
		if (ars[1]!=""){
			 var xmlHttpRequest = null;
//			 alert(ar[1]);//验证
		        var url = "GetArticleServlet?name=" + ars[1];
		        if (window.XMLHttpRequest) {//表示当前浏览器不是IE
		            xmlHttpRequest = new XMLHttpRequest();
		        } else if (window.ActiveXObject) {
		            xmlHttpRequest = new ActiveXObject("Microsoft.XMLHTTP");
		        }
		        xmlHttpRequest.open("GET", url, true);
		        //设置请求方式为GET，设置请求的URL，设置为异步提交
		        xmlHttpRequest.onreadystatechange = function(){
		        	//将方法地址复制给onreadystatechange属性
		            if(xmlHttpRequest.readyState == 4){//Ajax引擎状态为成功
		                if(xmlHttpRequest.status == 200){//HTTP协议状态	为成功
		                    if(xmlHttpRequest.responseText != "true"){
		                     	if (xmlHttpRequest.responseText.split("$&$")){
			                    	var arr=xmlHttpRequest.responseText.split("$&$");
			                    	//alert(arr);
			                    	$("#name").html(arr[0]);
			                    	var information = arr[0].split("<");
			                    	var information1 = "";
			                    	for (var i = 3;i<information[0].length;i++)
			                    		information1 += information[0][i];
			                    	$("h1").html(information1 + "的博客");
			                    	$("#name").next("p").html("各位小伙伴们大家好，我是"+information1+"。" +
			                    			"欢迎来到我的博客。");
			                    $("#head").attr("src",arr[1]);
			                    var style=arr[2].split(",");
			                    var ar=arr[3].split("$#$");
			                    //alert(ar);                                                                                                                                                                                                                      
			                    var d;
			                    var array;
			                    //alert(ar.length);
			                    //下面是采取与数据库相关的排序方式
			                    for (var c=ar.length-2;c>=0;c--){
			                    	d=c;
			                    	array= ar[d].split("$%$");
			                    //	alert(array[0]);
			                    	if (ar.length-1-d<=4){
			                    	$("#h4"+(ar.length-1-d)).html(array[4]
			                    	+"<span>("+array[0]+")</span>");
			                    	$("div#fourthdiv>p#sign"+(ar.length-1-d)).html("标签:" +
			                    			"<a href='http://www.baidu.com'><span class='blue'>" +
			                    			array[3]+"</span></a>" +"        分类：<a href='http://www.baidu.com'>" +
			                    					"<span class='blue'>"+array[2]+"</span></a>");
			                    	$("#article"+(ar.length-1-d)).html(array[1]);
			                    }
			                    }
			                    $("#secondul").append("<li><span>全部博文</span>(" + (ar.length-1)+")</li>");
			                    var b;
			                    var e;
			                  //  alert(style.length);
			                    for (var a=style.length-1;a>=0;a--){
			                    	b=a;
			                    	var p=0;
			                        for (var c=ar.length-2;c>=0;c--){
			                        	e=c;
			                        	array= ar[e].split("$%$");
			                        	if (array[2]==style[b]){
			                        		p++;
			                        	}
			                        }
			                        $("#secondul").append("<li><span>" + style[b] +"</span>(" +(p)+")</li>");
			                        }
			                    }
			                  
		                    }
		                    }else{
		                    userfield.focus();
		                    }
		                    }
		                else{
		                    alert("请求失败，错误码=" + xmlHttp.status);
		                }
		        };
		        xmlHttpRequest.send(null);//将设置信息发送到Ajax引擎
		    }else{
		    }
		}
}
