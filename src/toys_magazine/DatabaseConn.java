/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toys_magazine;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Мадияр
 */
public class DatabaseConn {
    
    private Connection connection = null;
    Connection conn = null;
    
    public static Connection ConnectDB(){
    try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connsrting = "jdbc:sqlserver://127.0.0.1:1433;databaseName=toys_store;user=User;password=12345";
        Connection conn = DriverManager.getConnection(connsrting);
        System.out.println("Connect!");
        return conn;
    }catch(Exception e){
        e.printStackTrace();
        return null;
    }
    } 
    
}
