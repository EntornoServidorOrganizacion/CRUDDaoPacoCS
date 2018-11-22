<%-- 
    Document   : index
    Created on : 16 nov. 2018, 17:47:23
    Author     : paco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="CSS/normalizer.css">
        <link rel="stylesheet" type="text/css" href="CSS/estilos.css">
        <title>Menú</title>
    </head>
    <body>

        <form action="operacion" method="post">
            <h1>Elija una opción</h1>
            <div class="dropdown">
                <span>Insertar</span>
                <div class="dropdown-content">
                    <button type="submit" name="operacion" value="insertAlumno">Alumno</button>
                    <button type="submit" name="operacion" value="insertEquipo">Equipo</button>
                </div>
            </div>
            <div class="dropdown">
                <span>Actualizar</span>
                <div class="dropdown-content">
                    <button type="submit" name="operacion" value="actualizarAlumno">Alumno</button>
                    <button type="submit" name="operacion" value="actualizarEquipo">Equipo</button>
                </div>
            </div>
            <div class="dropdown">
                <span>Eliminar</span>
                <div class="dropdown-content">
                    <button type="submit" name="operacion" value="eliminarAlumnos">Alumnos</button>
                    <button type="submit" name="operacion" value="eliminarEquipos">Equipos</button>
                </div>
            </div>
            <div class="dropdown">
                <span>Visualizar</span>
                <div class="dropdown-content">
                    <button type="submit" name="operacion" value="visualizarAlumnos">Alumnos</button>
                    <button type="submit" name="operacion" value="visualizarEquipos">Equipos</button>
                    <button type="submit" name="operacion" value="visualizarAlumYEquipAsociados">Alumnos y equipos asociados</button>
                    <button type="submit" name="operacion" value="visualizarAlumYEquip">Alumnos por equipos</button>
                    <button type="submit" name="operacion" value="visualizarAlumSinEquip">Alumnos sin equipo</button>
                    <button type="submit" name="operacion" value="visualizarEquipSinAlum">Equipos sin alumnos</button>
                </div>
            </div>
        </form>

    </body>
</html>
