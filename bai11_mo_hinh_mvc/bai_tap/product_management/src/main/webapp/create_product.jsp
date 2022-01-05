<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/5/2022
  Time: 8:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body style="text-align: center">
<h2>Create new Product</h2>

<p style="color: pink">${msg}</p>
<form method="post">
    <label>ID</label>
    <input type="text" name="id">
    <label>Name</label>
    <input type="text" name="name">
    <label>Price</label>
    <input type="text" name="price">
    <label>Description</label>
    <input type="text" name="description">
    <label>Grand</label>
    <input type="text" name="Grand">
    <button type="submit">Create</button>
</form>
</body>
</html>
