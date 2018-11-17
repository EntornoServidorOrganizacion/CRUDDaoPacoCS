/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.DAO;

import es.albarregas.beans.Alumno;
import es.albarregas.beans.Equipo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author paco
 */
public class AlumnosDAO implements IAlumnosDAO {

    @Override
    public ArrayList<Alumno> leerAlumnos() {
        ArrayList<Alumno> lista = new ArrayList();
        String consulta = "Select * from alumnos";
        //Esto jamás en la vida me puede devolver un resultSet 
        try {
            Statement sentencia = ConnectionFactory.getConnection().createStatement();
            ResultSet resultado = sentencia.executeQuery(consulta);

            while (resultado.next()) {
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(resultado.getInt("idAlumno"));
                alumno.setNombre(resultado.getString("nombre"));
                alumno.setGrupo(resultado.getString("grupo"));
                lista.add(alumno);
            }

            resultado.close();

        } catch (SQLException ex) {
            System.out.println("Error al ejecutar la sentecnia");
            ex.printStackTrace();
        }

        return lista;
    }

    @Override
    public ArrayList<Alumno> leerAlumnosSinEquipo() {
        ArrayList<Alumno> lista = new ArrayList();
        String consulta = "select nombre, grupo from alumnos where idEquipo=''";
        //Esto jamás en la vida me puede devolver un resultSet 
        try {
            Statement sentencia = ConnectionFactory.getConnection().createStatement();
            ResultSet resultado = sentencia.executeQuery(consulta);

            while (resultado.next()) {
                Alumno alumno = new Alumno();
                alumno.setNombre(resultado.getString("nombre"));
                alumno.setGrupo(resultado.getString("grupo"));
                lista.add(alumno);
            }

            resultado.close();

        } catch (SQLException ex) {
            System.out.println("Error al ejecutar la sentecnia");
            ex.printStackTrace();
        }

        return lista;
    }

    @Override
    public ArrayList<Alumno> leerAlumnosYEquipoAsociado() {
        ArrayList<Alumno> lista = new ArrayList();
        String consulta = "Select a.nombre, a.grupo, e.marca, e.idEquipo from alumnos as a inner join equipos as e using(idEquipo)";
        //Esto jamás en la vida me puede devolver un resultSet 
        try {
            Statement sentencia = ConnectionFactory.getConnection().createStatement();
            ResultSet resultado = sentencia.executeQuery(consulta);

            while (resultado.next()) {
                Alumno alumno = new Alumno();
                alumno.setNombre(resultado.getString("nombre"));
                alumno.setGrupo(resultado.getString("grupo"));
                lista.add(alumno);
            }

            resultado.close();

        } catch (SQLException ex) {
            System.out.println("Error al ejecutar la sentecnia");
            ex.printStackTrace();
        }

        return lista;
    }

    @Override
    public ArrayList<Alumno> insertarAlumno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Alumno> actualizarAlumno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Alumno> eliminarAlumnos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void closeConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
