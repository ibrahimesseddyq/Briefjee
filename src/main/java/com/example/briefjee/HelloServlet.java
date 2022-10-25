package com.example.briefjee;

import com.example.briefjee.DAO.UserDAO;
import com.example.briefjee.DAO.UserDAOImpl;
import com.example.briefjee.Entity.User;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;
    private UserDAO userDAO;

    public void init() {
        message = "Hello World!";
        this.userDAO = new UserDAOImpl();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        this.userDAO.ajouter(new User("ibra","email","pass"));


        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }

   
}
