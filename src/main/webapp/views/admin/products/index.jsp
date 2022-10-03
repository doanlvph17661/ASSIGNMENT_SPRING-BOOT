<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

      <a href="/Assignment/admin/products/create" type=> Thêm mới</a>

	<table class="table">
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Image</th>
				<th>Price</th>
				<th>Created date</th>
				<th>Acailable</th>
				
				<th colspan="2">Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${ product }" var="acc">
			<tr>
				<td>${ acc.id }</td>
				<td>${ acc.name }</td>
				<td>
				<img alt="" src="/Assignment/storage/${ acc.image }" style="width: 80px">
				</td>
				<td>${ acc.price }</td>
				<td>${ acc.createdDate}</td>
				<td>${ acc.available}</td>
		
				<td>		<a  href="/Assignment/admin/products/edit/${acc.id}">Sửa</a></td>
				<td> <a href="/Assignment/admin/products/delete/${ acc.id }">Xóa</a></td>
			</tr>
			
			</c:forEach>
			
		</tbody>
	</table>
	
	
	