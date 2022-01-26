<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/24/2022
  Time: 11:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Delete Customer</h2>
<form method="post">
    Are you sure
    <c:out value="${customer.id}"></c:out>
    <c:out value="${customer.name}"></c:out>
    <c:out value="${customer.dateOfBirth}"></c:out>
    <c:out value="${customer.gender}"></c:out>
    <c:out value="${customer.idCard}"></c:out>
    <c:out value="${customer.phone}"></c:out>
    <c:out value="${customer.email}"></c:out>
    <c:out value="${customer.address}"></c:out>
    <c:out value="${customer.customerType}"></c:out>
    <input type="submit" value ="Delete">
</form>
</body>
</html>
</body>
</html>
