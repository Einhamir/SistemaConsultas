/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.consultas.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Java
 */
public class DAO {
    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    
    public void Conectar(){
        String url = "jdbc:derby://localhost:1527/";
        String dbName = "Consultas";
        String driver = "org.apache.derby.jdbc.ClientDriver";
        String userName = "root";
        String password ="root";
        
        try{
            Class.forName(driver).newInstance(); //Crea una nueva instancia del driver como un singleton
            connection = DriverManager.getConnection(url+dbName, userName, password);
            System.out.print("Conexión exitosa");
        }
        catch(Exception e)
        {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null,e);
        }
        
    }
   
    public void cerrarConexion()
    {
        try{
            if(connection != null)
            {
                if(!connection.isClosed())
                {
                    connection.close();
                }
            }    
        }catch (Exception e)
        {
            e.printStackTrace();
        }
                
        
    }
    
}
