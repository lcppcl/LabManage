<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title></title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Credit Login / Register Form Responsive Widget,Login form widgets, Sign up Web forms , Login signup Responsive web form,Flat Pricing table,Flat Drop downs,Registration Forms,News letter Forms,Elements" />
<script type="application/x-javascript">
	
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 

</script>
<!-- Custom Theme files -->
<link
	href="${pageContext.request.contextPath }/css/font-awesome.min.css"
	rel="stylesheet" type="text/css" media="all">
<link href="${pageContext.request.contextPath }/css/popuo-box.css"
	rel="stylesheet" type="text/css" media="all" />
<link href="${pageContext.request.contextPath }/css/style.css"
	rel="stylesheet" type="text/css" media="all" />
<!-- //Custom Theme files -->
<!-- web font -->
<link href="//fonts.googleapis.com/css?family=Oswald:400,700"
	rel="stylesheet">
<link href="//fonts.googleapis.com/css?family=Open+Sans:300,400,600,700"
	rel="stylesheet">

<!-- //web font -->
</head>
<body>
	<h1>Credit Login / Register Form</h1>
	<div class="main-agileits">
		<!--form-stars-here-->
		<div class="form-w3-agile">
			<h2>Credit login form</h2>
			<form action="${pageContext.request.contextPath }/user/login.do"
				method="post">
				<div class="form-sub-w3">
					<input type="text" name="userNumber" value="${user.userNumber }"
						placeholder="Customer number" required="" />
					<div class="icon-w3">
						<i class="fa fa-user" aria-hidden="true"></i>
					</div>
				</div>
				<div class="form-sub-w3">
					<input type="password" name="password" value="${user.password }"
						placeholder="Password" required="" />
					<div class="icon-w3">
						<i class="fa fa-unlock-alt" aria-hidden="true"></i>
					</div>
				</div>
				<!-- <p class="p-bottom-w3ls">
					Are you new to eBanking?<a class="w3_play_icon1"
						href="#small-dialog1"> Register here</a>
				</p> -->

				<div class="submit-w3l">
					<input type="submit" value="Login">
				</div>
				<div>
					<font color="red">${errorMsg }</font>
				</div>
			</form>
		</div>
		<!--//form-ends-here-->
	</div>
	<!-- copyright -->
	<div class="copyright w3-agile">
		<p>© 2017 Credit Login / Register Form . All rights reserved</p>
	</div>
	<!-- //copyright -->
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/js/jquery-2.1.4.min.js"></script>
	<!-- pop-up-box -->
	<script
		src="${pageContext.request.contextPath }/js/jquery.magnific-popup.js"
		type="text/javascript"></script>
	<!--//pop-up-box -->
	<script>
		$(document).ready(function() {
			$('.w3_play_icon,.w3_play_icon1,.w3_play_icon2').magnificPopup({
				type : 'inline',
				fixedContentPos : false,
				fixedBgPos : true,
				overflowY : 'auto',
				closeBtnInside : true,
				preloader : false,
				midClick : true,
				removalDelay : 300,
				mainClass : 'my-mfp-zoom-in'
			});

		});
	</script>
</body>
</html>