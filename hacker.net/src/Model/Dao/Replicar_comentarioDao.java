package Model.Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.*;

import Model.Replicar_comentario;

/**
 * 
 */
public class Replicar_comentarioDao extends Replicar_comentarioDaoImplement {

    /**
     * Default constructor
     */
    public Replicar_comentarioDao() {
    }

    /**
     * @param replicar_comentario
     */
    public void addReplicar_comentario(Replicar_comentario replicar_comentario) {
    	try { 
			  
            // Initialize the database 
            Connection con = connection.initializeDatabase(); 
  
            // Create a SQL query to insert data into demo table 
            // demo table consists of two columns, so two '?' is used 
            PreparedStatement st = con 
                   .prepareStatement("INSERT INTO replicar_comment VALUES(?, ?, ?)"); 
  
            // For the first parameter, 
            // get the data using request object 
            // sets the data to st pointer 
            st.setString(1, replicar_comentario.getUser_name());
            st.setLong(2, replicar_comentario.getId_comentario_creado());
            st.setLong(3, replicar_comentario.getId_comentario_final());
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
     * @param replicar_comentario
     */
    public void seachReplicar_comentario(Replicar_comentario replicar_comentario) {
        // TODO implement here
    }

    /**
     * @param replicar_comentario
     */
    public void deleteReplicar_comentario(Replicar_comentario replicar_comentario) {
        // TODO implement here
    }

}