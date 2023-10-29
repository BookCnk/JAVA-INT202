package com.example.todolist;

import com.example.todolist.model.Task;
import com.example.todolist.model.TaskManager;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "AddTaskServlet", value = "/AddTaskServlet")
public class AddTaskServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getServletContext().getRequestDispatcher("/add-task.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        if (id != null & name != null) {
            TaskManager allTask = (TaskManager) session.getAttribute("allTask");
            if (allTask == null) {
                List<Task> tasks = TaskManager.getTasks();
                session.setAttribute("tasks", tasks);
                System.out.println("----Create new allTask");
            }
            Task task = new Task(id, name);
            boolean checkTask = TaskManager.addTask(task);
            String message;
            if (checkTask) {
                message = "Add Successful";
                session.setAttribute("message", message);
                request.getServletContext().getRequestDispatcher("/all-task.jsp").forward(request, response);
            } else {
                message = "Add not successful";
                session.setAttribute("message", message);
                request.getServletContext().getRequestDispatcher("/add-task.jsp").forward(request, response);
            }

            System.out.println("---------------Number of Tasks: " + TaskManager.getTasks().size());
        }
    }
}