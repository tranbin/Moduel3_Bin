<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/24/2022
  Time: 8:30 PM
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
    <input type="text" name="id" value="${customer.id}">
    <p>Name: </p>
    <input type="text" name="name" value="${customer.name}">
    <p>Birthday: </p>
    <input type="date" name="dateOfBirth" value="${customer.dateOfBirth}">
    <p>Gender: </p>
    <c:if test="${customer.gender == 0}">
            <input checked type="radio" name="gender" value=0>
            <label>Male</label>
            <input type="radio" name="gender" value=1>
            <label>Female</label>
    </c:if>
    <c:if test="${customer.gender == 1}">
        <input checked type="radio" name="gender" value=0>
        <label>Male</label>
        <input type="radio" name="gender" value=1>
        <label >Famale</label>
    </c:if>
    <p>Customer IdCard:</p>
    <input type="text" name="idCard" value="${customer.idCard}">
    <p>Phone:</p>
    <input type="text" name="phone" value="${customer.phone}">
    <p>Email: </p>
    <input type="text" name="email" value="${customer.email}">
    <p>Adress: </p>
    <input type="text" name="address" value="${customer.address}">
    <p>TypeId:</p>
    <c:if test="${customer != null}">
        <input type="hidden" name="id" value="<c:out value='${customer.id}' />"/>
    </c:if>
        <select name="idType">
            <c:forEach var="customerType1" items="${customerTypes}">
                <c:if test="${customer.customerType.idType == customerType.idType}">
                    <option selected value="${customerType1.idType}">${customerType1.nameOfType}</option>
                </c:if>
                <c:if test="${customer.customerType.idType != customerType.idType}">
                    <option value="${customerType1.idType}">${customerType1.nameOfType}</option>
                </c:if>
            </c:forEach>
        </select>
    <button type="submit">Update</button>
</form>
</body>
</html>
