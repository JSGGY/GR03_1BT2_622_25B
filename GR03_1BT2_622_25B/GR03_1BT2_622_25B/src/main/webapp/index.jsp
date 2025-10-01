
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
</body>
</html>
