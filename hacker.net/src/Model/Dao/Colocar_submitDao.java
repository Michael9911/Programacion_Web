package Model.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.*;

import Model.Colocar_submit;

/**
 * 
 */
public class Colocar_submitDao extends Colocar_submitDaoImplement {

    /**
     * Default constructor
     */
    public Colocar_submitDao() {
    }

    /**
     * @param colocar_submit
     */
    public boolean addColocar_submit(Colocar_submit colocar_submit) {
    	try { 
			  
            // Initialize the database 
            Connection con = connection.initializeDatabase(); 
  
            // Create a SQL query to insert data into demo table 
            // demo table consists of two columns, so two '?' is used 
            PreparedStatement st = con 
                   .prepareStatement("INSERT INTO colocar_submit VALUES(?, ?)"); 
  
            // For the first parameter, 
            // get the data using request object 
            // sets the data to st pointer 
            st.setLong(2, colocar_submit.getId_publicacion());
            st.setString(1, colocar_submit.getUser_name());
  
            // Execute the insert command using executeUpdate() 
            // to make changes in database 
            st.executeUpdate(); 
  
            // Close all the connections 
            st.close(); 
            con.close(); 
  
            // Get a writer pointer  
            // to display the succesful result
            return true;
        } 
        catch (Exception e) { 
            e.printStackTrace(); 
            return false;
        } 
    }

    /**
     * @param colocar_submit
     */
    public void searchSubmitByUser(Colocar_submit colocar_submit) {
        // TODO implement here
    }

    /**
     * @param colocar_submit
     */
    public void deleteSubmitByUser(Colocar_submit colocar_submit) {
        // TODO implement here
    }

}