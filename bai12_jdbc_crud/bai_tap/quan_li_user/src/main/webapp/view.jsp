<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/13/2022
  Time: 12:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1" width="600px">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Country</th>
    </tr>
    <c:forEach var="userList" items="${userList}">
        <tr>
            <td>
                <c:out value="${userList.id}"></c:out>
            </td>
            <td>
                <c:out value="${userList.name}"></c:out>
            </td>
            <td>
                <c:out value="${userList.email}"></c:out>
            </td>
            <td>
                <c:out value="${userList.country}"></c:out>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
