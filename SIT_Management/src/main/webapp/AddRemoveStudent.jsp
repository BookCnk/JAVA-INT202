<%--
  Created by IntelliJ IDEA.
  User: bookc
  Date: 10/29/2023
  Time: 2:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>AddRemoveStudent</title>
</head>
<body>
<h1><%= "SitSpaceManagement" %></h1>
PAGE: <a href="AddRemoveStudent.jsp">ADD/REMOVE Student</a> | <a href="AllData.jsp">ALL DATA</a> <br>
<h3>Add Student Data</h3>
<form action="AddServlet" method="post">
  &nbsp;&nbsp;&nbsp;ID: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="id">&nbsp;Name: <input type="text" name="name"> <br><br>
  &nbsp;&nbsp;&nbsp;Score: <input type="text" name="score"> <br><br>
  &nbsp;&nbsp;&nbsp;<input type="submit" value="ADD">
  <c:if test="${messageErr != null}"><p>${messageErr}</p></c:if>
</form>
<hr>
<h3>Remove Student </h3>
<form action="RemoveServlet" method="post">
  &nbsp;&nbsp;&nbsp;ID: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="id">&nbsp;&nbsp;<input type="submit" value="REMOVE">
</form>
<hr>
<c:if test="${message != null}"> <p style="color: red">${message}</p></c:if>
</body>
</html>

