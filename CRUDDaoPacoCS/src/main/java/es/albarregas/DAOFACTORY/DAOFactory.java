/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.DAOFACTORY;

import es.albarregas.DAO.IAlumnosDAO;
import es.albarregas.DAO.IEquiposDAO;

/**
 *
 * @author paco
 */
public abstract class DAOFactory {

    public static final int MYSQL = 1;

    public abstract IAlumnosDAO getAlumnosDAO();
    public abstract IEquiposDAO getEquiposDAO();

    public static DAOFactory getDAOFactory(int tipo) {
        DAOFactory daof = null;

        switch (tipo) {
            case MYSQL:
                daof = new MySQLDAOFactory();
                break;
        }
        return daof;
    }
}
