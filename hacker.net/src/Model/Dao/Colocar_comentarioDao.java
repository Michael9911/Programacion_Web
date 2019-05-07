package Model.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.*;

import Model.Colocar_comentario;

/**
 * 
 */
public class Colocar_comentarioDao extends Colocar_comentarioDaoImplement {

    /**
     * Default constructor
     */
    public Colocar_comentarioDao() {
    }


    /**
     * @param colocar_comentario
     */
    public void addColocar_comentario(Colocar_comentario colocar_comentario) {
    	try { 
			  
            // Initialize the database 
            Connection con = connection.initializeDatabase(); 
  
            // Create a SQL query to insert data into demo table 
            // demo table consists of two columns, so two '?' is used 
            PreparedStatement st = con 
                   .prepareStatement("INSERT INTO colocar_comment VALUES(?, ?,?)"); 
  
            // For the first parameter, 
            // get the data using request object 
            // sets the data to st pointer 
            st.setString(1,colocar_comentario.getUser_name());
            st.setLong(2, colocar_comentario.getId_publicacion());
            st.setLong(3, colocar_comentario.getId_comentario());
          
  
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
     * @param colocar_comentario
     */
    public void searchColocar_comentario(Colocar_comentario colocar_comentario) {
        // TODO implement here
    }

    /**
     * @param colocar_comentario
     */
    public void deleteColocar_comentario(Colocar_comentario colocar_comentario) {
        // TODO implement here
    }

}