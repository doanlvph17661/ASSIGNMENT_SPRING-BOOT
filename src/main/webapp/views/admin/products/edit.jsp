
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
		action="/Assignment/admin/products/update/${product.id }"
		modelAttribute="product">
		<div class="form-group">
			<label>Name</label>
			<form:input class="form-control" path="name" />
		</div>
		<div class="form-group">
			<label>Image</label>
			<form:input path="image" class="form-control"/>
		</div>
		<div class="form-group">
			<label>Price</label>
			<form:input class="form-control" path="price" />
		</div>
		<div class="form-group">
			<label>Available</label>
			<form:input class="form-control" path="available" />
		</div>
<button>Save</button>
	</form:form>
</body>
</html>
