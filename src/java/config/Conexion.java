package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    private Connection con;
    private String url = "jdbc:mysql://localhost:3306/bdtiendaropa"; // Cambiado a 3306
    private String usuario = "root";
    private String clave = "";

    public Connection getConnection() { // Cambiado el nombre del método
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Corregido el nombre del driver
            con = DriverManager.getConnection(url, usuario, clave);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}