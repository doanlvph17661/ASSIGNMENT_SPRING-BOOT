<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>


     <a href="/Assignment/admin/accounts/create" type="button bg-success">Thêm mới</a>
	<table class="table">
	
		<thead>
			<tr class="table table-warning">
				<th>ID</th>
				<th>Fullname</th>
			    <th>SĐT</th>
		
				<th>Email</th>
				<th>Địa chỉ</th>
				<th>Photo</th>
				<th>Activated</th>
				<th>Role</th>
				<th colspan="2">Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${ data }" var="acc">
			<tr class="table table-warning">
				<td>${ acc.id }</td>
				<td>${ acc.fullname }</td>
                <td>${ acc.sdt }</td>
               
				<td>${ acc.email }</td>
				  <td>${acc.address }</td>
				<td>${ acc.photo }</td>
				<td>${ acc.activated }</td>
				<td>${ acc.admin }</td>
				<td>		<a href="/Assignment/admin/accounts/edit/${acc.id}">Sửa</a></td>
				<td> <a href="/Assignment/admin/accounts/delete/${ acc.id }">Xóa</a></td>
			</tr>
			
	
			
			</c:forEach>
			
		</tbody>
	</table>
	
	
	
	
