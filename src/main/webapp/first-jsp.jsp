<!doctype html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>First JSP</title>
</head>
<body>
<h2> Enter parameters of equation</h2>
<form method="post" action="/my-app/cool-servlet">
    <h3>Enter a1:</h3>
    <input type="text" name="a1">
    <h3>Enter a2:</h3>
    <input type="text" name="a2">
    <h3>Enter b1:</h3>
    <input type="text" name="b1">
    <h3>Enter b2:</h3>
    <input type="text" name="b2">
    <h3>Enter c1:</h3>
    <input type="text" name="c1">
    <h3>Enter c2:</h3>
    <input type="text" name="c2">
    <br/>
    <br/>
    <button type="submit">Send</button>

</form>

</body>
</html>