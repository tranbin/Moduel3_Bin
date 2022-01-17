<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/15/2022
  Time: 12:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>List Customer</h1>
<a href="/customer?action=create">Create new Users</a></br>
<a href="/customer?action=search">Search Customer By Name</a>
<table border="1" width="600px">
    <tr>
        <th>Id</th>
        <th>Type Id</th>
        <th>Name</th>
        <th>Birthday</th>
        <th>Gender</th>
        <th>Id Card</th>
        <th>Phone</th>
        <th>Email</th>
        <th>Address</th>
    </tr>
    <c:forEach var="customer" items="${customerList}">
        <tr>
            <td>
                <c:out value="${customer.customerId}"></c:out>
            </td>
            <td>
                <c:out value="${customer.customerTypeId}"></c:out>
            </td>
            <td>
                <c:out value="${customer.customerName}"></c:out>
            </td>
            <td>
                <c:out value="${customer.customerBirthday}"></c:out>
            </td>
            <td>
                <c:if test="${customer.customerGender == 1}">
                    Male
                </c:if>
                <c:if test="${customer.customerGender == 0}">
                    Female
                </c:if>
            </td>
            <td>
                <c:out value="${customer.customerIdCard}"></c:out>
            </td>
            <td>
                <c:out value="${customer.customerPhone}"></c:out>
            </td>
            <td>
                <c:out value="${customer.customerEmail}"></c:out>
            </td>
            <td>
                <c:out value="${customer.customerAddress}"></c:out>
            </td>
            <td><a href="/customer?action=update&customerId=${customer.customerId}">Update</a></td>
            <td><a href="/customer?action=delete&customerId=${customer.customerId}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
