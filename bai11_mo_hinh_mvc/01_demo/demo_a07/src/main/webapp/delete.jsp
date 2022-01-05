<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/5/2022
  Time: 6:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
    Ban co muon xoa:
    <c:out value="${student.id}"></c:out>
    <c:out value="${student.name}"></c:out>
    <c:out value="${student.gender}"></c:out>
    <c:out value="${student.dateOfBirth}"></c:out>
    <c:out value="${student.grade}"></c:out>
    <input type="submit" value="Delete">
</form>
</body>
</html>

