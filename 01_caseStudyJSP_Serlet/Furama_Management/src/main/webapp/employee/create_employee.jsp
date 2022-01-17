<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/17/2022
  Time: 10:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    * {
        text-align: center;
    }
</style>
<body>
<h1>Create Employee</h1>
<form method="post">
    <p>Id:</p>
    <input type="text" name="id">
    <p>Name:</p>
    <input type="text" name="name">
    <p>Date Of Birthday:</p>
    <input type="date" name="dateOfBirth">
    <p>Id Card: </p>
    <input type="text" name="idCard">
    <p>Salary: </p>
    <input type="text" name="salary">
    <p>Phone:</p>
    <input type="text" name="phone">
    <p>Email :</p>
    <input type="text" name="email">
    <p>Address:</p>
    <input type="text" name="address">
    <p>TypeId: </p>
    <input type="text" name="typeId">
    <p>Position:</p>
    <input type="text" name="position">
    <p>Education :</p>
    <input type="text" name="education">
    <p>Division:</p>
    <input type="text" name="division">
    <p>Username: </p>
    <input type="text" name="username">
    <button type="submit">Create</button>
</form>
</body>
</html>
