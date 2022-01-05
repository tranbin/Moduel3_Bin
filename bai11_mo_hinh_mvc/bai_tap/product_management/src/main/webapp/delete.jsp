<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/6/2022
  Time: 12:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>DELETE PRODUCT</h2>
<form method="post">
    Bạn có muốn xóa
    <c:out value="${product.id}"></c:out>
    <c:out value="${product.name}"></c:out>
    <c:out value="${product.price}"></c:out>
    <c:out value="${product.description}"></c:out>
    <c:out value="${product.grand}"></c:out>
    <input type="submit" value ="Delete">
</form>

</body>
</html>
