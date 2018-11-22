/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.DAO;

import es.albarregas.beans.Alumno;
import es.albarregas.beans.Equipo;
import java.sql.PreparedStatement;
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
        String consulta = "Select * from alumnos;";

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
        String consulta = "select nombre, grupo from alumnos where idEquipo is null;";

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
        String consulta = "Select a.nombre, a.grupo, e.marca, e.idEquipo from alumnos as a inner join equipos as e using(idEquipo);";

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
    public void insertarAlumno(Alumno alumno) {
        String consulta = "insert into alumnos (nombre, grupo, idEquipo) values (?,?,?)";

        try {

            PreparedStatement sentencia = ConnectionFactory.getConnection().prepareStatement(consulta);

            sentencia.setString(1, alumno.getNombre());
            sentencia.setString(2, alumno.getGrupo());
            sentencia.setInt(3, alumno.getEquipo().getIdEquipo());

            sentencia.executeUpdate();

            sentencia.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public void actualizarAlumno(Alumno alumno) {
        String consulta = "uptade alumnos set nombre=?, grupo=?, idEquipo=? where idAlumno=?";

        try {
            PreparedStatement sentencia = ConnectionFactory.getConnection().prepareStatement(consulta);

            sentencia.setString(1, alumno.getNombre());
            sentencia.setString(2, alumno.getGrupo());
            sentencia.setInt(3, alumno.getEquipo().getIdEquipo());

            sentencia.executeUpdate();

            sentencia.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void eliminarAlumnos(Alumno alumno) {
        String consulta = "delete from alumnos where idAlumno=?";

        try {
            PreparedStatement sentencia = ConnectionFactory.getConnection().prepareStatement(consulta);

            sentencia.setString(1, alumno.getNombre());
            sentencia.setString(2, alumno.getGrupo());
            sentencia.setInt(3, alumno.getEquipo().getIdEquipo());

            sentencia.executeUpdate();

            sentencia.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public Alumno getAlumno(int idAlumno) {
        Alumno alumno = new Alumno();
        String consulta = "Select * from alumnos where idAlumno=?;";

        try {
            Statement sentencia = ConnectionFactory.getConnection().createStatement();
            ResultSet resultado = sentencia.executeQuery(consulta);

            while (resultado.next()) {

                alumno.setIdAlumno(resultado.getInt("idAlumno"));
                alumno.setNombre(resultado.getString("nombre"));
                alumno.setGrupo(resultado.getString("grupo"));
            }

            resultado.close();

        } catch (SQLException ex) {
            System.out.println("Error al ejecutar la sentecnia");
            ex.printStackTrace();
        }

        return alumno;
    }

    @Override
    public void closeConnection() {
        ConnectionFactory.closeConexion();
    }

}
