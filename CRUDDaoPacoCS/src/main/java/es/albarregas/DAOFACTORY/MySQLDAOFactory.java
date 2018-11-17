/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.DAOFACTORY;

import es.albarregas.DAO.AlumnosDAO;
import es.albarregas.DAO.EquiposDAO;
import es.albarregas.DAO.IAlumnosDAO;
import es.albarregas.DAO.IEquiposDAO;

/**
 *
 * @author paco
 */
public class MySQLDAOFactory extends DAOFactory {

    @Override
    public IAlumnosDAO getAlumnosDAO() {
        return new AlumnosDAO();
    }

    @Override
    public IEquiposDAO getEquiposDAO() {
        return new EquiposDAO();
    }
    
    
    
}
