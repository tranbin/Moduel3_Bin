<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/17/2022
  Time: 9:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Create Service</h2>
<form method="post">
    <p>Id:</p>
    <input type="text" name="id">
    <p>Name:</p>
    <input type="text" name="name">
    <p>Area:</p>
    <input type="text" name="area">
    <p>Cost: </p>
    <input type="text" name="cost">
    <p>Max People: </p>
    <input type="text" name="maxPeople">
    <p>StandardRoom:</p>
    <input type="text" name="standardRoom">
    <p>Description:</p>
    <input type="text" name="description">
    <p>PoolArea:</p>
    <input type="text" name="poolArea">
    <p>NumberFloor: </p>
    <input type="text" name="numberFloor">
    <p>RentTypeId:</p>
    <input type="text" name="rentTypeId">
    <p>ServiceTypeId: </p>
    <input type="text" name="serviceTypeId">
    <button type="submit">Create</button>
</form>
</body>
</html>
