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
		var number = $("#number").val();
		var equipNumber = $("#equipNumber").val();
		var name = $("#name").val();
		var fine = $("#fine").val();
		
		if (number == null || number == "") {
			$("#error").html("数量不能为空！");
			return false;
		}
		if (equipNumber == null || equipNumber == "") {
			$("#error").html("器材编号不能为空！");
			return false;
		}
		if (name == null || name == "") {
			$("#error").html("名称不能为空！");
			return false;
		}
		if (fine == null || fine == "") {
			$("#error").html("维修数量不能为空！");
			return false;
		}
		return true;
	}
</script>
</head>
<body>
	<form
		action="${pageContext.request.contextPath }/equip/updateById.do"
		method="post" onclick="return checkForm()">
		<input type="text" name="id" id="id"
			value="${currentEquip.id }" style="display:none"> 
		<input type="text"
			name="inDate" id="inDate" value="${currentEquip.inDate }"
			style="display:none">
		
		<div>
			<label>器材编号</label>
			<div>
				<input type="text" name="equipNumber" id="equipNumber"
					value="${currentEquip.equipNumber }" readonly>
			</div>
		</div>
		<div>
			<label>器材名称</label>
			<div>
				<input type="text" name="name" id="name"
					value="${currentEquip.name }">
			</div>
		</div>
		<div>
			<label>器材数量</label>
			<div>
				<input type="text" name="number" id="number"
					value="${currentEquip.number }">
			</div>
		</div>
		<div>
			<label>好的器材数量</label>
			<div>
				<input type="text" name="fine" id="fine"
					value="${currentEquip.fine }">
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