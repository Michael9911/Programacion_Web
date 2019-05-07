package Model;

import java.util.*;

/**
 * 
 */
public class Replicar_comentario {

    /**
     * Default constructor
     */
    public Replicar_comentario() {
    }

    /**
     * 
     */
    private String user_name;

    /**
     * 
     */
    private long id_comentario_creado;

    /**
     * 
     */
    private long id_comentario_final;

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public long getId_comentario_creado() {
		return id_comentario_creado;
	}

	public void setId_comentario_creado(long id_comentario_creado) {
		this.id_comentario_creado = id_comentario_creado;
	}

	public long getId_comentario_final() {
		return id_comentario_final;
	}

	public void setId_comentario_final(long id_comentario_final) {
		this.id_comentario_final = id_comentario_final;
	}

    

}