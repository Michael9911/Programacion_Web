package Model.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.*;

import Model.Puntaje_comentario;

/**
 * 
 */
public class Puntaje_comentarioDao extends Puntaje_comentarioDaoImplement {

    /**
     * Default constructor
     */
    public Puntaje_comentarioDao() {
    }


    /**
     * @param puntaje_comentario
     */
    public void addPuntaje_comentario(Puntaje_comentario puntaje_comentario) {
    	try { 
			  
            // Initialize the database 
            Connection con = connection.initializeDatabase(); 
  
            // Create a SQL query to insert data into demo table 
            // demo table consists of two columns, so two '?' is used 
            PreparedStatement st = con 
                   .prepareStatement("INSERT INTO puntaje_comentario VALUES(?, ?)"); 
  
            // For the first parameter, 
            // get the data using request object 
            // sets the data to st pointer 
            st.setLong(1,puntaje_comentario.getId_comentario());
            st.setString(2, puntaje_comentario.getUser_name());
  
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
     * @param puntaje_comentario
     */
    public void searchPuntaje_comentario(Puntaje_comentario puntaje_comentario) {
        // TODO implement here
    }

    /**
     * @param puntaje_comentario
     */
    public void deletePuntaje_comentario(Puntaje_comentario puntaje_comentario) {
        // TODO implement here
    }

}