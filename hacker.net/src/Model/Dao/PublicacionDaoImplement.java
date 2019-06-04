package Model.Dao;

import java.util.*;


import Model.Publicacion;

/**
 * 
 */
public class PublicacionDaoImplement {

    /**
     * Default constructor
     */

    public PublicacionDaoImplement() {
    }

    /**
     * 
     */
    private Publicacion publicacion;


    /**
     * 
     */
    public void PublicacionDaoImplement() {
        // TODO implement here
    }

    /**
     * @param publicacion
     */
    public boolean addPublicacion(Publicacion publicacion) {
    	PublicacionDao pd = new PublicacionDao();
        boolean respuesta = pd.addPublicacion(publicacion);
    	return respuesta;
    }

    /**
     * @param publicacion
     */
    public boolean updatePublicacion(Publicacion publicacion) {
        // TODO implement here
    	return false;
    }

    /**
     * @param id_publicacion
     */
    public Publicacion searchById(long id_publicacion) {
    	PublicacionDao pd = new PublicacionDao();
    	Publicacion respuesta = pd.searchById(id_publicacion);
    	return respuesta;
    }
    
    public boolean updatePntaje(int puntaje, long id_publicacion)
    {
    	PublicacionDao pd = new PublicacionDao();
    	boolean resultado = pd.updatePntaje(puntaje, id_publicacion);
    	return resultado;
    }

    /**
     * @param id_publicacion
     */
    public boolean deletePublicacion(long id_publicacion) {
    	PublicacionDao pd = new PublicacionDao();
    	boolean resultado = pd.deletePublicacion(id_publicacion);
    	return resultado;
    }
    
    public List<Publicacion> searchAll() {
        PublicacionDao pdi = new PublicacionDao();
        List<Publicacion> url = new ArrayList<Publicacion>();
        url = pdi.searchAll();
        return url;
    }

}