<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="form" %>
	<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<table class="table">
	<thead>
		<tr>
			<th>ten sp</th>
			<th>sl</th>
			<th>thanh tien</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="item" items="${list}">
			<tr>
				<td>${item.product.name}</td>
				<td>${item.quanty}</td>
				<td>${item.price}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="/Assignment/order" type="button" class="btn btn-success">DAT HANG</a>
