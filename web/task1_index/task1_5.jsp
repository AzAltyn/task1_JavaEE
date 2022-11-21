<%--
  Created by IntelliJ IDEA.
  User: azama
  Date: 20.11.2022
  Time: 23:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ServletFormFood</title>
</head>
<body>
<form action="/Servlet1_5" method="post">
  <label>Full name:</label>
  <input type="text" name="fname"><br><br>

  <label for="quantity">Age:</label>
  <input type="number" id="quantity" name="quantity" min="1" max="101">

  <p>Gender:</p>
  <input type="radio" id="html" name="fav_language" value="male">
  <label for="html">male</label><br>
  <input type="radio" id="css" name="fav_language" value="female">
  <label for="css">female</label><br>

  <input type="submit" value="Submit">
</form>
</body>
</html>
