<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 9/15/2021
  Time: 10:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
<h1>English Dictionary</h1>
<form method="get" action="/result">
    <div>
        <input type="text" name="keyword" value="${key}" placeholder="Enter English"/>
        <input type="submit" value="Translate"/>
    </div>
    <div>
        <h2>Vietnamese : ${word}</h2>
    </div>
</form>
</body>
</html>
