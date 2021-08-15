<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 8/8/2021
  Time: 8:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h2>Currency Converter</h2>
<form action="converter.jsp" method="post">
    <label>RATE: </label>
    <input type="text" name="rate" placeholder="Rate" value="22000"/> <br>
    <br>
    <label>USD  : </label>
    <input type="text" name="usd" placeholder="USD" value="0"/> <br>
    <br>
    <button type="submit" id="submit" value="Converter">Converter</button>
</form>
</body>
</html>
