<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>scope 생명주기 확인</title>
</head>
<body>
	<h3>page : ${pageScore.str}</h3>
	<h3>request : ${requestScore.str}</h3>
	<h3>session : ${sessionScore.str}</h3>
	<h3>application : ${application.str}</h3>

</body>
</html>