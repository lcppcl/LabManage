<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
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
			<legend>添加实验室</legend>


			<form
				action="${pageContext.request.contextPath }/admin/addTeacher.do"
				method="post" onclick="return checkForm()">
				<div>
					<label>实验室编号</label>
					<div>
						<input type="text" name="labNumber" id="labNumber">
					</div>
				</div>
				<div>
					<label>用实验室名</label>
					<div>
						<input type="text" name="labName" id="labName">
					</div>
				</div>
				<div>
					<label>实验室地址</label>
					<div>
						<input type="text" name="labAddress" id="labAddress">
					</div>
				</div>
				<div>
					<label>详细介绍</label>
					<div>
						<input type="text" name="remark" id="remark">
					</div>
				</div>

				<div>
					<label>所属类别</label>
					<div>
						<input type="text" name="subject" id="subject">
					</div>
				</div>
				<div>
					<label>地址</label>
					<div>
						<input type="text" name="address" id="address">
					</div>
				</div>
				<div>
					<label>容纳人数</label>
					<div>
						<input type="text" name="contain" id="contain">
					</div>
				</div>
				<div>
					<label>容纳人数</label>
					<div>
						<input type="text" name="contain" id="contain">
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
</html>