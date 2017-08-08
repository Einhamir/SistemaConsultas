
package com.oracle.consultas.controller;

import com.oracle.consultas.dao.DoctorDao;
import com.oracle.consultas.model.Doctor;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Java
 */
@ManagedBean
@RequestScoped
public class DoctorBean {
    
    private Doctor doctor = new  Doctor();

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    
    public void registrar(){
        DoctorDao dao = new DoctorDao();
        dao.crearDoctor(doctor);
    }
}
