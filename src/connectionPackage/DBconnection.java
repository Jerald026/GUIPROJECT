/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectionPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Cerceas Bulawan
 */
public class DBconnection {
    
    public static Connection connect() throws ClassNotFoundException{
        Connection con=null;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
       try{
           con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;database=ExaminationSystem;user=admin;password=admin");
           System.out.println("Success");
           return con;
       }catch(SQLException e){
           System.out.println(e);
           return null;
       }
    }
}

