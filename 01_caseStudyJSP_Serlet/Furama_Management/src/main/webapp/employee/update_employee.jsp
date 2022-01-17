<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/17/2022
  Time: 11:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Update Employee</h1>
<form method="post">
    <p>Id:</p>
    <input type="text" name="id" value="${employee.id}">
    <p>Name:</p>
    <input type="text" name="name" value="${employee.name}">
    <p>dateOfBirth: </p>
    <input type="date" name="dateOfBirth" value="${employee.dateOfBirth}">
    <p>idCard: </p>
    <input type="date" name="idCard" value="${employee.idCard}">
    <p>salary: </p>
    <input type="text" name="salary" value="${employee.salary}">
    <p>phone :</p>
    <input type="text" name="phone" value="${employee.phone}">
    <p>email:</p>
    <input type="text" name="email" value="${employee.email}">
    <p>address: </p>
    <input type="text" name="address" value="${employee.address}">
    <p>typeId: </p>
    <input type="text" name="typeId" value="${employee.typeId}">
    <p>position :</p>
    <input type="text" name="position" value="${employee.position}">
    <p>education:</p>
    <input type="text" name="education" value="${employee.education}">
    <p>division: </p>
    <input type="text" name="division" value="${employee.division}">
    <p>username: </p>
    <input type="text" name="username" value="${employee.username}">
    <button type="submit">Update</button>

</form>
</body>
</html>
