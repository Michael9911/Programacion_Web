package Model.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.*;

import Model.Comentarios;

/**
 * 
 */
public class ComentarioDao extends ComentariosDaoImplement {

    /**
     * Default constructor
     */
    public ComentarioDao() {
    }

    /**
     * @param comentario
     */
    public void addComentario(Comentarios comentario) {
    	try { 
			  
            // Initialize the database 
            Connection con = connection.initializeDatabase(); 
  
            // Create a SQL query to insert data into demo table 
            // demo table consists of two columns, so two '?' is used 
            PreparedStatement st = con 
                   .prepareStatement("INSERT INTO comment VALUES(?, ?, ?)"); 
  
            // For the first parameter, 
            // get the data using request object 
            // sets the data to st pointer 
            st.setLong(1, comentario.getId_comentario());
            st.setString(2,comentario.getDescription());
            st.setInt(3, comentario.getPuntaje());
            
  
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
     * @param comentario
     */
    public void updateComentario(Comentarios comentario) {
        // TODO implement here
    }

    /**
     * @param id_comentario
     */
    public void searchById(long id_comentario) {
        // TODO implement here
    }

    /**
     * @param id_comentario
     */
    public void deleteComentario(long id_comentario) {
        // TODO implement here
    }

}