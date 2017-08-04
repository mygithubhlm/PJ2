function check(str) {
	var x=document.getElementById(str);
	var y=document.getElementById(str+"Check");
	if (str=="name") {
		if (x.value=="") {
			y.hidden = false;
		}
		else {
			y.hidden = true;
		}
	}else if (str=="account") {
		var reg = /[^a-zA-Z0-9_]/;//或者是/W/
		
		if ((x.value.length<2)||(x.value.length>14)||(reg.test(x.value)===true)) {
			y.hidden = false;
		}
		else {
			y.hidden = true;
		}
	}else if (str=="password") {
		var reg2 = /^(?!\d+$)[\da-zA-Z]+$/;
		
		if ((x.value.length<6)||(reg2.test(x.value)===false)) {
			y.hidden = false;
		} 
		else 
			y.hidden = true;
	}else if (str=="cpassword") {
		var z = document.getElementById("password").value;
		var x = x.value;
		if (x!=z) {
			y.hidden = false;
		}
		else 
			y.hidden = true;
	}else if (str=="email") {
		var p = x.value.indexOf("@");
		if (p == -1) {
			y.hidden = false;
		}
		else 
			y.hidden = true;
	}
	return y.hidden;
}

function validate() {
	var trr = ["name","account","password","cpassword","email"];
//	var exist = handle.CheckAccount(thisform.form1.Account.value);
	//alert("jfdjfij");
	var i = 0;
	var submitOk = true;
//	$.ajax({
//		url:"Handle2.java?account='wwww'",
//		dataType: "JSON",
//	    success: function(data) {
//	        var info = data.info;
//	        var have = info.have;
//	        alert(have);
//	      }
//	});
	while (i<5) {
		if (!check(trr[i])){
			alert(trr[i]+"wrong!");
			submitOk = false;
			break;
		}
		i++;
	}
	if (submitOk) {
//		alert("提交成功！");
		return true;
	}
	else 
		alert("提交失败！");
		return false;
}