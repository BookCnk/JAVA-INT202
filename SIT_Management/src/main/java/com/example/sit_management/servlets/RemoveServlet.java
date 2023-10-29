package com.example.sit_management.servlets;

import com.example.sit_management.models.AllStudent;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "RemoveServlet", value = "/RemoveServlet")
public class RemoveServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int addid = Integer.parseInt(request.getParameter("id"));
        HttpSession session = request.getSession();
        String id = request.getParameter("id");
        AllStudent allStudent = (AllStudent) session.getAttribute("AllStudent");
        if (allStudent != null) {
            if (allStudent.findID(addid)) {
                allStudent.removeStudent(addid);
            }else {
                request.setAttribute("message", "There is no information for this student.");
                getServletContext().getRequestDispatcher("/AddRemoveStudent.jsp").forward(request, response);
            }
        } else {
            request.setAttribute("message", "There is no information for this student.");
            getServletContext().getRequestDispatcher("/AddRemoveStudent.jsp").forward(request, response);
        }
        session.setAttribute("findAll", allStudent.findAll());
        request.setAttribute("message", "Remove Successful");
        getServletContext().getRequestDispatcher("/AddRemoveStudent.jsp").forward(request, response);
    }
}