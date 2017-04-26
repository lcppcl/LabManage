<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
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
<body>
	<div>
		<table id="table_id_example" class="display">
			<thead>
				<tr>
					<th>实验室编号</th>
					<th>实验室名称</th>
					<th>地址</th>
					<th>详情</th>
					<th>所属类别</th>
					<th>容纳人数</th>
					<th>设备</th>
				</tr>
			</thead>

			<tbody>
				<c:choose>
					<c:when test="${labList == null }">没有管理的实验室</c:when>
					<c:otherwise>
						<c:forEach var="lab" items="${labList }">
							<tr>
								<td>${lab.labNumber }</td>
								<td>${lab.labName }</td>
								<td>${lab.labAddress }</td>
								<td>${lab.remark }</td>
								<td>${lab.subject }</td>
								<td>${lab.contain }</td>
								<td>${lab.equipNumber }</td>
							</tr>
						</c:forEach>
					</c:otherwise>
				</c:choose>

			</tbody>

		</table>
	</div>
</body>
</html>