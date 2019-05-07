package Model.Dao;

import java.util.*;

import Model.Puntaje_submit;

/**
 * 
 */
public class Puntaje_submitDaoImplement {

    /**
     * Default constructor
     */
    public Puntaje_submitDaoImplement() {
    }

    /**
     * 
     */
    private Puntaje_submit puntaje_submit;


    /**
     * 
     */
    public void Puntaje_submitDaoImplement() {
        // TODO implement here
    }

    /**
     * @param puntaje_submit
     */
    public boolean addPuntaje_submit(Puntaje_submit puntaje_submit) {
        Puntaje_submitDao psd = new Puntaje_submitDao();
        boolean respuesta = psd.addPuntaje_submit(puntaje_submit);
    	return respuesta;
    }

    /**
     * @param puntaje_submit
     */
    public Puntaje_submit searchPuntaje_submit(Puntaje_submit puntaje_submit) {
        Puntaje_submitDao psd = new Puntaje_submitDao();
        Puntaje_submit repsuesta = psd.searchPuntaje_submit(puntaje_submit);
    	return repsuesta;
    }

    /**
     * @param puntaje_submit
     */
    public boolean deletePuntaje_submit(Puntaje_submit puntaje_submit) {
        Puntaje_submitDao psd = new Puntaje_submitDao();
        boolean respuesta = psd.deletePuntaje_submit(puntaje_submit);
    	return respuesta;
    }

}