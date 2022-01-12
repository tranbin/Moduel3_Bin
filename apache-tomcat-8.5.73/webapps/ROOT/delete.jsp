
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Delete Vehicle</h2>
<form method="post">
    <label>Are you sure</label>
    <c:out value="${user.id}"></c:out>
    <c:out value="${user.name}"></c:out>
    <c:out value="${user.email}"></c:out>
    <c:out value="${user.country}"></c:out>
    <input type="submit" value ="Delete">
</form>
</body>
</html>