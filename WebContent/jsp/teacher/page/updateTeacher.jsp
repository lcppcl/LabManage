<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
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
	<form
		action="${pageContext.request.contextPath }/admin/updateById.do"
		method="post" onclick="return checkForm()">
		<input type="text" name="id" id="id"
			value="${currentUser.id }" style="display:none"> 
		<input type="text"
			name="status" id="status" value="${currentUser.status }"
			style="display:none">
		<div>
			<label>职工编号</label>
			<div>
				<input type="text" name="userNumber" id="userNumber"
					value="${currentUser.userNumber }" readonly>
			</div>
		</div>
		<div>
			<label>用 户 名</label>
			<div>
				<input type="text" name="userName" id="userName"
					value="${currentUser.userName }">
			</div>
		</div>
		<div>
			<label>用户邮箱</label>
			<div>
				<input type="text" name="email" id="email"
					value="${currentUser.email }">
			</div>
		</div>
		<div>
			<label>电话号码</label>
			<div>
				<input type="text" name="phoneNumber" id="phoneNumber"
					value="${currentUser.phoneNumber }">
			</div>
		</div>

		<div>
			<label>地 址</label>
			<div>
				<input type="text" name="address" id="address"
					value="${currentUser.address }">
			</div>
		</div>
		<div>
			<label>密码</label>
			<div>
				<input type="text" name="password" id="password"
					value="${currentUser.password }">
			</div>
		</div>
		<div>
			<label>性 别</label>
			<div>
				<input type="radio" id="sex" name="sex" value="男" checked=""
					value="${currentUser.sex }"><label for="sex">男</label> <input
					type="radio" id="sex" name="sex" value="女" title="女"
					value="${currentUser.sex }"><label for="sex">女</label>
			</div>
		</div>
		<span><font color="red" id="error">${errorInfo }</font></span>
		<div>
			<div>
				<input type="submit" value="提交" />
			</div>
		</div>
	</form>
</body>
</html>