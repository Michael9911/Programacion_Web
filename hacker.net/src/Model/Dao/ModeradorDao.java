package Model.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.*;

import Model.Moderador;

/**
 * 
 */
public class ModeradorDao extends ModeradorDaoImplement {

    /**
     * Default constructor
     */
    public ModeradorDao() {
    }

    /**
     * @param moderador
     */
    public void addModerador(Moderador moderador) {
    	try { 
			  
            // Initialize the database 
            Connection con = connection.initializeDatabase(); 
  
            // Create a SQL query to insert data into demo table 
            // demo table consists of two columns, so two '?' is used 
            PreparedStatement st = con 
                   .prepareStatement("INSERT INTO moderador VALUES(?, ?, ?)"); 
  
            // For the first parameter, 
            // get the data using request object 
            // sets the data to st pointer 
            st.setString(1, moderador.getUser_name());
            st.setString(2, moderador.getPassword());
            st.setDate(3,(java.sql.Date) moderador.getDate());
  
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
     * @param moderador
     */
    public void updateModerador(Moderador moderador) {
        // TODO implement here
    }

    /**
     * @param user_name
     */
    public void searchByName(String user_name) {
        // TODO implement here
    }

    /**
     * @param user_name
     */
    public void deleteModerador(String user_name) {
        // TODO implement here
    }

}