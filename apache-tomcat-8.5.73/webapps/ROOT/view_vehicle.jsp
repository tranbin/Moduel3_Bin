<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/9/2022
  Time: 11:25 PM
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
        <td>${requestScope["vehicle"].getId()}</td>
    </tr>
    <tr>
        <td>Name: </td>
        <td>${requestScope["vehicle"].getName()}</td>
    </tr>
    <tr>
        <td>Price: </td>
        <td>${requestScope["vehicle"].getPrice()}</td>
    </tr>
    <tr>
        <td>Date of Produce: </td>
        <td>${requestScope["vehicle"].getDateOfProduce()}</td>
    </tr>
    <tr>
        <td>Description: </td>
        <td>${requestScope["vehicle"].getDescription()}</td>
    </tr>
</table>
</body>
</html>
