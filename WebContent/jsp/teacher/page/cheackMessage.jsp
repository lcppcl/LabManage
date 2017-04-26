<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta name="keywords" content="scclui框架">
<meta name="description" content="scclui为轻量级的网站后台管理系统模版。">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta http-equiv="Cache-Control" content="no-siteapp" />
<title>首页</title>
</head>
<body>
	<form
		action="${pageContext.request.contextPath }/teacher/updateById.do"
		method="post" onclick="return checkForm()">
		<input type="text" name="id" id="id" value="${resultUser.id }"
			style="display: none"> <input type="text" name="status"
			id="status" value="${resultUser.status }" style="display: none">
		<div>
			<label>职工编号</label>
			<div>
				<input type="text" name="userNumber" id="userNumber"
					value="${resultUser.userNumber }" readonly>
			</div>
		</div>
		<div>
			<label>用 户 名</label>
			<div>
				<input type="text" name="userName" id="userName"
					value="${resultUser.userName }">
			</div>
		</div>
		<div>
			<label>用户邮箱</label>
			<div>
				<input type="text" name="email" id="email"
					value="${resultUser.email }">
			</div>
		</div>
		<div>
			<label>密码</label>
			<div>
				<input type="text" name="password" id="password"
					value="${resultUser.password }">
			</div>
		</div>
		<div>
			<label>地 址</label>
			<div>
				<input type="text" name="address" id="address"
					value="${resultUser.address }">
			</div>
		</div>
		<div>
			<label>电话号码</label>
			<div>
				<input type="text" name="phoneNumber" id="phoneNumber"
					value="${resultUser.phoneNumber }">
			</div>
		</div>
		<div>
			<label>性 别</label>
			<div>
				<c:choose>
					<c:when test="${resultUser.sex } == '男'">
						<input type="radio" id="sex" name="sex" value="男" checked=""
							value="${resultUser.sex }">
						<label for="sex">男</label>
						<input type="radio" id="sex" name="sex" value="女" title="女"
						value="${resultUser.sex }">
						<label for="sex">女</label>
					</c:when>
					<c:otherwise>
						<input type="radio" id="sex" name="sex" value="男"
							value="${resultUser.sex }">
						<label for="sex">男</label>
						<input type="radio" id="sex" name="sex" value="女" title="女"
							checked=""  value="${resultUser.sex }">
						<label for="sex">女</label>
					</c:otherwise>
				</c:choose>



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
