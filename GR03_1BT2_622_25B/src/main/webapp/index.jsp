<%-- 
    Document   : index
    Created on : Sep 30, 2025, 8:17:55 AM
    Author     : jaang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Ejemplo</title>
    <link rel="stylesheet" href="index.css"
</head>
<body>
    <div class="login-container">
        <h1>Iniciar Sesión</h1>
        <form action="SvUsuario" method="POST">
            <input type="text" name="usuario" placeholder="Usuario" required>
            <input type="password" name="password" placeholder="Contraseña" required>
            <button type="submit">Ingresar</button>
        </form>
    </div>
    </form>
    
    <%-- Ejemplo de salida desde JSP --%>
    <% 
        String mensaje = "Hola desde Java!";
    %>
    <p><%= mensaje %></p>
</body>
</html>

