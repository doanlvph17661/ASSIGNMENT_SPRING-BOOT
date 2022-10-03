<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>


      
	<table class="table">
		<thead>
			<tr>
				<th>ID</th>
				<th>Order_ID</th>
				<th>ProductID</th>
				<th>Price</th>
				
				<th>Quantity</th>
			   		
				
			
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${ order }" var="acc">
			<tr>
				<td>${ acc.id }</td>
				<td>${ acc.order.fullname}</td>
				<td>${ acc.product.name }</td>
				<td>${ acc.price }</td>
				<td>${ acc.quantity}</td>
		     			
			</c:forEach>
			
		</tbody>
	</table>
	
	
	
