function prove(input,article,sign,style){
	if (input==""){
		alert("标题不能为空");
		return false;
	}
	if (article==""){
		alert("文章不能为空");
		return false;
	}
	if(sign==""){
		alert("标签不能为空");
		return false;
	}
	if(style==""){
		alert("必须选择一个类型");
		return false;
	}
	if(sign.split(",")){
		var cc = sign.split(",");
		for (var i = cc.length;i >0;i--){
			for (var j=i-1;j >0;j--){
				if (cc[i-1]==cc[j-1]){
					alert("用逗号分隔的标签应该不同");
					return false;
				}
			}
		}
	}
	
}