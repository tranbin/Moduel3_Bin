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
<table style="text-align: center" border="1">
    <tr>
        <td>Id: </td>
        <td>${requestScope["user"].getId()}</td>
    </tr>
    <tr>
        <td>Name: </td>
        <td>${requestScope["user"].getName()}</td>
    </tr>
    <tr>
        <td>Email: </td>
        <td>${requestScope["user"].getEmail()}</td>
    </tr>
    <tr>
        <td>Country </td>
        <td>${requestScope["user"].getCountry()}</td>
    </tr>
</table>
</body>
</html>
