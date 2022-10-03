<%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<form:form
		method="POST"
		action="/Assignment/admin/accounts/store"
		modelAttribute="account" enctype="multipart/form-data">
		<div class="form-group">
			<label>Fullname</label>
			<form:input path="fullname" class="form-control" />
		</div>
			<div class="form-group">
			<label>SĐT</label>
			<form:input path="sdt" class="form-control" />
		</div>
		
		<div class="form-group">
			<label>Email</label>
			<form:input path="email" type="email" class="form-control"/>
		</div>
		<div class="form-group">
			<label>Địa chỉ</label>
			<form:input path="address" class="form-control"/>
		</div>
		<div class="form-group">
			<label>Password</label>
			<form:password path="password" class="form-control"/>
		</div>
		<div class="form-group">
			<label>Photo</label>
			<form:input   path="" name="upload" class="form-control" type="file" />
		</div>
		<div class="form-group">
			<label>Admin</label>
			<form:select path="admin" class="form-control">
				<form:option value="0">Member</form:option>
				<form:option value="1">Admin</form:option>
			</form:select>
		</div>
		<button>Save</button>
	</form:form>