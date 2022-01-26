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
<h1>Create Customer</h1>
<form method="post">
    <p>Id:</p>
    <input type="text" name="id" value="${customer.id}">
    <p>Name: </p>
    <input type="text" name="name" value="${customer.name}">
    <p>Birthday: </p>
    <input type="date" name="dateOfBirth" value="${customer.dateOfBirth}">
    <p>Gender: </p>
    <input checked type="radio" name="gender" value=0>
    <label>Male</label>
    <input checked type="radio" name="gender" value=1>
    <label>Famale</label>
    <p>Customer IdCard:</p>
    <input type="text" name="idCard" value="${customer.idCard}">
    <p>Phone:</p>
    <input type="text" name="phone" value="${customer.phone}">
    <p>Email: </p>
    <input type="text" name="email" value="${customer.email}">
    <p>Adress: </p>
    <input type="text" name="address" value="${customer.address}">
    <p>Type:</p>
    <select name="idType" >
        <c:forEach var="customerType" items="${customerTypes}">

            <option value="${customerType.idType}">${customerType.nameOfType}</option>

        </c:forEach>
    </select>
    <button type="submit">Update</button>

</form>
</body>
</html>
