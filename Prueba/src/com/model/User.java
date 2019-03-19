package com.model;

import java.util.*;

import com.control.operations.oUser;
import com.control.operations.oSubmit;

/**
 * 
 */
public class User {

	static oUser ou = new oUser();
	static oSubmit os = new oSubmit();
	
    /**
     * Default constructor
     */
    public User() {}

    /**
     * 
     */
    public String user_name;

    /**
     * 
     */
    public String date;

    /**
     * 
     */
    public String about;

    /**
     * 
     */
    private String email;

    /**
     * 
     */
    private String password;
    
    /**
     * 
     */
    private User next = null;
    

    
    public User(String user_name, String password,String about, String email, String date)
    {
    	this.user_name = user_name;
    	this.password = password;
    	this.about = about;
    	this.email = email;
    	this.date = date;
    }

    public String getUser_name() {
		return user_name;
	}




	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}




	public String getDate() {
		return date;
	}




	public void setDate(String date) {
		this.date = date;
	}




	public String getAbout() {
		return about;
	}




	public void setAbout(String about) {
		this.about = about;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public User getNext() {
		return next;
	}




	public void setNext(User next) {
		this.next = next;
	}




	/**
     * @param user_name 
     * @param password 
     * @param newPassword
     */
    private void ChangePassword(String user_name, String password, String newPassword) {
        // TODO implement here
    }

    /**
     * @param user_name 
     * @param about 
     * @param email
     */
    private void Update(String user_name, String about, String email) {
        // TODO implement here
    }

    /**
     * @param id_comment 
     * @param masPuntaje
     */
    public void PuntajeComment(int id_comment, int masPuntaje) {
        // TODO implement here
    }

    /**
     * @param id_comment 
     * @param masPuntaje
     */
    public String PuntajeSubmit(int id_submit, String username) {
        String respuesta = os.colocarPuntaje(id_submit,username);
        return respuesta;
    }
    
    /*
     * @param user_name
     * @param password
     */
    protected void CreateUser(String user_name, String password,String about,String email,String date) 
    {
        ou.addEnd(new User( user_name, password,"","",date));
    }
    
    public String toString()
    {
    	return this.user_name +"," + this.password + "," + this.about + "," + this.email + "," + this.date + "\n";
    }

}