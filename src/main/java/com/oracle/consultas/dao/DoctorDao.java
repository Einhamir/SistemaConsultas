/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.consultas.dao;

import com.oracle.consultas.model.Doctor;
import java.sql.PreparedStatement;
import java.util.List;

/**
 *
 * @author Java
 */
//IMPLEMENTACION DE LOS METODOS DE LA  INTERFAZ IDOCTORDAO
//EXTIENDE DE DAO para obtener el acceso a la conexion
public class DoctorDao extends DAO implements IDoctorDao {

    private String crearSql = "Insert Into DOCTOR (CODIGO,NOMBRE,APELLIDO,ESPECIALIDAD) values (?,?,?,?)";
    @Override
    public void crearDoctor(Doctor doctor) {
       this.Conectar();
       try{
        PreparedStatement pst = this.getConnection().prepareStatement(crearSql);
        pst.setInt(1, doctor.getCodigo());
        pst.setString(2, doctor.getNombre());
        pst.setString(3, doctor.getApellido());
        pst.setString(4, doctor.getEspecialidad());
        
        pst.executeUpdate();
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
       finally
       {
           this.cerrarConexion();
       }
    }

    @Override
    public void eliminarDoctor(Doctor doctor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificarDoctor(Doctor doctor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Doctor buscaDoctor(Doctor doctor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Doctor> listaDoctores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
