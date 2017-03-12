<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="${pageContext.request.contextPath}/js/jquery-2.1.4.min.js"></script>
<script>
	function checkForm() {
		var equipNumber = $("#equipNumber").val();
		var name = $("#name").val();
		var number = $("#number").val();
		var fine = $("#fine").val();
		
		if (name == null || name == "") {
			$("#error").html("设备名称不能为空！");
			return false;
		}
		if (equipNumber == null || equipNumber == "") {
			$("#error").html("设备编号不能为空！");
			return false;
		}
		if (number == null || number == "") {
			$("#error").html("总数量不能为空！");
			return false;
		}
		if (fine == null || fine == "") {
			$("#error").html("可用数量不能为空！");
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
				action="${pageContext.request.contextPath }/equip/addEquip.do"
				method="post" onclick="return checkForm()">
				<div>
					<label>器材编号</label>
					<div>
						<input type="text" name="equipNumber" id="equipNumber">
					</div>
				</div>
				<div>
					<label>器材名称</label>
					<div>
						<input type="text" name="name" id="name">
					</div>
				</div>
				<div>
					<label>器材数量</label>
					<div>
						<input type="text" name="number" id="number">
					</div>
				</div>
				<div>
					<label>可用的数量</label>
					<div>
						<input type="text" name="fine" id="fine">
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