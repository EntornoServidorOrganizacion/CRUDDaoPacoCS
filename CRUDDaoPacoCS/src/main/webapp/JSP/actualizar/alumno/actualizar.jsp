<%-- 
    Document   : actualizar
    Created on : 16 nov. 2018, 17:50:24
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
    </body>
</html>
