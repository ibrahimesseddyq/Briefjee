package com.example.briefjee.DAO;

import java.sql.*;
import java.util.Properties;

public class DAOFactory {
    private String url;
    private String password;
    private String username;

     DAOFactory(String url, String username , String password) {
        this.url=url;
        this.username=username;
        this.password=password;
    }
    public static DAOFactory getInstance(){
         try{
             Class.forName("com.mysql.jdbc.Driver");
         }catch (Exception e ){

         }
         DAOFactory daoFactory = new DAOFactory("jdbc:mysql://localhost:3306/briefjee","root","");
         return daoFactory;
    }
    public  Connection getConnection() throws SQLException{
         return DriverManager.getConnection(url,username,password);
    }

}
