<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta name="keywords" content="scclui框架">
<meta name="description" content="scclui为轻量级的网站后台管理系统模版。">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta http-equiv="Cache-Control" content="no-siteapp" />
<title>添加老师</title>
<script src="${pageContext.request.contextPath}/js/jquery-2.1.4.min.js"></script>
<script>
	function checkForm() {
		var userNumber = $("#userNumber").val();
		var userName = $("#userName").val();
		var email = $("#email").val();
		var phoneNumber = $("#phoneNumber").val();
		var address = $("#address").val();
		var re = /^(\w-*\.*)+@(\w-?)+(\.\w{2,})+$/; /* 邮箱 */
		var re2 = /^1\d{10}$/;/* 手机 */
		
		if (userNumber == null || userNumber == "") {
			$("#error").html("老师帐号不能为空！");
			return false;
		}
		if (userName == null || userName == "") {
			$("#error").html("老师姓名不能为空！");
			return false;
		}
		if (!re.test(email)) {
			$("#error").html("邮箱不正确！");
			return false;
		}
		if (!re2.test(phoneNumber)) {
			$("#error").html("手机号码不正确！");
			return false;
		}
		if (address == null || address == "") {
			$("#error").html("地址不能为空！");
			return false;
		}
		return true;
	}
</script>

</head>

<body>
	<div style="margin: 15px;">
		<fieldset style="margin-top: 20px;">
			<legend>添加教师</legend>
			<form action="${pageContext.request.contextPath }/admin/addTeacher.do"
			method="post" onclick="return checkForm()">
			<div>
				<label>职工编号</label>
				<div>
					<input type="text" name="userNumber" id="userNumber">
				</div>
			</div>
			<div>
				<label>用 户 名</label>
				<div>
					<input type="text" name="userName" id="userName">
				</div>
			</div>
			<div>
				<label>用户邮箱</label>
				<div>
					<input type="text" name="email" id="email">
				</div>
			</div>
			<div>
				<label>电话号码</label>
				<div>
					<input type="text" name="phoneNumber" id="phoneNumber">
				</div>
			</div>

			<div>
				<label>地 址</label>
				<div>
					<input type="text" name="address" id="address">
				</div>
			</div>
			<div>
				<label>性 别</label>
				<div>
					<input type="radio" id="sex" name="sex" value="男" checked=""><label
						for="sex">男</label> <input type="radio" id="sex" name="sex"
						value="女" title="女"><label for="sex">女</label>
				</div>
			</div>
			<span><font color="red" id="error">${errorInfo }</font></span>
			<div>
				<div>
					<input type="submit" value="提交" />
				</div>
			</div>
		</form>
		</fieldset>


		
	</div>
</body>

</html>