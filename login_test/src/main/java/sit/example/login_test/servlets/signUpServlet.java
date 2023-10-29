package sit.example.login_test.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "signUpServlet", value = "/signup")
public class signUpServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        String name = request.getParameter("Name");
        String email = request.getParameter("Email");
        String user = request.getParameter("Username");
        String pass = request.getParameter("Password");
        if(name.length() == 0  || email.length() == 0 ||user.length() == 0 || user.length() == 0 ){
            request.setAttribute("message" , "ใส่ข้อมูลให้ครบ");
            request.getRequestDispatcher("/singup.jsp").forward(request,response);
        }
        session.setAttribute("name" ,name);
        session.setAttribute("email" ,email);
        session.setAttribute("user" ,user);
        session.setAttribute("pass" ,pass);
        response.sendRedirect("login.jsp");

        // send to login page
    }
}