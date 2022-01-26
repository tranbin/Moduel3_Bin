<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/26/2022
  Time: 8:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>List TCPLEX</h1>
<table border="1" width="600px">
    <tr>
        <th>Mã mặt bằng</th>
        <th>Diện tích</th>
        <th>Trạng thái</th>
        <th>Số tầng</th>
        <th>Loại Phòng</th>
        <th>Mô tả phòng</th>
        <th>Gía cho thuê</th>
        <th>Ngày bắt đầu thuê Thuê</th>
        <th>Ngày kết thúc thuê</th>
    </tr>
    <c:forEach var="tComplex" items="${tComplexList}">
        <tr>
            <td>
                <c:out value="${tComplex.id}"></c:out>
            </td>
            <td>
                <c:out value="${tComplex.area}"></c:out>
            </td>
            <td>
                <c:if test="${tComplex.status == 0}">
                    Trống
                </c:if>
                <c:if test="${tComplex.status == 1}">
                    Hạ Tầng
                </c:if>
                <c:if test="${tComplex.status == 2  }">
                    Đầy đủ
                </c:if>
            </td>
            <td>
                <c:out value="${tComplex.floor}"></c:out>
            </td>
            <td>
                <c:if test="${tComplex.typeOfName == 0}">
                    Văn phòng chia sẻ
                </c:if>
                <c:if test="${tComplex.typeOfName == 1}">
                    Văn phòng trọn gói
                </c:if>
            </td>
            <td>
                <c:out value="${tComplex.description}"></c:out>
            </td>
            <td>
                <c:out value="${tComplex.price}"></c:out>
            </td>
            <td>
                <c:out value="${tComplex.dateStart}"></c:out>
            </td>
            <td>
                <c:out value="${tComplex.dateEnd}"></c:out>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
