<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 12/29/2021
  Time: 20:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>List Student</h2>
<table style="width: 700px;" border="1px solid">
    <tr >
        <th>ID</th>
        <th>Name</th>
        <th>Date Of Birth</th>
        <th>Gender</th>
        <th>Grade</th>
        <th>Degree</th>
        <th>Action</th>
    </tr>
    <c:forEach var="student" items="${studentList}">
        <tr>
            <td><c:out value="${student.id}"></c:out></td>
            <td><c:out value="${student.name}"></c:out></td>
            <td><c:out value="${student.dateOfBirth}"></c:out></td>
            <td>
                <c:if test="${student.gender == 1}">
                    Male
                </c:if>
                <c:if test="${student.gender == 0}">
                    Female
                </c:if>
            </td>
            <td><c:out value="${student.grade}"></c:out></td>
            <td>
                <c:choose>
                    <c:when test="${student.grade <4}">
                        Bad
                    </c:when>
                    <c:when test="${student.grade < 7}">
                        Good
                    </c:when>
                    <c:otherwise>
                        Very good
                    </c:otherwise>
                </c:choose>
            </td>
            <td><a href="/student?action=update&id=${student.id}">Update</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
