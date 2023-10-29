package com.example.todolist;

import com.example.todolist.model.Task;
import com.example.todolist.model.TaskManager;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "EditTaskServlet", value = "/EditTaskServlet")
public class EditTaskServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String taskId = request.getParameter("id");
        Task taskToEdit = TaskManager.getTaskById(taskId);
        session.setAttribute("editTask", taskToEdit);
        request.getServletContext().getRequestDispatcher("/edit-task.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String taskId = request.getParameter("id");
        String updatedTaskName = request.getParameter("name");
        Task taskToEdit = (Task) session.getAttribute("editTask");
        boolean checkUpdate = TaskManager.updateTask(taskId, updatedTaskName);
        String message;
        if (checkUpdate) {
            message = "Update Successful";
            session.setAttribute("message", message);
            response.sendRedirect("all-task.jsp");
        } else {
            message = "Update not Successful";
            session.setAttribute("message", message);
            response.sendRedirect("edit-task.jsp");
        }
    }
}