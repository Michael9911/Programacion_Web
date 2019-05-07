package Model.Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

import Model.Publicacion;

/**
 * 
 */
public class PublicacionDao extends PublicacionDaoImplement {

    /**
     * Default constructor
     */
    public PublicacionDao() {
    }

    /**
     * @param publicacion
     */
    public boolean addPublicacion(Publicacion publicacion) {
    	try { 
			  
            // Initialize the database 
            Connection con = connection.initializeDatabase(); 
  
            // Create a SQL query to insert data into demo table 
            // demo table consists of two columns, so two '?' is used 
            PreparedStatement st = con 
                   .prepareStatement("INSERT INTO submit VALUES(?, ?, ?, ?, ?, ?)"); 
  
            // For the first parameter, 
            // get the data using request object 
            // sets the data to st pointer 
            st.setLong(1, publicacion.getId_publicacion());
            
            st.setString(2, publicacion.getLink());
            
            st.setString(3, publicacion.getTitulo());
            
            st.setString(4,publicacion.getDescription());
            
            st.setDate(5, (Date) publicacion.getFecha());
            
            st.setInt(6,publicacion.getPuntaje());
  
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
            return false;
        } 
    }

    /**
     * @param id_publicacion
     */
    public Publicacion searchById(long id_publicacion) {
    	try { 
			  
    		 // Initialize the database 
            Connection con = connection.initializeDatabase(); 
  
            // Create a SQL query to insert data into demo table 
            // demo table consists of two columns, so two '?' is used 
            PreparedStatement st = con 
                   .prepareStatement("SELECT * FROM submit WHERE id_submit=" + id_publicacion); 
  
            
            ResultSet rs = st.executeQuery(); 
            Publicacion url = new Publicacion();
            while(rs.next())
            {
            	url.setId_publicacion( Long.parseLong( rs.getString("id_submit") ) );
            	url.setLink( rs.getString("link") );
            	url.setTitulo( rs.getString("tittle"));
            	url.setDescription( rs.getString("description") );
            	url.setPuntaje( Integer.parseInt( rs.getString("puntaje") ) );
            }
            
            // Close all the connections 
            st.close(); 
            con.close(); 
  
            // Get a writer pointer  
            // to display the succesful result
            return url;
        } 
        catch (Exception e) { 
            return null;
        } 
    }

    /**
     * @param id_publicacion
     */
    public void deletePublicacion(long id_publicacion) {
        // TODO implement here
    }
    
    public String searchAll() {
    	 try { 
			  
	            // Initialize the database 
	            Connection con = connection.initializeDatabase(); 
	  
	            // Create a SQL query to insert data into demo table 
	            // demo table consists of two columns, so two '?' is used 
	            PreparedStatement st = con 
	                   .prepareStatement("SELECT * FROM submit"); 
	  
	            
	            ResultSet rs = st.executeQuery(); 
	            String url = "";
	            while(rs.next())
	            {
	            	url += "<label> <a href='"+rs.getString("link") + "'>" + rs.getString("tittle") + 
	            			"</a> Puntos: " + rs.getString("puntaje") + "</label> <br>";
	            }
	            // Close all the connections 
	            st.close(); 
	            con.close(); 
	  
	            // Get a writer pointer  
	            // to display the succesful result
	            return url;
	        } 
	        catch (Exception e) { 
	        }
		return null; 
    }

    public boolean updatePublicacion(Publicacion publicacion)
    {
    	try { 
			  
   		 // Initialize the database 
           Connection con = connection.initializeDatabase(); 
 
           // Create a SQL query to insert data into demo table 
           // demo table consists of two columns, so two '?' is used 
           PreparedStatement st = con 
                  .prepareStatement("UPDATE submit SET puntaje = ?, description = ?,"
                  		+ " WHERE id_submit=?"); 
 
           st.setInt(1, publicacion.getPuntaje());
           st.setLong(2, publicacion.getId_publicacion());
           
           st.executeUpdate();
           
           st.close(); 
           con.close(); 
 
           // Get a writer pointer  
           // to display the succesful result
           return true;
       } 
       catch (Exception e) { 
           return false;
       } 
    }
    
    
    public boolean updatePntaje(int puntaje, long id_publicacion)
    {
    	try { 
			  
      		 // Initialize the database 
              Connection con = connection.initializeDatabase(); 
    
              // Create a SQL query to insert data into demo table 
              // demo table consists of two columns, so two '?' is used 
              PreparedStatement st = con 
                     .prepareStatement("UPDATE submit SET puntaje = " + puntaje +
                     		 " WHERE id_submit =" + id_publicacion ); 
    
              
              st.executeUpdate();
              
              st.close(); 
              con.close(); 
    
              // Get a writer pointer  
              // to display the succesful result
              return true;
          } 
          catch (Exception e) { 
              return false;
          } 
    }
    
}