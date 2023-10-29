package com.example.quiz.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "SetTheamColor", value = "/SetTheamColor")
public class SetTheamColor extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/settheam.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getParameter("theme") == null){
            response.sendRedirect("index.jsp");
        }
        else {
            String backgroundColor = request.getParameter("theme");
            Cookie cookie = new Cookie("cookie", backgroundColor);
            cookie.setMaxAge(60*60*24);
            response.addCookie(cookie);
            response.sendRedirect("index.jsp"); //end
        }




    }
}