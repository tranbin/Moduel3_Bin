
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Danh sach User</h1>
<a href="/users?action=create">Create new Users</a></br>
<a href="/users?action=search">Search User By Country</a>
<table border="1" width="600px">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Country</th>
    </tr>
    <c:forEach var="users" items="${userList}">
        <tr>
            <td>
                <c:out value="${users.id}"></c:out>
            </td>
            <td>
                <c:out value="${users.name}"></c:out>
            </td>
            <td>
                <c:out value="${users.email}"></c:out>
            </td>
            <td>
                <c:out value="${users.country}"></c:out>
            </td>
            <td><a href="/users?action=update&id=${users.id}">Update</a></td>
            <td><a href="/users?action=delete&id=${users.id}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>