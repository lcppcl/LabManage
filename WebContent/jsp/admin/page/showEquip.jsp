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
			<th>器材编号</th>
			<th>器材名称</th>
			<th>器材数量</th>
			<th>可用的数量</th>
			<th>引入时间</th>
			<th>维修时间</th>
			<th>操作</th>
		</tr>
		</thead>

		<tbody>
			<c:forEach var="equip" items="${equipList }">
				<tr>
					<td>${equip.equipNumber }</td>
					<td>${equip.name }</td>
					<td>${equip.number }</td>
					<td>${equip.fine }</td>
					<td>${equip.inDate }</td>
					<td>${equip.repair }</td>
					<td><a
						href="${pageContext.request.contextPath }/equip/deleteById.do?id=${equip.id }"><button>删除</button>
							<a
							href="${pageContext.request.contextPath }/equip/findById.do?id=${equip.id }"><button>修改</button></td>
				</tr>
			</c:forEach>
		</tbody>

	</table>
</div>

</html>