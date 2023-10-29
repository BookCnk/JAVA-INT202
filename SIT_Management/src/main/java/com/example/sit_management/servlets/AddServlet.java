package com.example.sit_management.servlets;

import com.example.sit_management.models.AllStudent;
import com.example.sit_management.models.Student;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;


import java.io.IOException;

@WebServlet(name = "AddServlet", value = "/AddServlet")
public class AddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        Student student = new Student();
//        HttpSession session = request.getSession();
//        int id = student.getId();
//        String name = student.getName();
//        int score = student.getScore();
//        session.setAttribute("id", id);
//        session.setAttribute("name", name);
//        session.setAttribute("score", score);
//
//        getServletContext().getRequestDispatcher("/AllData.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String name = request.getParameter("name"); // get name
        String score = request.getParameter("score"); //get score and change to double
        HttpSession session = request.getSession(); //create session
        AllStudent allStudent = (AllStudent) session.getAttribute("AllStudent");
        if (id.isEmpty()|| name.isEmpty() || score.isEmpty()){
            request.setAttribute("messageErr", "Enter Complete Information");
            getServletContext().getRequestDispatcher("/AddRemoveStudent.jsp").forward(request, response);
        }
        int addId = Integer.parseInt(request.getParameter("id"));
        Double addScore = Double.parseDouble(request.getParameter("score"));
        if(allStudent != null){
            allStudent.addStudent(addId,name,addScore);
        }else {
            allStudent = new AllStudent();
            allStudent.addStudent(addId,name,addScore);
            session.setAttribute("AllStudent",allStudent);
        }
        session.setAttribute("findAll", allStudent.findAll());
        request.setAttribute("message", "Add Successful");
        getServletContext().getRequestDispatcher("/AddRemoveStudent.jsp").forward(request,response);
    }
}