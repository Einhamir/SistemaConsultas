/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.consultas.dao;

import com.oracle.consultas.model.Doctor;
import java.util.HashSet;
import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Java
 */
public class DoctorDaoTest {
    
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void crearDoctorTest(){
        IDoctorDao doctoDAO = new DoctorDao();
        Doctor simi = new Doctor();
        simi.setCodigo(1);
        simi.setNombre("Juan");
        simi.setApellido("Juarez");
        simi.setEspecialidad("Oftamologo");
        
        doctoDAO.crearDoctor(simi);
    }
}
