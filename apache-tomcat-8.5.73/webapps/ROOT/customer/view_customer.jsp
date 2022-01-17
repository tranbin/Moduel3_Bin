<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/16/2022
  Time: 12:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
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
<c:forEach var="customer1" items="${customerList}">
    <tr>
        <td>
            <c:out value="${customer1.customerId}"></c:out>
        </td>
        <td>
            <c:out value="${customer1.customerTypeId}"></c:out>
        </td>
        <td>
            <c:out value="${customer1.customerName}"></c:out>
        </td>
        <td>
            <c:out value="${customer1.customerBirthday}"></c:out>
        </td>
        <td>
            <c:if test="${customer1.customerGender == 1}">
                Male
            </c:if>
            <c:if test="${customer1.customerGender == 0}">
                Female
            </c:if>
        </td>
        <td>
            <c:out value="${customer1.customerIdCard}"></c:out>
        </td>
        <td>
            <c:out value="${customer1.customerPhone}"></c:out>
        </td>
        <td>
            <c:out value="${customer1.customerEmail}"></c:out>
        </td>
        <td>
            <c:out value="${customer1.customerAddress}"></c:out>
        </td>
    </tr>
</c:forEach>
</table>
</body>
</html>
