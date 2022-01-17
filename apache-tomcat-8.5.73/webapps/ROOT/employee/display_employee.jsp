<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/17/2022
  Time: 11:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>List Employee</h1>
<a href="/employee?action=create">Create new Employee</a></br>
<a href="/employee?action=search">Search Employee By Name</a>
<table border="1" width="600px">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Birthday</th>
        <th>Id Card</th>
        <th>Salary</th>
        <th>Phone</th>
        <th>Email</th>
        <th>Address</th>
        <th>TypeId</th>
        <th>Position</th>
        <th>Education</th>
        <th>Division</th>
        <th>UserName</th>
    </tr>
    <c:forEach var="employee" items="${employeeList}">
        <tr>
            <td>
                <c:out value="${employee.id}"></c:out>
            </td>
            <td>
                <c:out value="${employee.name}"></c:out>
            </td>
            <td>
                <c:out value="${employee.dateOfBirth}"></c:out>
            </td>
            <td>
                <c:out value="${employee.idCard}"></c:out>
            </td>
            <td>
                <c:out value="${employee.salary}"></c:out>
            </td>
            <td>
                <c:out value="${employee.phone}"></c:out>
            </td>
            <td>
                <c:out value="${employee.email}"></c:out>
            </td>
            <td>
                <c:out value="${employee.address}"></c:out>
            </td>
            <td>
                <c:out value="${employee.typeId}"></c:out>
            </td>
            <td>
                <c:out value="${employee.position}"></c:out>
            </td>
            <td>
                <c:out value="${employee.education}"></c:out>
            </td>
            <td>
                <c:out value="${employee.division}"></c:out>
            </td>
            <td>
                <c:out value="${employee.username}"></c:out>
            </td>
            <td><a href="/employee?action=update&id=${employee.id}">Update</a></td>
            <td><a href="/employee?action=delete&id=${employee.id}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
