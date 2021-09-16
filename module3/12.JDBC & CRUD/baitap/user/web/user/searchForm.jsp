<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 8/18/2021
  Time: 10:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search Country</title>
</head>
<body>
<h1>Input country to search user:</h1>
<form action="/users?action=ctsearch" method="post">
    <input type="text" name="ct" id="ct"/>
    <input type="submit">
    <table>
        <tr>
            <td>ID :</td>
            <td><c:out value="${selectedUser.id}"/></td>
        </tr>
        <tr>
            <td>Name :</td>
            <td><c:out value="${selectedUser.name}"/></td>
        </tr>
        <tr>
            <td>Email :</td>
            <td><c:out value="${selectedUser.email}"/></td>
        </tr>
        <tr>
            <td>Country :</td>
            <td><c:out value="${selectedUser.country}"/></td>
        </tr>
    </table>
    <h3>
        <a href="/">Back to menu</a>
    </h3>
</form>
</body>
</html>
