<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>添加老师</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="format-detection" content="telephone=no">

<link rel="stylesheet"
	href="${pageContext.request.contextPath }/jsp/admin/plugins/layui/css/layui.css"
	media="all" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/jsp/admin/plugins/font-awesome/css/font-awesome.min.css">
</head>

<body>
	<div style="margin: 15px;">
		<fieldset class="layui-elem-field layui-field-title"
			style="margin-top: 20px;">
			<legend>添加教师</legend>
		</fieldset>

		<form class="layui-form" action="${pageContext.request.contextPath }/admin/addTeacher.do" method="post">
			<div class="layui-form-item">
				<label class="layui-form-label">职工编号</label>
				<div class="layui-input-block">
					<input type="text" name="userNumber" 
						lay-verify="number" autocomplete="off" placeholder="请输入职工编号"
						class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label">用 户 名</label>
				<div class="layui-input-block">
					<input type="text" name="userName"
						lay-verify="required" placeholder="请输入" autocomplete="off"
						class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label">用户邮箱</label>
				<div class="layui-input-inline">
					<input type="text" name="email"
						lay-verify="email" autocomplete="off" class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label">电话号码</label>
				<div class="layui-input-inline">
					<input type="tel" name="phoneNumber"
						lay-verify="phone" placeholder="请输入密码" autocomplete="off"
						class="layui-input">
				</div>
			</div>
			<!-- <div class="layui-form-item">
				<label class="layui-form-label">性　　 别</label>
				<div class="layui-input-block">
					<input type="radio" name="sex" title="男" value="1" checked=""> 
					<input type="radio" name="sex" value="2" title="女">
				</div>
			</div> -->
			<div class="layui-form-item">
				<label class="layui-form-label">地　　址</label>
				<div class="layui-input-block">
					<input type="text" name="address" lay-verify="required"
						placeholder="请输入" autocomplete="off" class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<div class="layui-input-block">
					<button class="layui-btn" lay-submit="" lay-filter="demo1">
						<input class="layui-btn" type="submit" value="提交" />
					</button>
				</div>
			</div>
		</form>
	</div>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/jsp/admin/plugins/layui/layui.js"></script>
	<script>
		layui
				.use(
						[ 'form', 'layedit', 'laydate' ],
						function() {
							var form = layui.form(), layer = layui.layer, layedit = layui.layedit, laydate = layui.laydate;

							//创建一个编辑器
							var editIndex = layedit.build('LAY_demo_editor');
							//自定义验证规则
							form.verify({
								title : function(value) {
									if (value.length > 9) {
										return '教师编号至少10位';
									}
								}
							});
						});
	</script>
</body>

</html>