<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="for" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Condiments</title>
</head>
<body>
    <form:form action="submit" modelAttribute="sandwich">
        <h1>Choose Condiments</h1>
        Lettuce <form:checkbox path="condiments" value="Letture"/>
        Tomato <form:checkbox path="condiments" value="Tomato"/>
        Mustard <form:checkbox path="condiments" value="Mustard"/>
        Sprouts <form:checkbox path="condiments" value="Sprouts"/>
        <br/>
        <input type="submit" value="submit"/>
    </form:form>
</body>
</html>