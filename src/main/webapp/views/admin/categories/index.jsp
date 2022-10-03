<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
     <a href="/Assignment/admin/categories/create">Thêm mới</a>
	<table class="table">
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				
				<th colspan="2">Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${ data }" var="acc">
			<tr>
				<td>${ acc.id }</td>
				<td>${ acc.name }</td>
							<td>		<a href="/Assignment/admin/categories/edit/${acc.id}">Sửa</a></td>
				<td> <a href="/Assignment/admin/categories/delete/${ acc.id }">Xóa</a></td>
			</tr>
			
	
			
			</c:forEach>
			
		</tbody>
	</table>
	
	
	
	<script src="/Assignment/js/jquery.min.js"></script>
	<script src="/Assignment/js/popper.min.js"></script>
	<script src="/Assignment/js/bootstrap.min.js"></script>
