package swig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Utiles {
    
    
    
      public static Connection getConex() {
        String user = "root";
        String pass = "";
        String url = "jdbc:mysql://localhost:3306/control";
        //se crea objeto conection
        Connection conexion = null;
        try {
            //se le pasan los parametros de entrada al objeto connection
            conexion = DriverManager.getConnection(url, user, pass);
        } catch (Exception ex) {
            Logger.getLogger(loginTabla.class.getName()).log(Level.SEVERE, null, ex);
        }

        return conexion;
    }
}
