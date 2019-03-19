package com.model;


import com.control.operations.oSubmit;

public class Submit {

	static oSubmit c = new oSubmit();
	
	/**
     * Default constructor
     */
    public Submit() {}

    /**
     * String what's contains the link of new.
     */
    public String link;

    /**
     * String what's contains the tittle of new, wich is in the publication.
     */
    public String tittle;

    /**
     * String what's contains the description of new, wich is in the publication.
     */
    public String description;

    /**
     * Date of publication.
     */
    public String date;

    /**
     * String of username which create the publication.
     */
    public String created_by;

    /**
     * int of identification by publication. 
     */
    private int id_submit;

    /**
     * int of score by publication. 
     */
    private int puntaje;

    /**
     * Point of the list.
     */
    private Submit next = null;
    
    /**
     * @param link
     * @param tittle
     * @param description
     * @param date
     * @param created_by
     * @param id_submit
     * Constructor of values by submit, which the order has be by lists.
     */
    public Submit(String link, String tittle, String description, String date, String created_by
    		, int id_submit, int puntaje)
    {
    	this.link = link;
    	this.tittle = tittle;
    	this.description = description;
    	this.date = date;
    	this.created_by = created_by;
    	this.id_submit = id_submit;
    	this.puntaje = puntaje;
    }
    
    /**
     * Get's and Set's of attributes of this class.
     */
    
    public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public int getId_submit() {
		return id_submit;
	}

	public void setId_submit(int id_submit) {
		this.id_submit = id_submit;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	public Submit getNext() {
		return next;
	}

	public void setNext(Submit next) {
		this.next = next;
	}
    
    /**
     * @param id_submit 
     * @param description 
     * @param link 
     * @param tittle
     * Method by create a submit or publication.
     */
    protected void Create_Submit(String link, String tittle, String description, String date, String created_by
    		, int id_submit, int puntaje) 
    {
        c.addEnd( new Submit(link, tittle,description,date,created_by,id_submit,puntaje) );
    }

	public String toString()
	{
		return this.link + ","  +this.tittle + "," + this.description + ","+ this.date + "," 
				+ this.created_by + "," + this.id_submit + "," + this.puntaje + "\n";
	}
	
}
