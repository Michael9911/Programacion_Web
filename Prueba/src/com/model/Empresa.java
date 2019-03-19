package com.model;

import java.util.*;

import com.control.operations.oEmpresas;

/**
 * 
 */
public class Empresa {

	static oEmpresas oe = new oEmpresas();
    /**
     * Default constructor
     */
    public Empresa() {}

    /**
     * 
     */
    private String user_company;

    /**
     * 
     */
    private String password;
    
    private Empresa next = null;

    public Empresa(String user_company,String password)
    {
    	this.password = password;
    	this.user_company = user_company;
    }

    /**
     * @param new_password 
     * @param password
     */
    private void Update(String new_password, String password) {
        // TODO implement here
    }

	public String getUser_company() {
		return user_company;
	}

	public void setUser_company(String user_company) {
		this.user_company = user_company;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Empresa getNext() {
		return next;
	}

	public void setNext(Empresa next) {
		this.next = next;
	}
    
	protected void CreateCompany(String user_company,String password)
	{
		oe.addEnd( new Empresa(user_company,password) );
	}
	
	public String toString()
	{
		return this.user_company + "," + this.password + "\n";
	}
	
}