<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/9/2022
  Time: 11:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Delete Vehicle</h2>
<form method="post">
    <label>Are you sure</label>
    <c:out value="${vehicle.id}"></c:out>
    <c:out value="${vehicle.name}"></c:out>
    <c:out value="${vehicle.price}"></c:out>
    <c:out value="${vehicle.dateOfProduce}"></c:out>
    <c:out value="${vehicle.description}"></c:out>
    <input type="submit" value ="Delete">
</form>
</body>
</html>
