<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/datatables/jquery.dataTables.css">

<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/jquery-2.1.4.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/datatables/jquery.dataTables.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$('#table_id_example').DataTable();
	});
</script>

</head>

<div>

	<table id="table_id_example" class="display">
		<thead>
		<tr>
			<th>职工号</th>
			<th>职工姓名</th>
			<th>电子邮箱</th>
			<th>性别</th>
			<th>地址</th>
			<th>电话号码</th>
			<th>操作</th>
		</tr>
		</thead>

		<tbody>
			<c:forEach var="user" items="${userList }">
				<tr>
					<td>${user.userNumber }</td>
					<td>${user.userName }</td>
					<td>${user.email }</td>
					<td>${user.sex }</td>
					<td>${user.address }</td>
					<td>${user.phoneNumber }</td>
					<td><a
						href="${pageContext.request.contextPath }/admin/deleteById.do?id=${user.id }"><button>删除</button>
							<a
							href="${pageContext.request.contextPath }/admin/findById.do?id=${user.id }"><button>修改</button></td>
				</tr>
			</c:forEach>
		</tbody>

	</table>
</div>

</html>