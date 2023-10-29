<%--
  Created by IntelliJ IDEA.
  User: bookc
  Date: 10/28/2023
  Time: 8:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title>signup</title>
</head>
<body>
<h3>signup</h3>
<c:if test="${message != null}"> <p style="color: red">${message}</p> </c:if>
<form action="signup" method="post">
  Name : <input type="text" name="Name"><br>
  Email : <input type="text" name="Email"><br>
  Username : <input type="text" name="Username"><br>
  Password : <input type="password" name="Password"><br>
  <input type="submit" value="signup">
</form>
</body>
</html>
