<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 8/9/2021
  Time: 3:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">

</head>
<body>
<h1 style="text-align: center">CUSTOMER LIST</h1>
<table class="table" style="border: 1px solid black ; width: 700px ; margin: 0 auto">
    <thead>
    <tr>
        <th>Full Name</th>
        <th>Birthday</th>
        <th>Address</th>
        <th>Image</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="customer" items="${customerList}">
        <tr>
            <td><c:out value="${customer.name}"/></td>
            <td><c:out value="${customer.birthday}"/></td>
            <td><c:out value="${customer.address}"/></td>
            <td>
                <img src="/static/img/${customer.img}" width="50" height="50"/>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
