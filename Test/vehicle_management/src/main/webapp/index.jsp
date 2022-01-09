<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/9/2022
  Time: 9:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>$Title$</title>
</head>
<br>
<h1>List Vehicle Oto</h1>
<a href="/vehicle?action=create">Create new Vehicle</a>
</br>
<a href="/vehicle?action=search">Search Vehicle</a>
<table border="1" style="text-align: center">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Price</th>
        <th>Date of produce</th>
        <th>Description</th>
    </tr>
    <c:forEach var="vehicle" items="${vehicleList}">
        <tr>
            <td><c:out value="${vehicle.id}"></c:out></td>
            <td><c:out value="${vehicle.name}"></c:out></td>
            <td><c:out value="${vehicle.price}"></c:out></td>
            <td><c:out value="${vehicle.dateOfProduce}"></c:out></td>
            <td><c:out value="${vehicle.description}"></c:out></td>
            <td><a href="/vehicle?action=update&id=${vehicle.id}">Update</a></td>
            <td><a href="/vehicle?action=delete&id=${vehicle.id}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
