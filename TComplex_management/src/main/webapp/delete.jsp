<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/26/2022
  Time: 8:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Delete TComplex</h2>
<form method="post">
    Are you sure
    <c:out value="${tComplex.id}"></c:out>
    <c:out value="${tComplex.area}"></c:out>
    <c:out value="${tComplex.status}"></c:out>
    <c:out value="${tComplex.floor}"></c:out>
    <c:out value="${tComplex.typeOfName}"></c:out>
    <c:out value="${tComplex.description}"></c:out>
    <c:out value="${tComplex.price}"></c:out>
    <c:out value="${tComplex.dateStart}"></c:out>
    <c:out value="${tComplex.dateEnd}"></c:out>
    <input type="submit" value ="Delete">
</form>
</body>
</html>
