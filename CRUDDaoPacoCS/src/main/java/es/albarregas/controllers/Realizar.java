/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.controllers;

import es.albarregas.DAO.IAlumnosDAO;
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
import javax.servlet.http.HttpSession;

/**
 *
 * @author paco
 */
@WebServlet(name = "Realizar", urlPatterns = {"/Realizar"})
public class Realizar extends HttpServlet {

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
                case "insertarAlumno":
                    insertarAlumno(request, response);
                    url = "";
                    break;
            }
        }

        request.getRequestDispatcher(url).forward(request, response);
    }

    public void insertarAlumno(HttpServletRequest request, HttpServletResponse response) {

        if (request.getParameter("operacion").equals("insertarAlumno")) {
            HttpSession sesion = request.getSession();
            
            Alumno alum = new Alumno();
            Equipo equipo = new Equipo();
            
            
            
            alum.setNombre(request.getParameter("nombreAlum"));
            alum.setGrupo(request.getParameter("grupoAlum"));
            equipo.setIdEquipo(Integer.parseInt(request.getParameter("equipoAlumno")));
            alum.setEquipo(equipo);
            
            
            
            DAOFactory daof = DAOFactory.getDAOFactory(1);
            IAlumnosDAO odao = daof.getAlumnosDAO();
            
            //traer de la sesión el arrayList para que lo lea
            odao.insertarAlumno(alum);
            
            ArrayList<Alumno>alumnos = (ArrayList<Alumno>) sesion.getAttribute("alumno");
            alumnos.add(alum);
            sesion.setAttribute("alumno", alumnos);
        }
    }

}
