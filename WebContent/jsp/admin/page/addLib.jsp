<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script>
	function checkForm() {
		var labNumber = $("#labNumber").val();
		var labName = $("#labName").val();
		var labAddress = $("#labAddress").val();
		var remark = $("#remark").val();
		var subject = $("#subject").val();
		var contain = $("#contain").val();
		var equipment = $("#equipment").val();
		var user = $("#user").val();

		if (labNumber == null || labNumber == "") {
			$("#error").html("老师帐号不能为空！");
			return false;
		}
		if (labName == null || userName == "") {
			$("#error").html("老师姓名不能为空！");
			return false;
		}
		if (labAddress == null || labAddress == "") {
			$("#error").html("地址不能为空！");
			return false;
		}
		if (subject == null || subject == "") {
			$("#error").html("地址不能为空！");
			return false;
		}
		if (contain == null || contain == "") {
			$("#error").html("地址不能为空！");
			return false;
		}
		if (remark == null || remark == "") {
			$("#error").html("地址不能为空！");
			return false;
		}
		if (equipment == null || equipment == "") {
			$("#error").html("地址不能为空！");
			return false;
		}
		if (user == null || user == "") {
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
					<label>容纳人数</label>
					<div>
						<input type="text" name="contain" id="contain">
					</div>
				</div>
				<div>
					<label>设备</label>
					<div>
						<input type="text" name="equipment" id="equipment">
					</div>
				</div>
				<div>
					<label>管理老师</label>
					<div>
						<input type="text" name="user" id="user">
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