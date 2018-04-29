<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/res/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
	function check() {
		$.ajax({
			url : "/ChineseJson",
			data : {},
			type : "POST",
			dataType : "json",
			async : true,
			cache : false,
			success : function(result) {
				alert(result.msg);
			},
			error : function(error) {
				console.log(error);
			}
		});

	}
</script>
</head>
<body>
	<button onclick="check();">json中文传值</button>
</body>
</html>