package com.example.multiplicationtable.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "MultiplicationServlet", value = "/multiplication_table") // link to jsp
public class MultiplicationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String numberStr = request.getParameter("number");
        if (numberStr == null || numberStr.length() == 0 || isNumber(numberStr)){ // check condition and create Method check Number
            request.setAttribute("error", "invalid number or parameter !!!");
        }
        request.getRequestDispatcher("/multiplication_table.jsp").forward(request,response); //link file jsp Name . forward เพื่อทำให้ครบ
    }

    private boolean isNumber(String nStr){ // method check number
        for (int i = 0; i < nStr.length(); i++){
            if (!Character.isDigit(nStr.charAt(i))){ // if input not number return false
                return true;
            }
        }
        return false;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}