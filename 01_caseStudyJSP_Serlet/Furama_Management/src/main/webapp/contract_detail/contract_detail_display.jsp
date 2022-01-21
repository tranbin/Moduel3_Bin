<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/19/2022
  Time: 7:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3><a href="/contractDetail?action=create">Create new Contract</a></h3></br>
<table border="1px" width="600px" style="text-align: center;">
    <tr>
        <th>Contract Detail Id</th>
        <th>Contract Id</th>
        <th>Attach Service Id</th>
        <th>Quantity</th>
    </tr>
    <c:forEach var="contracDetail" items="${contractDetails}">
    <tr>
        <td>
            <c:out value="${contracDetail.contractDetailId}"></c:out>
        </td>
        <td>
            <c:out value="${contracDetail.contractId}"></c:out>
        </td>
        <td>
            <c:out value="${contracDetail.attachServiceId}"></c:out>
        </td>
        <td>
            <c:out value="${contracDetail.quantity}"></c:out>
        </td>
    </tr>
    </c:forEach>
</body>
</html>
