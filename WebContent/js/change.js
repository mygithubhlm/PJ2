function zcjc(yhm,mm,qm1){
	var str = mm;
	var str1 =qm1;
	var right = true;
	 for (var i = str.length - 1; i >= 0; i--) {
		    if (str.charCodeAt(i) < 32 || str.charCodeAt(i) > 126){
		          alert('密码只能用字母和数字或者符号');
		          document.zc.mm.focus();
		          return false;
		    }
		    
		    if (str.charCodeAt(i) < 48 || str.charCodeAt(i) > 57){
		    	right = false;
		    }
		  };
		  if (right == true && str.length>0){
			  alert('密码不能只用纯数字');
		      document.zc.mm.focus();
		      return false;
		  }

	 for (var i = str1.length - 1; i >= 0; i--) {
		    if (str1.charCodeAt(i) < 32 || str1.charCodeAt(i) > 126){
		          alert('密码只能用字母和数字或者符号');
		          document.zc.mm.focus();
		          return false;
		    }
		    
		    if (str1.charCodeAt(i) < 48 || str1.charCodeAt(i) > 57){
		    	right = false;
		    }
		  };
		  if (right == true && str1.length>0){
			  alert('密码不能只用纯数字');
		      document.zc.mm.focus();
		      return false;
		  }
		  var str1 = yhm;
		  for (var i = str1.length - 1; i >= 0; i--) {
			    if((str1.charCodeAt(i) < 48 || (str1.charCodeAt(i) > 57 && str1.charCodeAt(i) < 65) ||
			    		(str1.charCodeAt(i) > 90 && str1.charCodeAt(i) < 97) || str1.charCodeAt(i) > 122)
			    		&&str1.charCodeAt(i)!=95){
			          alert('账号只能用字母，数字和下划线');
			          document.zc.yhm.focus();
			          return false;
			    }
			  };
		 if (yhm.length > 14 ||(0< yhm.length&&yhm.length <2)) 
		  {
		    alert('账号在2到14个字符之间');
		    document.zc.yhm.focus();
		    return false;
		  }
		 if(yhm=="")
		 {
		  alert('账号不能为空!');
		  document.zc.yhm.focus();
		  return false;
		 }
		 if(yhm.indexOf("'")>=0 ||yhm.indexOf("<")>=0 ||yhm.indexOf(">")>=0 ||yhm.indexOf(".")>=0)
		 {
		  alert('用户名不能有乱码!');
		  document.zc.yhm.focus();
		  return false;
		 }
		 if(str=="")
		 {
		  alert('密码不能为空!');
		  document.zc.mm.focus();
		  return false;
		 }
		 if(mm.indexOf("'")>=0 ||mm.indexOf("<")>=0 ||mm.indexOf(">")>=0 ||mm.indexOf(".")>=0)
		 {
		  alert('不能有乱码!');
		  document.zc.mm.focus();
		  return false;
		 }
		 if(0<str.length&&str.length< 6)
		 {
		  alert('密码不能少于六个字符');
		  document.zc.mm.focus();
		  return false;
		 };
		 if (mm==qm1){
				alert('新密码与旧密码应该不同');
				document.zc.mm.focus();
				return false;
			} 
}
window.onload=function(){
	var url = document.location.search;
	var arr = url.split('&');
	var ar = arr[0].split('=');
	var ar1 = arr[1].split('=');
	if (ar[0]=='?number' && ar1[0]=='password'){
		if (ar[1]=='1')
			alert("该账号不存在，请输入您的账号");
		else if(ar[1]=="2")
			alert("您什么也没改。请重新输入");
		else if(ar[1]=='3')
			alert("路径有问题！");
		else if(ar1[1]=='1')
			alert("账号与原密码不匹配，请重新输入");
		else if(ar1[1]=='2')
			alert("新密码存在问题，如果您想要上传头像，那么头像已更改");
		window.history.pushState({},0,'change.html');
	}	
	}

