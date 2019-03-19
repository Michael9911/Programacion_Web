package com.model;

import com.control.operations.oComment;

/**
 * 
 */
public class Comments {

	static oComment oc = new oComment();
	
    /**
     * Default constructor
     */
    public Comments() {}

    /**
     * 
     */
    private int id_comment;

    /**
     * 
     */
    private String description;

    /**
     * 
     */
    private String created_by;

    /**
     * 
     */
    private int id_submit;

    /**
     * 
     */
    private int puntaje;
    
    private Comments next = null;
    
    public Comments(int id_submit, String comentario, String user_name, int id_comment,int puntaje)
    {
    	this.id_submit = id_submit;
    	this.description = comentario;
    	this.created_by = user_name;
    	this.id_comment = id_comment;
    	this.puntaje = puntaje;
    }

    public Comments getNext() {
		return next;
	}

	public void setNext(Comments next) {
		this.next = next;
	}

	public int getId_comment() {
		return id_comment;
	}

	public void setId_comment(int id_comment) {
		this.id_comment = id_comment;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	/**
     * @param description 
     * @param created_by 
     * @param id_submit
     */
    public String Create_Comment(String description, String created_by, int id_submit) {
        oc.crearLista();
    	String respuesta = oc.colocarComentario(id_submit, description, created_by);
    	oc.resetList();
        return respuesta;
    }

    /**
     * @param description 
     * @param id_comment
     */
    private void Update(String description, int id_comment) {
        // TODO implement here
    }

    /**
     * @param id_comment
     */
    private void Delete_comment(int id_comment) {
        // TODO implement here
    }
    
    public String toString()
    {
    	return this.id_submit + "," + this.description + "," + this.created_by + "," + this.id_comment + "," + this.puntaje + "\n";
    }

}