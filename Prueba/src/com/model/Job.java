package com.model;

import java.util.*;

import com.control.operations.oJobs;

/**
 * 
 */
public class Job {

    /**
     * Default constructor
     */
    public Job() {
    }

    /**
     * 
     */
    private String tittle;

    /**
     * 
     */
    private String link;

    /**
     * 
     */
    private String user_company;

    /**
     * 
     */
    private String date;
    
    private Job next = null;
    
    public Job(String tittle,String link,String user_company, String date) 
    {
    	this.tittle = tittle;
    	this.link = link;
    	this.user_company = user_company;
    	this.date = date;
    }

    
    
    public String getTittle() {
		return tittle;
	}



	public void setTittle(String tittle) {
		this.tittle = tittle;
	}



	public String getLink() {
		return link;
	}



	public void setLink(String link) {
		this.link = link;
	}



	public String getUser_company() {
		return user_company;
	}



	public void setUser_company(String user_company) {
		this.user_company = user_company;
	}



	public String getDate() {
		return date;
	}




	public void setDate(String date) {
		this.date = date;
	}



	public Job getNext() {
		return next;
	}



	public void setNext(Job next) {
		this.next = next;
	}



	/**
     * @param tittle 
     * @param link
     */
    protected void Crear_job(String tittle, String link,String user_company,String date) 
    {
        oJobs oj = new oJobs();
        oj.addEnd( new Job(tittle,link,user_company,date) );
    }
    
    public String toString()
    {
    	return this.tittle + "," + this.link + "," +this.user_company + "," + this.date + "\n";
    }
    

}