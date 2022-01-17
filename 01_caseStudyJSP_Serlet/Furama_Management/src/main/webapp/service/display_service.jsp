<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/17/2022
  Time: 8:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<style>

</style>
<body>
<h1>List Serivce</h1>

<h3><a href="/serviceFurama?action=create">Create new Service</a></h3></br>

<table border="1px" width="600px" style="text-align: center;">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Area</th>
        <th>Cost</th>
        <th>Max People</th>
        <th>Standard Room</th>
        <th>Description</th>
        <th>Pool Area</th>
        <th>NumberFloor</th>
        <th>Rent Type Id</th>
        <th>Service Type Id</th>
    </tr>
    <c:forEach var="service" items="${serviceFuramas}">
        <tr>
            <td>
                <c:out value="${service.id}"></c:out>
            </td>
            <td>
                <c:out value="${service.name}"></c:out>
            </td>
            <td>
                <c:out value="${service.area}"></c:out>
            </td>
            <td>
                <c:out value="${service.cost}"></c:out>
            </td>
            <td>
                <c:out value="${service.maxPeople}"></c:out>
            </td>
            <td>
                <c:out value="${service.standardRoom}"></c:out>
            </td>
            <td>
                <c:out value="${service.description}"></c:out>
            </td>
            <td>
                <c:out value="${service.poolArea}"></c:out>
            </td>
            <td>
                <c:out value="${service.numberFloor}"></c:out>
            </td>
            <td>
                <c:out value="${service.rentTypeId}"></c:out>
            </td>
            <td>
                <c:out value="${service.serviceTypeId}"></c:out>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
