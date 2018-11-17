<%-- 
    Document   : visualizarAlumYEquip
    Created on : 17 nov. 2018, 18:11:57
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
        <h1>Equipos: </h1>
        <p>Marca y Número de serie</p>
        <c:forEach var="equipo" items="${equipos}">
            Marca: ${equipo.marca} | Num. Serie: ${equipo.numSerie}</br>
        </c:forEach>

        <br><br>
        <c:url var="index" value="index.jsp"/>
        <a href="${index}">Menú</a>
        
    </body>
</html>