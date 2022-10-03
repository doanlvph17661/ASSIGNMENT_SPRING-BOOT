
     <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>IT16308 - Create Account</title>
</head>
<body>
	<form:form
		method="POST"
		action="/Assignment/admin/categories/update/${category.id }"
		modelAttribute="category">
		<div>
			<label>Name</label>
			<form:input path="name" />
		</div>
<button>Save</button>
	</form:form>
</body>
</html>
