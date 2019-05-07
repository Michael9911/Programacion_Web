package Model.Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

import Model.Publicacion;
import Model.Puntaje_submit;

/**
 * 
 */
public class Puntaje_submitDao extends Puntaje_submitDaoImplement {

    /**
     * Default constructor
     */
    public Puntaje_submitDao() {
    }

    /**
     * @param puntaje_submit
     */
    public boolean addPuntaje_submit(Puntaje_submit puntaje_submit) {
    	try { 
			  
            // Initialize the database 
            Connection con = connection.initializeDatabase(); 
  
            // Create a SQL query to insert data into demo table 
            // demo table consists of two columns, so two '?' is used 
            PreparedStatement st = con 
                   .prepareStatement("INSERT INTO puntaje_submit VALUES(?, ?)"); 
  
            // For the first parameter, 
            // get the data using request object 
            // sets the data to st pointer 
            st.setLong(1,puntaje_submit.getId_publicacion());
            st.setString(2, puntaje_submit.getUser_name());
  
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
     * @param puntaje_submit
     */
    public Puntaje_submit searchPuntaje_submit(Puntaje_submit puntaje_submit) {
    	try { 
			  
   		 // Initialize the database 
           Connection con = connection.initializeDatabase(); 
           String sql = "SELECT id_submit,user_name FROM puntaje_submit WHERE id_submit=" + puntaje_submit.getId_publicacion() + " AND user_name= '"+puntaje_submit.getUser_name() + "'";
           PreparedStatement st = con 
                  .prepareStatement(sql);
           
           ResultSet rs = st.executeQuery();
           
           Puntaje_submit url = new Puntaje_submit();
           rs.next();
        	   long id = Long.parseLong(rs.getString("id_submit"));
        	   String name = rs.getString("user_name");
           		url.setId_publicacion( id );
           		url.setUser_name( name );
           
           
           // Close all the connections 
           st.close(); 
           con.close(); 
 
           // Get a writer pointer  
           // to display the succesful result
           return url;
       } 
       catch (Exception e) { 
           e.printStackTrace();
           return null;
       } 
    }

    /**
     * @param puntaje_submit
     */
    public boolean deletePuntaje_submit(Puntaje_submit puntaje_submit) {
    	try { 
			  
            // Initialize the database 
            Connection con = connection.initializeDatabase(); 
  
            // Create a SQL query to insert data into demo table 
            // demo table consists of two columns, so two '?' is used 
            PreparedStatement st = con 
                   .prepareStatement("Delete FROM puntaje_submit WHERE id_submit = " + puntaje_submit.getId_publicacion() + " AND "
                   		+ "user_name='" + puntaje_submit.getUser_name() +"'"); 
  
            // For the first parameter, 
            // get the data using request object 
            // sets the data to st pointer 
  
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

}