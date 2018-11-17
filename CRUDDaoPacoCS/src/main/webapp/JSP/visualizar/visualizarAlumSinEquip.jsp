<%-- 
    Document   : visualizarAlumSinEquipo
    Created on : 17 nov. 2018, 18:12:31
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
        <h1>Alumnos sin equipo: </h1>
        <p>Nombre y Grupo</p>
        <c:forEach var="alumno" items="${alumSinEquip}">
            Nombre: ${alumno.nombre} | Grupo: ${alumno.grupo}</br>
        </c:forEach>

        <br><br>
        <c:url var="index" value="index.jsp"/>
        <a href="${index}">Menú</a>
        
    </body>
</html>