<%-- 
    Document   : leerActualizar
    Created on : 16 nov. 2018, 17:50:07
    Author     : paco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar</title>
    </head>
    <body>
        <form action="Realizar" method="post">
            <h1>Alumnos: </h1>
            <c:forEach var="alumno" items="${alumnos}">
                <input type="radio" value="${alumno.idAlumno}" name="alumnosActualizar"><label id="listadoActualizar">${alumno.nombre}</label>
                <br>
            </c:forEach>
            <br><br>

            <button type="submit" value="cancelar" name="operacion">Cancelar</button>
            <button id="actualizar" type="submit" value="aceptarActualizar" name="operacion">Actualizar</button>
        </form>
    </body>
</html>
