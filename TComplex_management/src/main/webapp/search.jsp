<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/26/2022
  Time: 8:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" style="text-align: center">
    <label>Input your price to search</label>
    <input type="text" name="price">
    <p>NumberFloor: </p>
    <select name="floor">
        <option>01</option>
        <option>02</option>
        <option>03</option>
        <option>04</option>
        <option>05</option>
        <option>06</option>
        <option>07</option>
        <option>08</option>
        <option>09</option>
        <option>10</option>
        <option>11</option>
        <option>12</option>
        <option>13</option>
        <option>14</option>
        <option>15</option>
    </select>
    <p>Type: </p>
    <input checked type="radio" name="typeOfName" value=0>
    <label>Văn phòng chia sẻ</label>
    <input checked type="radio" name="typeOfName" value=1>
    <label>Văn phòng trọn gói</label>
    <button type="submit">Search Tcomplex</button>
</form>
</body>
</html>
