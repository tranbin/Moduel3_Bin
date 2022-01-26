<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/16/2022
  Time: 12:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Delete Customer</h2>
<form method="post">
    <label>Are you sure</label>
    <c:out value="${customer.customerId}"></c:out>
    <c:out value="${customer.customerTypeId}"></c:out>
    <c:out value="${customer.customerName}"></c:out>
    <c:out value="${customer.customerBirthday}"></c:out>
    <c:out value="${customer.customerGender}"></c:out>
    <c:out value="${customer.customerIdCard}"></c:out>
    <c:out value="${customer.customerPhone}"></c:out>
    <c:out value="${customer.customerEmail}"></c:out>
    <c:out value="${customer.customerAddress}"></c:out>
    <input type="submit" value ="Delete">
</form>
</body>
</html>
