<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 1/11/2022
  Time: 8:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>$Title$</title>
</head>
<body>
<center>
  <table>
    <tr>
      <td>
        <button><a href="/controllerServlet?action=display"> Display</a></button>
      </td>
      <td>
        <button><a href="/controllerServlet?action=create">Create</a>  </button>
      </td>
      <td>
        <button><a href="/controllerServlet?action=update">Update</a> </button>
      </td>
      <td>
        <button><a href="/controllerServlet?action=delete">Delete</a> </button>
      </td>
    </tr>
  </table>
</center>
</body>
</html>