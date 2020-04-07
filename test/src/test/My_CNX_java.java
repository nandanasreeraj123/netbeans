/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nandu
 */
package test;
import java.sql.*;


public class My_CNX_java {
    
    
    private static final  String USERNAME = "root";
    private static final String PASSWORD = "";
    public static final String CONN_STRING = "jdbc:mysql://localhost:3306/employee?serverTimezone=UTC";
    
    
    public static void main(String[] args)
    {
        Connection con = null;
        
        try{
            con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            System.out.println("connected");
        }
        catch (SQLException e){
            System.err.println(e);
        }
        
        
          
    }
    
}
