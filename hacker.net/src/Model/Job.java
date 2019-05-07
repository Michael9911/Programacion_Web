package Model;

import java.util.*;

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
    private String titulo;

    /**
     * 
     */
    private String link;

    /**
     * 
     */
    private long id_company;

    /**
     * 
     */
    private Date fecha;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public long getId_company() {
		return id_company;
	}

	public void setId_company(long id_company) {
		this.id_company = id_company;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}




}