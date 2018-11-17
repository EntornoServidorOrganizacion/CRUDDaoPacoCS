<%-- 
    Document   : visualizarAlumYEquiposAsociados
    Created on : 17 nov. 2018, 18:11:35
    Author     : paco
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="CSS/normalizer.css">
        <link rel="stylesheet" type="text/css" href="CSS/estilos.css">
        <title>Visualizar</title>
    </head>
    <body>
        <h1>Alumnos y equipos: </h1>
        <p>Nombre | Grupo | Equipo y su número de serie</p>
        <c:forEach var="alumno" items="${alumnosYEquipoAsociado}">
            Nombre: ${alumnoEquipo.nombre} | Grupo: ${alumnoEquipo.grupo} | Equipo: ${alumnoEquipo.equipo.marca} con número de serie ${alumnoEquipo.equipo.numSerie}</br>
        </c:forEach>

        <br><br>
        <c:url var="index" value="index.jsp"/>
        <a href="${index}">Menú</a>
        
    </body>
</html>
