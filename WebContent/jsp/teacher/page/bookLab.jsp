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
</head>
<body>
	<div style="margin: 15px;">
		<fieldset style="margin-top: 20px;">
			<legend>实验室预定</legend>
			<form action="#" method="post">
				<table class="table table-bordered table-striped" width="800"
					border="none" cellspacing="0" cellpadding="0">
					<div>
						<label>实验室名称</label>
						<div>
							<select class="combox" id="id_bookLab" name="labName">
								<optgroup>
									<c:forEach var="lab" items="${labList }">
										<option value="${lab.labName}" id="labName">${lab.labName}</option>
									</c:forEach>
								</optgroup>
							</select>
						</div>
					</div>
					<div>
						<label>实验时间</label>
						<div>第
							<select class="combox" id="id_circumstance" name="circumstance">
								<optgroup>
									<c:forEach var="circum" items="${circumList }">
										<option value="${circum.name}" id="circumstance">${circum.name}</option>
									</c:forEach>
								</optgroup>
							</select>
							周
						</div>
						<div>周
							<select class="combox" id="id_week" name="week">
								<optgroup>
									<c:forEach var="week" items="${weekList }">
										<option value="${week.name}" id="week">${week.name}</option>
									</c:forEach>
								</optgroup>
							</select>
						</div>
						<div>第
							<select class="combox" id="id_lesson" name="lesson">
								<optgroup>
									<c:forEach var="lesson" items="${lessonList }">
										<option value="${lesson.name}" id="lesson">${lesson.name}</option>
									</c:forEach>
								</optgroup>
							</select>
							节
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

			$('#id_bookLab').select2({
				placeholder : "实验室名称",
				templateResult : formatState,
				width : '256px'
			});
			
			$('#id_circumstance').select2({
				placeholder : "第几周",
				templateResult : formatState,
				width : '256px'
			});
			
			$('#id_week').select2({
				placeholder : "星期几",
				templateResult : formatState,
				width : '256px'
			});
			$('#id_lesson').select2({
				placeholder : "第几节",
				templateResult : formatState,
				width : '256px'
			});
		});
	</script>
</body>
</html>