/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.DAO;

import es.albarregas.beans.Equipo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author paco
 */
public class EquiposDAO implements IEquiposDAO{
    
    @Override
    public ArrayList<Equipo> leerEquipos() {
        ArrayList<Equipo> lista = new ArrayList();
        String consulta = "Select * from equipos";
        //Esto jamás en la vida me puede devolver un resultSet 
        try {
            Statement sentencia = ConnectionFactory.getConnection().createStatement();
            ResultSet resultado = sentencia.executeQuery(consulta);

            while (resultado.next()) {
                Equipo equipo = new Equipo();
                equipo.setIdEquipo(resultado.getInt("idEquipo"));
                equipo.setMarca(resultado.getString("marca"));
                equipo.setNumSerie(resultado.getString("numSerie"));
                lista.add(equipo);
            }

            resultado.close();

        } catch (SQLException ex) {
            System.out.println("Error al ejecutar la sentecnia");
            ex.printStackTrace();
        }

        return lista;
    }

    @Override
    public ArrayList<Equipo> leerEquiposSinAlumno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Equipo> insertarEquipo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Equipo> actualizarEquipo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Equipo> eliminarEquipos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void closeConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
