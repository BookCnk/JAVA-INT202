<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Delete Task</title>
</head>
<body>
<h1>Delete Task</h1>
<a href="./all-task.jsp">back</a>
<form action="DeleteTaskServlet" method="post">
    Task ID: <input type="text" name="id" required><br>
    <input type="submit" value="Delete Task">
</form>
<p>${sessionScope.message}</p>
</body>
</html>
