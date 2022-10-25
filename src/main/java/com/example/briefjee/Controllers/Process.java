package com.example.briefjee.Controllers;


import com.example.briefjee.DAO.DAOFactory;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.Writer;
import java.sql.SQLException;
import java.util.Properties;

@WebServlet( value = "/process_login",initParams = {
        @WebInitParam(name = "username",value = "jamal"),
        @WebInitParam(name = "password",value = "l'ingenieur")
})

public class Process extends HttpServlet {
    private String username;
    private String password;
    @Override
    public void init(ServletConfig config){
        this.username=config.getInitParameter("username");
        this.password=config.getInitParameter("password");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        Writer out = response.getWriter();
//        try {
//            Properties properties = new Properties();
//            properties.put("user","root");
//            properties.put("password","root");
//
////            DAOFactory connections = new DAOFactory("jdbc:mysql://localhost:3306/wimsaas",properties);
////            connections.queryWbs_page();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        out.write("i'm from doGet");
//        String username=request.getParameter("username");
//        String password=request.getParameter("password");
//
//        if(this.password.equals(password) && this.username.equals(username)) {
//            out.write("True");
//            this.getServletContext().getRequestDispatcher("WEB-INF/dashboard.jsp").include(request, response);
//
//        }else {
//            out.write("False");
//
//            this.getServletContext().getRequestDispatcher("WEB-INF/Sorry.jsp").forward(request, response);
//        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Writer out = response.getWriter();

        try{

            String user = request.getParameter("username");
            String pass = request.getParameter("password");
            if(user.equals(this.username) && pass.equals(this.password)){
//                ((PrintWriter) out).printf("Hi ,%s you are logged in",user);
                this.getServletContext().getRequestDispatcher("WEB-INF/dashboard.jsp").include(request,response);

            }else {
//                out.write("Sorry not logged in");
                this.getServletContext().getRequestDispatcher("WEB-INF/dashboard.jsp").forward(request,response);

            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
//    @Override
//    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        Writer out = response.getWriter();
//        out.write("i'm from Service");
//    }
}
