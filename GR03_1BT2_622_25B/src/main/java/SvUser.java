import Entidades.Controller;
import Entidades.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/SvUser"})
public class SvUser extends HttpServlet {
    
    Controller control = new Controller();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {}
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {} 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Usuario> listaUsuarios = new ArrayList<>();
        listaUsuarios = control.getUser();
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String user = request.getParameter("username");
            String password = request.getParameter("password");
            boolean loged = false;
           
            for (Usuario u : listaUsuarios) {
                if (u.getUsername().equals(user) && 
                    u.getPassword().equals(password)) {
                    loged = true;
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
            
            if(loged){
                out.println("<h1>¡Login exitoso!</h1>");
                out.println("<p>Bienvenido, " + user + ".</p>");
            } else {
                out.println("<h1>Login fallido</h1>");
                
            }  
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    public String getServletInfo() {
        return "Servlet de login validado";
    }
}
