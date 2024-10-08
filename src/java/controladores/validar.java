
package controladores;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelos.Usuario;
import modelos.UsuarioAcceso;


@WebServlet(name = "validar", urlPatterns = {"/validar"})
public class validar extends HttpServlet {
    
    // Creamos un nuevo objeto de tipo Usuario y UsuarioAcceso
    Usuario usuario = new Usuario();
    UsuarioAcceso usuarioAcceso = new UsuarioAcceso();
    

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet validar</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet validar at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String accion = request.getParameter("accion"); 
        if(accion.equalsIgnoreCase("Ingresar")){
            String correo = request.getParameter("txtCorreo");
            String contrasena = request.getParameter("txtContrasena");
            try {
                usuario = usuarioAcceso.Validar(correo, contrasena);
            } catch (SQLException ex) {
                Logger.getLogger(validar.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(usuario != null && usuario.getNombre() != null){
                request.setAttribute("usuario", usuario);
                request.getRequestDispatcher("controlador?menu=Principal").forward(request, response);
            } else {
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
        } else {
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
