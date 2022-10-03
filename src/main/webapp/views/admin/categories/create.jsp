<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="form" %>

	<form:form
		method="POST"
		action="/Assignment/admin/categories/store"
		modelAttribute="category">
		<div>
			<label>Name</label>
			<form:input path="name" />
		</div>
		<button>Save</button>
	</form:form>
