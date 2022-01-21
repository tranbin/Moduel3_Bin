<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/17/2022
  Time: 11:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>List Employee View</h1>

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
    <c:forEach var="employee1" items="${employeeList}">
        <tr>
            <td>
                <c:out value="${employee1.id}"></c:out>
            </td>
            <td>
                <c:out value="${employee1.name}"></c:out>
            </td>
            <td>
                <c:out value="${employee1.dateOfBirth}"></c:out>
            </td>
            <td>
                <c:out value="${employee1.idCard}"></c:out>
            </td>
            <td>
                <c:out value="${employee1.salary}"></c:out>
            </td>
            <td>
                <c:out value="${employee1.phone}"></c:out>
            </td>
            <td>
                <c:out value="${employee1.email}"></c:out>
            </td>
            <td>
                <c:out value="${employee1.address}"></c:out>
            </td>
            <td>
                <c:out value="${employee1.typeId}"></c:out>
            </td>
            <td>
                <c:out value="${employee1.position}"></c:out>
            </td>
            <td>
                <c:out value="${employee1.education}"></c:out>
            </td>
            <td>
                <c:out value="${employee1.division}"></c:out>
            </td>
            <td>
                <c:out value="${employee1.username}"></c:out>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
