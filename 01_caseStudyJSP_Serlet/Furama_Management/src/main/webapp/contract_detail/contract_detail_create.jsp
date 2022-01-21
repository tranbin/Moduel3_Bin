<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/19/2022
  Time: 7:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Create Contract Detail</h2>
<form method="post">
    <p>Id Contract Detail:</p>
    <input type="text" name="contractDetailId">
    <p>Contract Id:</p>
    <input type="text" name="contractId">
    <p>Attach Service Id:</p>
    <input type="text" name="attachServiceId">
    <p>Quantity: </p>
    <input type="text" name="quantity">
    <button type="submit">Create</button>
</form>
</body>
</html>
