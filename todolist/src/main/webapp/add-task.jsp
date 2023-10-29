<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Add Task</title>
</head>
<body>
<h1>Add Task</h1>
<form action="AddTaskServlet" method="post">
    Task ID: <input type="text" name="id" required><br>
    Task Name: <input type="text" name="name" required><br>
    <input type="submit" value="Add Task">
</form>
<p>${sessionScope.message}</p>
<a href="all-task.jsp">Back</a>
</body>
</html>
