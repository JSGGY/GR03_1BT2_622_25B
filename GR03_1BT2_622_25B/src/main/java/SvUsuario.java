/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/SvUsuario"})
public class SvUsuario extends HttpServlet {

    private final String USUARIO_VALIDO = "admin";
    private final String PASSWORD_VALIDO = "1234";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String usuario = request.getParameter("usuario");
            String password = request.getParameter("password");

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Resultado Login</title>");   
            
            out.println("</head>");
            out.println("<body>");

            if(USUARIO_VALIDO.equals(usuario) && PASSWORD_VALIDO.equals(password)){
                out.println("<h1>¡Login exitoso!</h1>");
                out.println("<p>Bienvenido, " + usuario + ".</p>");
            } else {
                out.println("<h1>Login fallido</h1>");
                out.println("<p>Usuario o contraseña incorrectos.</p>");
                out.println("<a href='index.jsp'>Volver al login</a>");
            }

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
        return "Servlet de login con valores quemados";
    }
}
