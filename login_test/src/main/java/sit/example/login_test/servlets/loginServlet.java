package sit.example.login_test.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "loginServlet", value = "/login")
public class loginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("Username");
        String pass = request.getParameter("Password");
        HttpSession session = request.getSession();
        String sessionUser = (String) session.getAttribute("user");
        String sessionPass = (String) session.getAttribute("pass");
        if (user.equals(sessionUser) && pass.equals(sessionPass)) {
            response.sendRedirect("index.jsp");
        } else {
            response.sendRedirect("login.jsp");
        }
    }
}