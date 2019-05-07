package Model.Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.*;

import Model.Job;

/**
 * 
 */
public class JobDao extends JobDaoImplement {

    /**
     * Default constructor
     */
    public JobDao() {
    }

    /**
     * @param job
     */
    public void addJob(Job job) {
    	try { 
			  
            // Initialize the database 
            Connection con = connection.initializeDatabase(); 
  
            // Create a SQL query to insert data into demo table 
            // demo table consists of two columns, so two '?' is used 
            PreparedStatement st = con 
                   .prepareStatement("INSERT INTO job VALUES(?, ?, ?, ?, ?)"); 
  
            // For the first parameter, 
            // get the data using request object 
            // sets the data to st pointer 
	        st.setLong(1,job.getId_company());
	        st.setString(2,job.getLink());
	        st.setString(3, job.getTitulo());
	        st.setDate(3, (Date) job.getFecha());
  
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
     * @param job
     */
    public void updateJob(Job job) {
        // TODO implement here
    }

    /**
     * @param job
     */
    public void searchAllJob(Job job) {
        // TODO implement here
    }

}