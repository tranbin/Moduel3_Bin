<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/9/2022
  Time: 10:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Update Vehicle</h2>
<form method="post">
    <label>Name</label>
    <input type="text" name="name" value="${vehicle.name}">
    <label>Price</label>
    <input type="text" name="price" value="${vehicle.price}">
    <label>Date Product</label>
    <input type="date" name="dateOfProduce" value="${vehicle.dateOfProduce}">
    <label>Description</label>
    <input type="text" name="description" value="${vehicle.description}">
    <button type="submit">Update</button>
</form>
</body>
</html>
