<%--
  Created by IntelliJ IDEA.
  User: azama
  Date: 20.11.2022
  Time: 21:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/ServletFormFood" method="post">
    <label>First name:</label>
    <input type="text" name="fname"><br><br>

    <label>Last name:</label>
    <input type="text" name="lname"><br><br>
    <label>Food:</label>
    <select name="food">
        <option>Manty 900KZT</option>
        <option>Tom Yan 1200KZT</option>
        <option>Plov 1000KZT</option>
        <option>Lagman 1000KZT</option>
    </select>
    <input type="submit" value="Submit">
</form>
</body>
</html>
