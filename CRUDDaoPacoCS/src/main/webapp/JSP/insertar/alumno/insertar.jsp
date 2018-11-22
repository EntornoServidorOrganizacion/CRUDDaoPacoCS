<%-- 
    Document   : insertar
    Created on : 16 nov. 2018, 17:54:02
    Author     : paco
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insertar</title>
    </head>
    <body>
         <form action="Realizar" method="post">
            <table>
                <tr>
                    <td><label>Nombre: </label></td>
                    <td><input type="text" value="" name="nombreAlum" maxlength="50"/></td>
                </tr>
                <tr>
                    <td><label>Grupo: </label></td>
                    <td><input type="text" value="" name="grupoAlum" maxlength="5"/></td>
                </tr>
                <tr>
                    <td><label>id Equipo: </label></td>
                    <td></td>
                </tr>
            </table>
            <button type="submit" value="cancelar" name="operacion">Cancelar</button>
            <button id="insertar" type="submit" value="insertarAlumno" name="operacion">Crear</button>
        </form>
    </body>
</html>
