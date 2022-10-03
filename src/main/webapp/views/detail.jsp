<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<div class="container" style="margin-top:90px">
	<div class="row">
		<div class="col-2"></div>
		<div class="col-5">
			<img class="text-center" src="/Assignment/storage/${product.image}" width="450px" height="450px">
		</div>
		<div class="col-3 mt-3">
		<form action="/Assignment/orderDetail/createCart/${product.id}" method="post" >
			
				<h1>${product.name}</h1>
				<h3 class="text-danger fw-bold">Đơn giá: ${product.price} VNĐ</h3>
			
					
				
				
				<label>Số lượng</label>
				<input type="number" min="1" value="1" max="${product.available}" class="form-control" name="soLuong">
					
				
				<button class="btn btn-warning mt-3">Thêm vào giỏ hàng</button>
		</form>
		
		</div>
		<div class="col-2">
		</div>
	</div>
	
</div>
