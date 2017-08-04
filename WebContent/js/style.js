function prove(style){
	if (style==""){
		alert("分类名不能为空");
		return false;
	}
	var str=style;
	 for (var i = str.length - 1; i >= 0; i--) {
		    if (str.charCodeAt(i) == 44){
		          alert('不可以使用，逗号');
		          return false;
		    }
	 }
	 if(str.length>10){
		 alert("分类类型不得超过十个字符");
		 return false;
	 }
}
window.onload=function(){
	var url = document.location.search;
	var arr = url.split('&');
	if(arr[1]){
		ar1=arr[1].split('=');
		if(ar1[0]=='styleProve' && ar1[1]=='1'){
			alert("该类型已经存在了，请创建新类型");
		}
	}
	//下面这句用于改变当前页面的URL
	window.history.pushState({},0,'../html/style.html');
}