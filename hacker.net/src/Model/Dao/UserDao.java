package Model.Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import Model.User;

/**
 * 
 */
public class UserDao extends UserDaoImplement {
    /**
     * Default constructor
     */
    public UserDao() {
    }

    /**
     * @param user
     */
    public boolean addUser(User user) {
    	 try { 
			  
	            // Initialize the database 
	            Connection con = connection.initializeDatabase(); 
	  
	            // Create a SQL query to insert data into demo table 
	            // demo table consists of two columns, so two '?' is used 
	            PreparedStatement st = con 
	                   .prepareStatement("INSERT INTO user VALUES(?, ?, ?, ?, ?)"); 
	  
	            // For the first parameter, 
	            // get the data using request object 
	            // sets the data to st pointer 
	            st.setString(1, user.getUser_name()); 
	  
	            // Same for second parameter
	            st.setString(5, user.getPassword()); 
	            
	            st.setString(3, "");
	            
	            st.setString(4, "");
	            
	            st.setDate(2, (Date) user.getDate());
	  
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
     * @param user
     */
    public void updateUser(User user) {
        // TODO implement here
    }

    /**
     * @param user_name
     * @return 
     */
    public User searchByName(String user_name) {
    	User user = new User();
    	try 
    	{
    		// Initialize the database 
            Connection con = connection.initializeDatabase(); 
  
            // Create a SQL query to insert data into demo table 
            // demo table consists of two columns, so two '?' is used 
            PreparedStatement st = con 
                   .prepareStatement("SELECT user_name,password FROM user WHERE user_name = '" + user_name + "'"); 
    		
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
            	
            	 user.setUser_name( rs.getString("user_name") );
            	 user.setPassword( rs.getString("password") );
            }
            
    		return user;
    	}catch(Exception e)
    	{
    		return user;
    	}
    }

    /**
     * @param user 
     * @param new_password
     */
    public void changePassword(User user, String new_password) {
        // TODO implement here
    }

    /**
     * @param email
     */
    public void searchByEmail(String email) {
        // TODO implement here
    }
    

}