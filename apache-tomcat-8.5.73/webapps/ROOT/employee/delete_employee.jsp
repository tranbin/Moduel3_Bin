<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/17/2022
  Time: 11:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Delete Employee</h2>
<form method="post">
    <label>Are you sure</label>
    <c:out value="${employee.id}"></c:out>
    <c:out value="${employee.name}"></c:out>
    <c:out value="${employee.dateOfBirth}"></c:out>
    <c:out value="${employee.idCard}"></c:out>
    <c:out value="${employee.salary}"></c:out>
    <c:out value="${employee.phone}"></c:out>
    <c:out value="${employee.email}"></c:out>
    <c:out value="${employee.address}"></c:out>
    <c:out value="${employee.typeId}"></c:out>
    <c:out value="${employee.position}"></c:out>
    <c:out value="${employee.education}"></c:out>
    <c:out value="${employee.division}"></c:out>
    <c:out value="${employee.username}"></c:out>
    <input type="submit" value ="Delete">
</form>
</body>
</html>
