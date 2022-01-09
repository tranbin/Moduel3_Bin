<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/7/2022
  Time: 8:49 PM
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
        <td>${requestScope["product"].getId()}</td>
    </tr>
    <tr>
        <td>Name: </td>
        <td>${requestScope["product"].getName()}</td>
    </tr>
    <tr>
        <td>Price: </td>
        <td>${requestScope["product"].getPrice()}</td>
    </tr>
    <tr>
        <td>Description: </td>
        <td>${requestScope["product"].getDescription()}</td>
    </tr>
    <tr>
        <td>Grand: </td>
            <td>${requestScope["product"].getGrand()}</td>
    </tr>
</table>
</body>
</html>
