<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 9/19/2021
  Time: 2:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
    <form action="/result" id="form" method="post">
        <div>
            <input type="text" name="firstNum" placeholder="Enter number 1"/>
            <input type="text" name="secondNum" placeholder="Enter number 2"/>
        </div>
        <div style="margin-top:10px">
            <input type="submit" name="operator" value="Addition(+)"/>
            <input type="submit" name="operator" value="Subtraction(-)"/>
            <input type="submit" name="operator" value="Multiplication(*)"/>
            <input type="submit" name="operator" value="Division(/)"/>
        </div>
    </form>
    <h2>Result : ${result}</h2>
</body>
</html>
