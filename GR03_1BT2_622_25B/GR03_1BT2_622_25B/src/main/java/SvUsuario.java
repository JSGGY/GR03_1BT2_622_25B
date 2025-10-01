
import Entidades.Controladora;
import Entidades.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/SvUsuario"})
public class SvUsuario extends HttpServlet {
    
    Controladora control = new Controladora();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Usuario> listaUsuarios = control.obtenerUsuario();
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String usuarioIngresado = request.getParameter("usuario");
            String passwordIngresado = request.getParameter("password");
            
            boolean loginExitoso = false;
            
            for (Usuario u : listaUsuarios) {
                if (u.getUsuario().equals(usuarioIngresado) && 
                    u.getPassword().equals(passwordIngresado)) {
                    loginExitoso = true;
                    break;
                }
            }
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Resultado Login</title>");   
            out.println("<link rel='stylesheet' href='./index.css'>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class='login-container'>");
            
            if(loginExitoso){
                out.println("<h1>¡Login exitoso!</h1>");
                out.println("<p>Bienvenido, " + usuarioIngresado + ".</p>");
            } else {
                out.println("<h1>Login fallido</h1>");
                out.println("<p>Usuario o contraseña incorrectos.</p>");
                out.println("<a href='index.jsp'>Volver al login</a>");
            }
            
            out.println("</div>");
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
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Servlet de login validando contra lista de usuarios de la BD";
    }
}
