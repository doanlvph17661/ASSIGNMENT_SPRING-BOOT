<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>


      
	<table class="table">
		<thead>
			<tr>
				<th>ID</th>
				<th>USER_ID</th>
				<th>Create date</th>
				<th>Address</th>
				
				<th>SĐT</th>
			   		<th>Total</th>
			   				<th>Fullname</th>
				
			
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${ order }" var="acc">
			<tr>
				<td>${ acc.id }</td>
				<td>${ acc.user.fullname }</td>
				<td>${ acc.createDate }</td>
				<td>${ acc.address }</td>
				<td>${ acc.sdt}</td>
		         <td>${ acc.total}</td>
		         <td>${ acc.fullname}</td>
		
				
	
			
			</c:forEach>
			
		</tbody>
	</table>
	
	
	
