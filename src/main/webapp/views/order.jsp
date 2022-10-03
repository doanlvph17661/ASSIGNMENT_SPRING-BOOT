<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<div>
	<form action="/Assignment/orderStore" method="post">
		<div class="form-group">
			<label>Ho ten</label>
			<input class="form-control" name="fullname" value="${account.fullname}">
		</div>
		<div class="form-group">
			<label>Dia chi</label>
			<input class="form-control" name="address" value="${account.address}">
		</div>
		<div class="form-group">
			<label>sdt</label>
			<input class="form-control" name="sdt" value="${ account.sdt }">
		</div>
		<button class="btn btn-primary">DAT HANG</button>
	</form>
</div>