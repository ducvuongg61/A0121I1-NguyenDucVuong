<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 8/2/2021
  Time: 8:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency Converter</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h2>Currency Converter</h2>
<form action="/convert" method="post">
    <label>Rate: </label><br/>
    <input type="text" name="ra" placeholder="RATE" value="22000"/><br/>
    <label>USD: </label><br/>
    <input type="text" name="us" placeholder="USD" value="0"/><br/>
    <input type="submit" id="submit" value="Converter"/>
</form>
</body>
</html>
