<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="form" %>
	<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>


	<form:form
		method="POST"
		action="/Assignment/admin/products/store"
		modelAttribute="product" enctype="multipart/form-data">
		<div class="form-group">
		<label>Category</label>
		<form:select path="" name="cate_id">
				<c:forEach items="${data}" var="cate">
					<form:option class="form-control" value="${cate.id}"> ${cate.name}</form:option>
				</c:forEach>
			</form:select>
		
		</div>
		<div class="form-group">
			<label>Name</label>
			<form:input path="name" class="form-control"/>
		</div>
		<div class="form-group">
			<label>Image</label>
			<form:input path="" name="upload1" type="file" class="form-control"/>
		</div>
		<div class="form-group">
			<label>Price</label>
			<form:input path="price" class="form-control"/>
		</div>

		<div class="form-group">
			<label>Available</label>
			<form:input class="form-control" path="available" />
		</div>

		<button>Save</button>
	</form:form>
