package Model.Dao;

import java.util.*;

import Model.User;

/**
 * 
 */
public class UserDaoImplement {

	static UserDao ud = new UserDao();
    /**
     * Default constructor
     */
    public UserDaoImplement() {}

    /**
     * 
     */
    private User user;


    /**
     * 
     */
    public void UserDaoImplement() {
        // TODO implement here
    }

    /**
     * @param user
     */
    public boolean addUser(User user) {
        boolean resultado = ud.addUser(user);
    	if(resultado)
    	{
    		return true;
    	}
    	else 
    	{
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
     */
    public User searchByName(User user) {
        UserDao ud = new UserDao();
        User user_respuesta = ud.searchByName(user.getUser_name());
        
        return user_respuesta;
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