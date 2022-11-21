<%--
  Created by IntelliJ IDEA.
  User: azama
  Date: 20.11.2022
  Time: 23:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/Servlet1_5" method="post">
    <label>FULL NAME:</label>
    <input type="text" name="fname" width="100px"><br><br>

    <label for="quantity">EXAM POINTS:</label>
    <input type="number" id="quantity" name="quantity" min="1" max="100" width="300px"><br><br>

    <input type="submit" value="SUBMIT EXAM">
</form>
</body>
</html>
