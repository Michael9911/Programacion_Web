package com.model;
import java.io.*;

public class Leer_Escribir {

	 public String LeerPublicaciones(String nombre)
	    {
	        File archivo = null;
	        FileReader fr = null;
	        BufferedReader br = null;

	        try 
	        {
	         // Apertura del fichero y creacion de BufferedReader para poder
	         // hacer una lectura comoda (disponer del metodo readLine()).
	            archivo = new File ("C:\\Users\\BOG-A408-E-016\\Desktop\\Prueba\\src\\com\\model\\DB\\" + nombre);
	            fr = new FileReader (archivo);
	            br = new BufferedReader(fr);

	         // Lectura del fichero
	            String linea;
	            String texto = "";
	            while((linea=br.readLine())!=null)
	                texto += linea + "\n";
	            
	            return texto;
	      }
	      catch(Exception e)
	      {
	         e.printStackTrace();
	         return null;
	      }
	      finally
	      {
	         // En el finally cerramos el fichero, para asegurarnos
	         // que se cierra tanto si todo va bien como si salta 
	         // una excepcion.
	         try
	         {                    
	            if( null != fr )
	            {   
	               fr.close();     
	            }                  
	         }
	         catch (Exception e2)
	         { 
	            e2.printStackTrace();
	         }
	      }
	        
	    }
	    
	    public void EscribirPublicaciones(String texto,String nombre)
	    {
	        FileWriter fichero = null;
	        PrintWriter pw = null;
	        try
	        {
	            fichero = new FileWriter("C:\\Users\\BOG-A408-E-016\\Desktop\\Prueba\\src\\com\\model\\DB\\" + nombre);
	            pw = new PrintWriter(fichero);

	            
	                pw.print(texto );

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	           try {
	           // Nuevamente aprovechamos el finally para 
	           // asegurarnos que se cierra el fichero.
	           if (null != fichero)
	              fichero.close();
	           } catch (Exception e2) {
	              e2.printStackTrace();
	           }
	        }
	    }
}
