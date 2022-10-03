<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="form" %>
=

<div class="container">
      <form:form action="/Assignment/login" method="post" modelAttribute="account">
      <div class="form-group">
      <label>Email</label>
 <form:input path="email" type="email" class="form-control"/>
      </div>
     <div class="form-group">
     <label>password</label>
     <form:password path="password" class="form-control"/>
     </div>
     <button>Dang nhap</button>
      </form:form>
      </div>
