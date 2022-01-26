<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/24/2022
  Time: 8:02 PM
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
<form action="/customer?action=searchBy3" method="post">
    <input type="text" name="name" placeholder="nhap ten">
    <input type="text" name="email" placeholder="nhap email">
    Customer Type
    <select name="idType" >
        <c:out value="${customer.customerType.nameOfType}"></c:out>
    </select><br>
    <button type="submit">Search</button>
</form>
<table border="1" width="600px">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Birthday</th>
        <th>Gender</th>
        <th>Id Card</th>
        <th>Phone</th>
        <th>Email</th>
        <th>Address</th>
        <th>Type Id</th>
    </tr>
    <c:forEach var="customer" items="${customerList}">
        <tr>
            <td>
                <c:out value="${customer.id}"></c:out>
            </td>

            <td>
                <c:out value="${customer.name}"></c:out>
            </td>
            <td>
                <c:out value="${customer.dateOfBirth}"></c:out>
            </td>
            <td>
                <c:if test="${customer.gender == 0}">
                    Male
                </c:if>
                <c:if test="${customer.gender == 1}">
                    Female
                </c:if>
            </td>
            <td>
                <c:out value="${customer.idCard}"></c:out>
            </td>
            <td>
                <c:out value="${customer.phone}"></c:out>
            </td>
            <td>
                <c:out value="${customer.email}"></c:out>
            </td>
            <td>
                <c:out value="${customer.address}"></c:out>
            </td>
            <td>
                <c:out value="${customer.customerType.nameOfType}"></c:out>
            </td>
            <td><a href="/customer?action=update&id=${customer.id}">Update</a></td>
            <td><a href="/customer?action=delete&id=${customer.id}">Delete</a></td>

        </tr>
    </c:forEach>
</table>
</body>
</html>
