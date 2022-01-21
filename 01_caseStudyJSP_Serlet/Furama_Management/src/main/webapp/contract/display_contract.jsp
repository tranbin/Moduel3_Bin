<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/19/2022
  Time: 6:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>List Contract Furama</h1>
<h3><a href="/contractFurama?action=create">Create new Contract</a></h3></br>
<table border="1px" width="600px" style="text-align: center;">
    <tr>
        <th>Id</th>
        <th>Start Day</th>
        <th>End Day</th>
        <th>Deposit</th>
        <th>Total Money</th>
        <th>Employee Id</th>
        <th>Customer Id</th>
        <th>Service Id</th>
    </tr>
    <c:forEach var="contract" items="${contractFuramas}">
        <tr>
            <td>
                <c:out value="${contract.id}"></c:out>
            </td>
            <td>
                <c:out value="${contract.startDay}"></c:out>
            </td>
            <td>
                <c:out value="${contract.endDay}"></c:out>
            </td>
            <td>
                <c:out value="${contract.deposit}"></c:out>
            </td>
            <td>
                <c:out value="${contract.totalMoney}"></c:out>
            </td>
            <td>
                <c:out value="${contract.employeeId}"></c:out>
            </td>
            <td>
                <c:out value="${contract.customerId}"></c:out>
            </td>
            <td>
                <c:out value="${contract.serviceId}"></c:out>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
