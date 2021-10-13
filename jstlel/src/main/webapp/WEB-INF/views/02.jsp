<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>scope(객체의 범위)</h4>
	${vo.no } <br />
	${vo.name } <br />
	
	=================================
	
	<h4>세션범위</h4>
	${sessionScope.vo.no } <br />
	${sessionScope.vo.name } <br />
</body>
</html>