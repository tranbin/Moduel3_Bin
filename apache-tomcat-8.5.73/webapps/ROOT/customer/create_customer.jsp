<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/15/2022
  Time: 12:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Create Customer</h2>
<form method="post">
    <p>Id:</p>
    <input type="text" name="customerId">
    <p>Type Id:</p>
    <input type="text" name="customerTypeId">
    <p>Name:</p>
    <input type="text" name="customerName">
    <p>Date of birth: </p>
    <input type="date" name="customerBirthday">
    <p>Gender: </p>
    <input type="text" name="customerGender">
    <p>Id Card:</p>
    <input type="text" name="customerIdCard">
    <p>Phone :</p>
    <input type="text" name="customerPhone">
    <p>Email:</p>
    <input type="text" name="customerEmail">
    <p>Address: </p>
    <input type="text" name="customerAddress">
    <button type="submit">Create</button>
</form>
</body>
</html>
