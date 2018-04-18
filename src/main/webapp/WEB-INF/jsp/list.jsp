<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
	
	<script src="${pageContext.request.contextPath}/lib/jquery/jquery-1.11.1.js" type="text/javascript"></script>
	<link rel="stylesheet" type="text/css"
		href="${pageContext.request.contextPath}/lib/bootstrap/css/bootstrap.min.css" />
	<script type="text/javascript">
		function deleteById(id) {
			var isConfirmDelete = confirm("确认要删除么？");
			if (isConfirmDelete) {
				location.href = "${pageContext.request.contextPath}/deleteById?id=" + id;
			}
		}
		
	</script>
	<style type="text/css">
		table{
			margin: 0 auto
		}
	</style>
</head>
<body>
	<a class="btn btn-primary" href="${pageContext.request.contextPath}/getAddPage">添加学生</a>
	<table class="table table-hover">
		<thead>
			<tr>
				<th>ID</th>
				<th>名字</th>
				<th>年龄</th>
				<th>删除</th>
				<th>修改</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="student">
				<tr>
					<td>${student.id}</td>
					<td>${student.name}</td>
					<td>${student.age}</td>
					<td><a href="javascript:deleteById(${student.id})">删除</a></td>
					<td><a href="${pageContext.request.contextPath}/toUpdate?id=${student.id}">修改</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>