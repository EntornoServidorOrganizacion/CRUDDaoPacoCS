/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.DAO;

import es.albarregas.beans.Equipo;
import java.util.ArrayList;

/**
 *
 * @author paco
 */
public interface IEquiposDAO {
    public ArrayList<Equipo> leerEquipos();
    public ArrayList<Equipo> leerEquiposSinAlumno();
    public ArrayList<Equipo> insertarEquipo();
    public ArrayList<Equipo> actualizarEquipo();
    public ArrayList<Equipo> eliminarEquipos();
    public void closeConnection();
}
