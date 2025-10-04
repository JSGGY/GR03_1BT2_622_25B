<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Capítulos</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
<h2>Capítulos del Manga</h2>
<div class="capitulos-container">
    <c:if test="${empty capitulos}">
        <p>No hay capítulos disponibles.</p>
    </c:if>
    <c:forEach var="capitulo" items="${capitulos}">
        <div class="capitulo-card">
            <h3>${capitulo.titulo} (N°${capitulo.numero})</h3>
            <p>${capitulo.descripcion}</p>
            <a href="mostrarCapitulo?capituloId=${capitulo.id}" class="btn-primary btn-small">Ver Imágenes</a>
        </div>
    </c:forEach>
</div>
<a href="index.jsp" class="btn-secondary">← Volver</a>
</body>
</html>

