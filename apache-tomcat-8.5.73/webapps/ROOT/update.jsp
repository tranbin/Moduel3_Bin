<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/5/2022
  Time: 9:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
    <label>Name :</label>
    <input type="text" name="name" value="${product.name}">
    <label>Price :</label>
    <input type="text" name="price" value="${product.price}">
<button type="submit">Update</button>
</form>
</body>
</html>
