package Controller;

import java.time.Instant;
import java.util.*;

import Model.Colocar_submit;
import Model.Publicacion;
import Model.Puntaje_submit;
import Model.Dao.Colocar_submitDaoImplement;
import Model.Dao.PublicacionDao;
import Model.Dao.PublicacionDaoImplement;
import Model.Dao.Puntaje_comentarioDaoImplement;
import Model.Dao.Puntaje_submitDaoImplement;

/**
 * 
 */
public class cPublicacion {

    /**
     * Default constructor
     */
	static Publicacion publicacion = new Publicacion();
	static PublicacionDaoImplement pdi = new PublicacionDaoImplement();
    public cPublicacion() {
    }






    /**
     * @param publicacion
     */
    public boolean publicacionNueva(String link, String tittle,String description,String user_name) {
        publicacion.setLink(link);
        publicacion.setDescription(description);
        publicacion.setPuntaje(0);
        publicacion.setTitulo(tittle);
        publicacion.setFecha(getCurrentDate());
        long id = generateId();
        publicacion.setId_publicacion( id );
        boolean respuesta = pdi.addPublicacion(publicacion);
        if(respuesta == true)
        {
        	Colocar_submit colocar_submit = new Colocar_submit();
        	colocar_submit.setId_publicacion(id);
        	colocar_submit.setUser_name(user_name);
        	Colocar_submitDaoImplement csdi = new Colocar_submitDaoImplement();
        	boolean colocar = csdi.addColocar_submit(colocar_submit);
        	if(colocar)
        	{
        		return true;
        	}
        	else
        	{
        		return false;
        	}
        }
        else
        {
        	return false;
        }
    }

    /**
     * 
     */
    public void mostrarPublicacion() {
        // TODO implement here
    }

    /**
     * @param id_publicacion
     */
    public boolean darPuntajePublicacion(long id_publicacion, String user_name) {
        Publicacion search = null;
        Puntaje_submit ps = new Puntaje_submit();
        Puntaje_submitDaoImplement psdi = new Puntaje_submitDaoImplement();
        search = pdi.searchById(id_publicacion);
        if(search != null)
        {
        	ps.setId_publicacion(id_publicacion);
            ps.setUser_name(user_name);
            
    			Puntaje_submit result = psdi.searchPuntaje_submit(ps);
        	
    			if(result == null)
    			{
    				search.setId_publicacion(id_publicacion);
    				search.setPuntaje( search.getPuntaje() + 1 );
    				if( pdi.updatePntaje( search.getPuntaje() , search.getId_publicacion()) )
    				{
    					ps.setId_publicacion(search.getId_publicacion());
    					ps.setUser_name(user_name);
    					if( psdi.addPuntaje_submit(ps) )
    					{
    						return true;
    					}
    					else
    					{
    						return false;
    					}
    				}
    				else
    				{
        		return false;
    				}
    			}
    			else
    			{
    				return false;
    			}
        }
        else
        {
        	return false;
        }
    }

    /**
     * 
     */
    public String mostrarAsk() {
    	String respuestas = "";
        String[] news;
        String retorno = "";
        PublicacionDaoImplement pdi = new PublicacionDaoImplement();
        respuestas = pdi.searchAll();
        news = respuestas.split("<br>");
        for(int i = 0; i < news.length; i++)
        {
        	if(news[i].contains("Ask HN:") == true)
        	{
        		retorno = retorno + news[i] + "<br>";
        	}
        }
        
        return retorno;
    }

    /**
     * 
     */
    public String mostrarNews() {
        String respuestas = "";
        String[] news;
        String retorno = "";
        PublicacionDaoImplement pdi = new PublicacionDaoImplement();
        respuestas = pdi.searchAll();
        news = respuestas.split("<br>");
        for(int i = 0; i < news.length; i++)
        {
        	if(news[i].contains("Show HN:") == false && news[i].contains("Ask HN:") == false)
        	{
        		retorno = retorno + news[i] + "<br>";
        	}
        }
        
        return retorno;
    }

    /**
     * 
     */
    public String mostrarShow() {
    	String respuestas = "";
        String[] news;
        String retorno = "";
        PublicacionDaoImplement pdi = new PublicacionDaoImplement();
        respuestas = pdi.searchAll();
        news = respuestas.split("<br>");
        for(int i = 0; i < news.length; i++)
        {
        	if(news[i].contains("Show HN:") == true)
        	{
        		retorno = retorno + news[i] + "<br>";
        	}
        }
        
        return retorno;
    }

    /**
     * @param titulo
     */
    public void validarPublicacion(String titulo) {
        // TODO implement here
    }

    /**
     * @param id_publicacion
     */
    public void removerPublicacion(long id_publicacion) {
        // TODO implement here
    }
    /**
     * 
     */
    public boolean removerPuntajePublicacion(long id_publicacion, String user_name) {
        Puntaje_submit ps = new Puntaje_submit();
        PublicacionDaoImplement pd = new PublicacionDaoImplement();
        Puntaje_submitDaoImplement psdi = new Puntaje_submitDaoImplement();
        
        ps.setId_publicacion(id_publicacion);
        ps.setUser_name(user_name);
        
    	
        Publicacion publicacion = pd.searchById(id_publicacion);
		if(publicacion != null)
		{
        
			Puntaje_submit result = psdi.searchPuntaje_submit(ps);
    	
			if(result != null)
			{
				if(psdi.deletePuntaje_submit(ps))
				{	
    			
					boolean resultado = pd.updatePntaje(publicacion.getPuntaje() - 1, id_publicacion);
					if(resultado)
						return true;
					else
						return false;
				}
				else
					return false;
    		}
    		else
    			return true;
    	}
    	else
    	{
    	return false;
    	}
    }
    
    private long generateId()
    {
    	long number = 0;
    	
    	number = Instant.now().getEpochSecond();
    	
    	return number;
    }

    private static java.sql.Date getCurrentDate() {
        java.util.Date today = new java.util.Date();
        return new java.sql.Date(today.getTime());
    }
}