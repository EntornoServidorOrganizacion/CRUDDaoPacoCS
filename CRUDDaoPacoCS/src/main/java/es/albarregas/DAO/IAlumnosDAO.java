/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.DAO;

import es.albarregas.beans.Alumno;
import java.util.ArrayList;

/**
 *
 * @author paco
 */
public interface IAlumnosDAO {
    public ArrayList<Alumno> leerAlumnos();
    public ArrayList<Alumno> leerAlumnosSinEquipo();
    public ArrayList<Alumno> leerAlumnosYEquipoAsociado();
    public ArrayList<Alumno> insertarAlumno();
    public ArrayList<Alumno> actualizarAlumno();
    public ArrayList<Alumno> eliminarAlumnos();
    public void closeConnection();
}
