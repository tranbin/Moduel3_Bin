<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/26/2022
  Time: 8:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Create Customer</h2>
<form method="post">
    <p>Id:</p>
    <input type="text" name="id">
    <p>Area:</p>
    <input type="text" name="area">
    <p>Status:</p>
    <input checked type="radio" name="status" value=0>
    <label>Trống</label>
    <input checked type="radio" name="status" value=1>
    <label>Hạ Tầng</label>
    <input checked type="radio" name="status" value=1>
    <label>Đầy đủ</label>
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
    <p>Description:</p>
    <input type="text" name="description">
    <p>Price :</p>
    <input type="text" name="price">
    <p>DateStart:</p>
    <input type="date" name="dateStart">
    <p>DateEnd: </p>
    <input type="date" name="dateEnd">
    <button type="submit">Create</button>
</form>
</body>
</html>