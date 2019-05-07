package Model.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.*;

import Model.Empresa;

/**
 * 
 */
public class EmpresaDao extends EmpresaDaoImplement {

    /**
     * Default constructor
     */
    public EmpresaDao() {
    }

    /**
     * @param empresa
     */
    public void addEmpresa(Empresa empresa) {
    	try { 
			  
            // Initialize the database 
            Connection con = connection.initializeDatabase(); 
  
            // Create a SQL query to insert data into demo table 
            // demo table consists of two columns, so two '?' is used 
            PreparedStatement st = con 
                   .prepareStatement("INSERT INTO company VALUES(?, ?, ?)"); 
  
            // For the first parameter, 
            // get the data using request object 
            // sets the data to st pointer 
            st.setString(1, empresa.getUser_company());
            st.setString(2, empresa.getPassword());
  
            // Execute the insert command using executeUpdate() 
            // to make changes in database 
            st.executeUpdate(); 
  
            // Close all the connections 
            st.close(); 
            con.close(); 
  
            // Get a writer pointer  
            // to display the succesful result
            //return true;
        } 
        catch (Exception e) { 
            e.printStackTrace(); 
            //return false;
        } 
    }

    /**
     * @param empresa
     */
    public void updateEmpresa(Empresa empresa) {
        // TODO implement here
    }

    /**
     * @param empresa
     */
    public void deleteEmpresa(Empresa empresa) {
        // TODO implement here
    }

    /**
     * @param empresa
     */
    public void searchByName(Empresa empresa) {
        // TODO implement here
    }

}