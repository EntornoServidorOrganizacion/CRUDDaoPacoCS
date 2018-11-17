/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.controllers;

import es.albarregas.DAO.IAlumnosDAO;
import es.albarregas.DAO.IEquiposDAO;
import es.albarregas.DAOFACTORY.DAOFactory;
import es.albarregas.beans.Alumno;
import es.albarregas.beans.Equipo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author paco
 *
 * Venimos desde el index.jsp y redirigimos a: - insertar.jsp - leerEliminar.jsp
 * - leerActualizar.jsp - visualizar.jsp
 */
@WebServlet(name = "primerControlador", urlPatterns = {"/primerControlador"})
public class primerControlador extends HttpServlet {

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = "";

        if (request.getParameter("operacion") != null) {
            switch (request.getParameter("operacion")) {
                case "insertAlumno":
                    url = "JSP/insertar/insertar.jsp";
                    break;
                case "insertEquipo":
                    url = "JSP/insertar/insertar.jsp";
                    break;
                case "actualizarAlumno":
                    url = "JSP/actualizar/leerActualizar.jsp";
                    break;
                case "actualizarEquipo":
                    url = "JSP/actualizar/leerActualizar.jsp";
                    break;
                case "eliminarAlumnos":
                    url = "JSP/eliminar/leerEliminar.jsp";
                    break;
                case "eliminarEquipos":
                    url = "JSP/eliminar/leerEliminar.jsp";
                    break;
                case "visualizarAlumnos":
                    obtenerDatos(request, response);
                    url = "JSP/visualizar/visualizarAlumnos.jsp";
                    break;
                case "visualizarEquipos":
                    obtenerDatos(request, response);
                    url = "JSP/visualizar/visualizarEquipos.jsp";
                    break;
                case "visualizarAlumYEquipAsociados":
                    obtenerDatos(request, response);
                    url = "JSP/visualizar/visualizarAlumYEquipAsociados.jsp";
                    break;
                case "visualizarAlumYEquip":
                    obtenerDatos(request, response);
                    url = "JSP/visualizar/visualizarAlumYEquip.jsp";
                    break;
                case "visualizarAlumSinEquip":
                    obtenerDatos(request, response);
                    url = "JSP/visualizar/visualizarAlumSinEquip.jsp";
                    break;
                case "visualizarEquipSinAlum":
                    obtenerDatos(request, response);
                    url = "JSP/visualizar/visualizarEquipSinAlum.jsp";
                    break;
            }
        }

        request.getRequestDispatcher(url).forward(request, response);
    }

    public void obtenerDatos(HttpServletRequest request, HttpServletResponse response) {
        if (request.getParameter("operacion").equals("visualizarAlumnos")) {

            DAOFactory daof = DAOFactory.getDAOFactory(1);
            IAlumnosDAO odao = daof.getAlumnosDAO();
            ArrayList<Alumno> alumnos = odao.leerAlumnos();

            request.setAttribute("alumnos", alumnos);
        } else if(request.getParameter("operacion").equals("visualizarEquipos")){
            DAOFactory daof = DAOFactory.getDAOFactory(1);
            IEquiposDAO odao = daof.getEquiposDAO();
            ArrayList<Equipo> equipos = odao.leerEquipos();
            
            request.setAttribute("equipos", equipos);
        } else if(request.getParameter("operacion").equals("visualizarAlumYEquipAsociados")){
            DAOFactory daof = DAOFactory.getDAOFactory(1);
            IAlumnosDAO odao = daof.getAlumnosDAO();
            ArrayList<Alumno> alumnosYEquipoAsociado = odao.leerAlumnosYEquipoAsociado();
            
            request.setAttribute("alumnosYEquipoAsociado", alumnosYEquipoAsociado);
        } else if(request.getParameter("operacion").equals("visualizarAlumSinEquip")){
            DAOFactory daof = DAOFactory.getDAOFactory(1);
            IAlumnosDAO odao = daof.getAlumnosDAO();
            ArrayList<Alumno> alumSinEquip = odao.leerAlumnosSinEquipo();
            
            request.setAttribute("alumSinEquip", alumSinEquip);
        }
    }

}
