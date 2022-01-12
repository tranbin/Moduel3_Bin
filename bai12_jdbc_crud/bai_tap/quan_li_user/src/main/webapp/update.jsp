
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        table{
            border: 1px solid black;
            border-collapse: collapse;
            width: 100%;
        }
        th, td{
            border-collapse: collapse;
            border: 1px solid black;
            height: 30px;
        }
    </style>
</head>
<body>
<h1>Danh sach User</h1>
<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Country</th>
    </tr>
    <c:forEach var="list" items="${list}">
        <tr>
            <td>
                <c:out value="${list.id}"></c:out>
            </td>
            <td>
                <c:out value="${list.name}"></c:out>
            </td>
            <td>
                <c:out value="${list.email}"></c:out>
            </td>
            <td>
                <c:out value="${list.country}"></c:out>
            </td>
            <td>
                <a href="/controllerServlet?action=update1&id=${list.id}">update</a>
            </td>
        </tr>
    </c:forEach>
</table>
<a href="/controllerServlet?action=index">Home</a>
</body>
</html>