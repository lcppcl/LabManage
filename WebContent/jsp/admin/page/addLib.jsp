<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath }/select2/bootstrap.min.css" />
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath }/select2/select2.min.css" />

<script type="text/javascript"
	src="${pageContext.request.contextPath }/select2/jquery-1.7.1.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/select2/select2.js"></script>
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
			$("#error").html("教室编号不能为空！");
			return false;
		}
		if (labName == null || userName == "") {
			$("#error").html("教室名称不能为空！");
			return false;
		}
		if (labAddress == null || labAddress == "") {
			$("#error").html("地址不能为空！");
			return false;
		}
		if (subject == null || subject == "") {
			$("#error").html("所属类别不能为空！");
			return false;
		}
		if (contain == null || contain == "") {
			$("#error").html("容量不能为空！");
			return false;
		}
		if (remark == null || remark == "") {
			$("#error").html("标注不能为空！");
			return false;
		}
		if (equipment == null || equipment == "") {
			$("#error").html("设备不能为空！");
			return false;
		}
		if (user == null || user == "") {
			$("#error").html("用户不能为空！");
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
				action="${pageContext.request.contextPath }/lab/addLab.do"
				method="post" onclick="return checkForm()">
				<table class="table table-bordered table-striped" width="800"
					border="none" cellspacing="0" cellpadding="0">
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
							<select class="combox" id="id_equipment" name="equipNumber">
								<optgroup>
									<c:forEach var="equip" items="${equipListForLab }">
										<option value="${equip.equipNumber}" id="equipNumber">${equip.name}</option>
									</c:forEach>
								</optgroup>
							</select>
						</div>
					</div>
					<div>
						<label>管理老师</label>
						<div>
							<select class="combox" id="id_user" name="userNumber">
								<optgroup>
									<c:forEach var="user" items="${userListForLab }">
										<option value="${user.userNumber }" id="userNumber">${user.userName}</option>
									</c:forEach>
								</optgroup>
							</select>
						</div>
					</div>
					<span><font color="red" id="error">${errorInfo }</font></span>
					<div>
						<div>
							<input type="submit" value="提交" />
						</div>
					</div>
				</table>
			</form>
		</fieldset>

	</div>
	<script type="text/javascript">
		$(function() {
			function formatState(state) {
				if (!state.id) {
					return state.text;
				}
				var $state = $('<span>' + state.text + '</span>');
				return $state;
			}
			;

			$('#id_equipment').select2({
				placeholder : "设备",
				templateResult : formatState,
				width : '256px'
			});
			$('#id_user').select2({
				placeholder : "老师",
				templateResult : formatState,
				width : '256px'
			});
		});
	</script>
</body>
</html>