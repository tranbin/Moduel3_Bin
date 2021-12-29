<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 12/30/2021
  Time: 12:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form method="post" action="/display-discount">
    <input type="text" name="productDescription" placeholder="Product Description"><br>
    <input type="text" name="listPrice" placeholder="List Price"><br>
    <input type="text" name="discountPercent" placeholder="Discount Percent"><br>
    <input type="submit" id="submit" value="Calculate Discount">
  </form>
  </body>
</html>
