<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script
	src="${pageContext.request.contextPath}/lib/jquery/jquery-1.11.1.js"
	type="text/javascript"></script>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/lib/bootstrap/css/bootstrap.min.css" />
</head>
<body>
	<form action="${pageContext.request.contextPath}/update" method="post">
		<input type="hidden" name="id" value="${student.id}"/>
		<div class="form-group">
		  	名字
		 	<input type="text" name="name" value="${student.name}" class="form-control" >
		</div>
		<div class="form-group">
		  	年龄
		 	<input type="text" name="age" value="${student.age}" class="form-control" >
		</div>
		<button type="submit" class="btn btn-primary">Submit</button>
	</form>
</body>
</html>