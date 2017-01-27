/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class conexion {
    private static final String DB_DRIVER ="oracle.jdbc.driver.OracleDriver";
            private static final String DB_CONNECTION="jdbc:oracle:thin:127.0.0.1:8080:xe";
            private static final String DB_USER="SYSTEM";
            private static final String DB_PASS="admin";
            
            public Connection getConexion()
            {
                Connection dbconnection=null;
                try
                {
                    Class.forName(DB_DRIVER);
                }
                catch(ClassNotFoundException e)
                {
                    
                    System.out.println(e.getMessage());
                }
                
                try
                {
                    dbconnection=DriverManager.getConnection(DB_CONNECTION,DB_USER,DB_PASS);
                    return dbconnection;
                }
                catch(SQLException e)
                {
                    
                    System.out.println(e.getMessage());
                }
                return dbconnection;
    } 
}
