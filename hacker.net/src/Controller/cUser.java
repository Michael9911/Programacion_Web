package Controller;

import java.util.*;

import Model.User;
import Model.Dao.UserDaoImplement;

/**
 * 
 */
public class cUser {
	
	
    /**
     * Default constructor
     */
    public cUser() {}

    /**
     * @param user_name
     */
    public void ValidarUsuario(String user_name) {
        // TODO implement here
    }

    /**
     * @param user
     */
    public boolean UsuarioNuevo(String user_name, String password) {
        User user = new User();
        UserDaoImplement udi = new UserDaoImplement();
        
        user.setUser_name(user_name);
        user.setPassword(password);
        user.setAbout("");
        user.setEmail("");
        user.setDate(getCurrentDate());
        
        boolean result = udi.addUser(user);
        if(result)
        {
        	return true;
        }
        else
        {
        	return false;
        }
    }

    /**
     * @param user_name 
     * @param password
     */
    public boolean ValidarInicioUser(String user_name, String password) {
        boolean respuesta = false;
    	User u = new User();
    	UserDaoImplement udi = new UserDaoImplement();
        u.setUser_name(user_name);
        User respons = udi.searchByName(u);
        if(respons.getUser_name().equals("") == false)
        {
        	if(respons.getPassword().equals(password) == true)
        	{
        		respuesta = true;
        	}
        }
        
        return respuesta;
    }

    /**
     * @param email
     */
    public void RecuperarPassword(String email) {
        // TODO implement here
    }

    /**
     * @param email
     */
    public void ValidarCorreo(String email) {
        // TODO implement here
    }

    /**
     * @param user
     */
    public void NuevosDatos(String email, String about) {
        // TODO implement here
    }


    private static java.sql.Date getCurrentDate() {
        java.util.Date today = new java.util.Date();
        return new java.sql.Date(today.getTime());
    }
}