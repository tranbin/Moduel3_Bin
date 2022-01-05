<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/5/2022
  Time: 8:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>List Product</h2>
<a href="/product?action=create">Create new Product</a>

<p style="color: darkgrey">${msg}</p>


<a href="/product?action=search">Search Product</a>
<table style="width: 700px;text-align: center" border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Price</th>
        <th>Description</th>
        <th>Grand</th>
    </tr>
    <a:forEach var="product" items="${productList}">
        <tr>
            <td><a:out value="${product.id}"></a:out></td>
            <td><a:out value="${product.name}"></a:out></td>
            <td><a:out value="${product.price}"></a:out></td>
            <td><a:out value="${product.description}"></a:out></td>
            <td><a:out value="${product.grand}"></a:out></td>
            <td><a href="/product?action=update&id=${product.id}">Update</a></td>
            <td><a href="/product?action=delete&id=${product.id}">Delete Product</a></td>
        </tr>
    </a:forEach>

</table>
</body>
</html>
