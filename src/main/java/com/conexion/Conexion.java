/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conexion;
import java.sql.*;
/**
 *
 * @author KamiVela
 */
public class Conexion {
    private Connection con;

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    public void conectar()throws Exception{
        try {
            con = DriverManager.getConnection
            ("jdbc:mysql://localhost:3306/tarea?user=root&password=");
        } catch (Exception e) {
            throw e;
        }
    }
    public void desconectar()throws Exception{
        try {
            if (con!=null) {
                if (con.isClosed()==false) {
                    con.close();
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    
}
