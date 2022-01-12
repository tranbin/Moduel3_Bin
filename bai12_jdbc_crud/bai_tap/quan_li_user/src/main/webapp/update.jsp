<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
<h1>Update User</h1>
<form method="post">
    <p>Id:</p>
    <input type="text" name="id" value="${user.id}">
    <p>Name: </p>
    <input type="text" name="name" value="${user.name}">
    <p>Email: </p>
    <input type="text" name="email" value="${user.email}">
    <p>Country: </p>
    <input type="text" name="country" value="${user.country}">
    <button type="submit">Update</button>
</form>
</body>
</html>