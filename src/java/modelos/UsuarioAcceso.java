
package modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import config.Conexion;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.util.logging.Level;


public class UsuarioAcceso {
    Connection con;
    PreparedStatement ps; 
    ResultSet rs;
    Conexion cn = new Conexion();
    
    public Usuario Validar(String correo, String contrasena) throws SQLException{
        Usuario usuario = new Usuario();
        String consulta = "SELECT * FROM usuarios WHERE correo = ? AND contrasena = ?"; // consulta a la base de datos en la tabla usuarios 
        con = cn.Conexion();
        if (con == null) {
            throw new SQLException("No se pudo establecer la conexión con la base de datos.");
        }
        try {
            ps = con.prepareStatement(consulta);
            ps.setString(1, correo);
            ps.setString(2, contrasena);
            rs = ps.executeQuery();
            rs.next();
            
            do{
                usuario.setId(rs.getInt("id"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setCorreo(rs.getString("correo"));
                usuario.setContrasena(rs.getString("contrasena"));
                usuario.setEstado(rs.getString("estado"));
            }while(rs.next());
            
        } catch(SQLException ex){
            Logger.getLogger(UsuarioAcceso.class.getName()).log(Level.SEVERE,null, ex);
        } 
        return usuario;
    }
}
