<%--
  Created by IntelliJ IDEA.
  User: HTC
  Date: 6/11/2021
  Time: 10:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Display</title>
</head>
<body>
<h1>Condiment List Order</h1>
    <c:forEach var="food" items="${sandwich.condiments}">
        <li>${food}</li>
    </c:forEach>
</body>
</html>