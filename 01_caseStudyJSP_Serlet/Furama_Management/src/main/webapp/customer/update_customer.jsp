<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/16/2022
  Time: 12:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Update Customer</h1>
<form method="post">
    <p>Id:</p>
    <input type="text" name="customerId" value="${customer.customerId}">
    <p>TypeId:</p>
    <input type="text" name="customerTypeId" value="${customer.customerTypeId}">
    <p>Name: </p>
    <input type="text" name="customerName" value="${customer.customerName}">
    <p>Birthday: </p>
    <input type="date" name="customerBirthday" value="${customer.customerBirthday}">
    <p>Gender: </p>
    <input type="text" name="customerGender" value="${customer.customerGender}">
    <p>Customer IdCard:</p>
    <input type="text" name="customerIdCard" value="${customer.customerIdCard}">
    <p>Phone:</p>
    <input type="text" name="customerPhone" value="${customer.customerPhone}">
    <p>Email: </p>
    <input type="text" name="customerEmail" value="${customer.customerEmail}">
    <p>Adress: </p>
    <input type="text" name="customerAddress" value="${customer.customerAddress}">
    <button type="submit">Update</button>

</form>
</body>
</html>
