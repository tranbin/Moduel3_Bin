<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 12/31/2021
  Time: 6:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table style="width: 700px;" border="1px solid">
    <tr style="text-align: center">
        <th>Danh Sách Khách Hàng</th>
    </tr>
    <tr>
        <th>Tên</th>
        <th>Ngày Sinh</th>
        <th>Địa Chỉ</th>
        <th>Ảnh</th>
    </tr>
    <c:forEach var="customer" items="${customerList}">
        <tr>
            <td><c:out value="${customer.nameCustomer}"></c:out></td>
            <td><c:out value="${customer.dateOfBirth}"></c:out></td>
            <td><c:out value="${customer.address}"></c:out></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
