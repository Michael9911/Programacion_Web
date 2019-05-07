package Model;

import java.util.*;

/**
 * 
 */
public class Comentarios {

    /**
     * Default constructor
     */
    public Comentarios() {
    }

    /**
     * 
     */
    private long id_comentario;

    /**
     * 
     */
    private String description;

    /**
     * 
     */
    private int puntaje;

	public long getId_comentario() {
		return id_comentario;
	}

	public void setId_comentario(long id_comentario) {
		this.id_comentario = id_comentario;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}




}