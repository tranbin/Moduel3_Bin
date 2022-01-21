<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/19/2022
  Time: 6:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Create Contract</h2>
<form method="post">
    <p>Id Contract:</p>
    <input type="text" name="id">
    <p>Stard Day:</p>
    <input type="date" name="startDay">
    <p>End Day:</p>
    <input type="date" name="endDay">
    <p>Deposit: </p>
    <input type="text" name="deposit">
    <p>Total Money: </p>
    <input type="text" name="totalMoney">
    <p>Employee Id:</p>
    <input type="text" name="employeeId">
    <p>Customer Id:</p>
    <input type="text" name="customerId">
    <p>Service Id:</p>
    <input type="text" name="serviceId">
    <button type="submit">Create</button>
</form>
</body>
</html>
