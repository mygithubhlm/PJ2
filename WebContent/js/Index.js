/**
 * 
 */
function shi(canshu) {
//	alert(canshu);
//	if (userfield.value.length != 0) {
        var xmlHttpRequest = null;
        var url = "HandleText?name=" + canshu;
//        var usermsg = document.getElementById("usermsg");
        if (window.XMLHttpRequest) {//表示当前浏览器不是IE
            xmlHttpRequest = new XMLHttpRequest();
        } else if (window.ActiveXObject) {
            xmlHttpRequest = new ActiveXObject("Microsoft.XMLHTTP");
        }
//        alert(canshu);
        xmlHttpRequest.open("GET", url, true);//设置请求方式为GET，设置请求的URL，设置为异步提交
//        alert(canshu);
        xmlHttpRequest.onreadystatechange = function(){//将方法地址复制给onreadystatechange属性
//        	alert(canshu);
            if(xmlHttpRequest.readyState == 4){//Ajax引擎状态为成功
            	alert(canshu);
                if(xmlHttpRequest.status == 200){//HTTP协议状态为成功
                	alert(canshu);
                	alert(xmlHttpRequest.responseText);
//                    if(xmlHttpRequest.responseText != "true"){
//                    usermsg.innerHTML = "恭喜您，用户名可以使用。 ";
//                    }else{
//                    usermsg.innerHTML = "<font color='red'>" + "该用户名已被注册" + "</font>";
//                    userfield.focus();
//                    }
                }else{
                    alert("请求失败，错误码=" + xmlHttp.status);
                }
            }
        };
        xmlHttpRequest.send(null);//将设置信息发送到Ajax引擎
    }
//else{
//        usermsg.innerHTML = "";
//    }
//	alert("dksj");
//	$.ajax({
//		url:"HandleText?name="+canshu,
//		dateType:"text",
//		success: function(date){
////			var result = $(data);
//			alert(result);
//		}
//		});
//	
	
//}