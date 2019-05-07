package Model.Dao;

import java.util.*;

import Model.Colocar_submit;

/**
 * 
 */
public class Colocar_submitDaoImplement {

    /**
     * Default constructor
     */

    public Colocar_submitDaoImplement() {
    }

    /**
     * 
     */
    private Colocar_submit colocar_submit;


    /**
     * @param colocar_submit
     */
    public boolean addColocar_submit(Colocar_submit colocar_submit) {
    	Colocar_submitDao csd = new Colocar_submitDao();
        boolean respuesta = csd.addColocar_submit(colocar_submit);
    	return respuesta;
    }

    /**
     * @param colocar_submit
     */
    public void searchSubmitByUser(Colocar_submit colocar_submit) {
        // TODO implement here
    }

    /**
     * @param colocar_submit
     */
    public void deleteSubmitByUser(Colocar_submit colocar_submit) {
        // TODO implement here
    }

    /**
     * 
     */
    public void Colocar_submitDaoImplement() {
        // TODO implement here
    }

}