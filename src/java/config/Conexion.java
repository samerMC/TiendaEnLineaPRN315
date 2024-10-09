package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {
    private Connection con;
    private String url = "mysql://root:qvulhhObYEgOXTgZrsDeTyXVVYIEApUs@autorack.proxy.rlwy.net:40691/railway"; 
    private String usuario = "root";
    private String clave = "qvulhhObYEgOXTgZrsDeTyXVVYIEApUs";

    public Connection Conexion() { 
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            con = DriverManager.getConnection(url, usuario, clave);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, "Error al cargar el controlador MySQL", ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, "Error al establecer la conexión con la base de datos", ex);
        }
        return con;
    }
}
