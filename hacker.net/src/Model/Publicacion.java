package Model;

import java.util.*;

/**
 * 
 */
public class Publicacion {

    /**
     * Default constructor
     */
    public Publicacion() {
    }

    /**
     * 
     */
    private long id_publicacion;

    /**
     * 
     */
    private String link;

    /**
     * 
     */
    private String titulo;

    /**
     * 
     */
    private String description;

    /**
     * 
     */
    private Date fecha;

    /**
     * 
     */
    private int puntaje;

	public long getId_publicacion() {
		return id_publicacion;
	}

	public void setId_publicacion(long id_publicacion) {
		this.id_publicacion = id_publicacion;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

    

}