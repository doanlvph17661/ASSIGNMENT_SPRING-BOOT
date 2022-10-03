
     <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="form" %>

	<form:form
		method="POST"
		action="/Assignment/admin/accounts/update/${account.id }"
		modelAttribute="account">
		<div class="form-group">
			<label>Fullname</label>
			<form:input path="fullname" class="form-control"/>
		</div>
			<div class="form-group">
			<label>SĐT</label>
			<form:input path="sdt" class="form-control" />
		</div>
		
		<div class="form-group" >
			<label class="text-dark">Email</label>
			<form:input path="email" type="email" class="form-control"/>
		</div>
		
		<div class="form-group">
			<label>Địa chỉ</label>
			<form:input path="address" class="form-control"/>
		</div>
		<div class="form-group">
			<label>Photo</label>
			<form:input path="" name="upload"class="form-control"/>
		</div>
		<button>Save</button>
	</form:form>

