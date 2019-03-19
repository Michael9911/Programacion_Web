package com.control.operations;

import java.util.Date;
import com.model.Leer_Escribir;
import com.model.Submit;
import com.control.operations.oUser;

public class oSubmit extends Submit {

	static Submit head = new Submit();
	static java.util.Date fecha = new Date();
	static oUser ou = new oUser();
	static Leer_Escribir le = new Leer_Escribir();
	
	public oSubmit() {}
	
	public Submit addEnd(Submit node)
	{
		Submit temp = head;
		while(temp.getNext() != null)
		{
			temp = temp.getNext();
		}
		temp.setNext( node );
		node.setNext( null );
		
		return null;
	}
	
	
	public String crearSubmit(String link, String tittle, String description, String username) 
	{
		ou.crearLista( le.LeerPublicaciones("Usuarios.txt") );
		if( ou.searchUser(username) != null )
		{
			int size = getSize();
			size = size + 1;
			String date = fecha + "";
			Create_Submit(link,tittle,description, date, username, size,0);
			escribirLista( textoLista() );
			ou.resetList();
			return "Publicacion creada con exito!.";
		}
		else
		{
			return "El usuario no existe!.";
		}
	}
	
	public int getSize()
	{
		Submit temp = head.getNext();
		int size = 0;
		while(temp != null)
		{
			size = size + 1;
			temp = temp.getNext();
		}
		
		return size;
	}
	
	public String printList()
	{
		String texto = "";
		Submit temp = head.getNext();
		
		while(temp != null)
		{
			texto += temp.toString() + "<br>";
			temp = temp.getNext();
		}
		
		return texto;
	}
	
	public void escribirLista(String texto) 
	{
        le.EscribirPublicaciones( texto,"Publicaciones.txt" );
	}
	
	public static String textoLista()
	{
		String list= "";
        Submit temp = head.getNext();
        
        while(temp != null)
        {
            list += temp.toString();
            temp = temp.getNext();
        }
        
        return list;
	}
	
	public void resetList()
	{
		head.setNext(null);
	}
	
	public void crearLista(String texto)
	{
		String[] tempS = texto.split("\n");
        
        for (int i = 0; i < tempS.length; i++) 
        {
            String[] temp = tempS[i].split(",");
            addEnd( new Submit( temp[0],temp[1],temp[2], temp[3], temp[4], Integer.parseInt( temp[5] ),Integer.parseInt(temp[6]) ));
        }
	}
	
	public String mostrarAsk()
	{
		crearLista( le.LeerPublicaciones("Publicaciones.txt"));
		Submit temp = head.getNext();
		String lista = "";
		while(temp != null)
		{
			if(temp.getTittle().contains("Ask HN:"))
			{
				lista += temp.toString() + "<br>";
			}
			temp = temp.getNext();
		}
		resetList();
		return lista;
	}
	
	public String mostrarShow()
	{
		crearLista( le.LeerPublicaciones("Publicaciones.txt"));
		Submit temp = head.getNext();
		String lista = "";
		while(temp != null)
		{
			if(temp.getTittle().contains("Show HN:"))
			{
				lista += temp.toString() + "<br>";
			}
			temp = temp.getNext();
		}
		resetList();
		return lista;
	}
	
	public String mostrarNews()
	{
		crearLista( le.LeerPublicaciones("Publicaciones.txt"));
		Submit temp = head.getNext();
		String lista = "";
		while(temp != null)
		{
			if(temp.getTittle().contains("Ask HN:") == false && temp.getTittle().contains("Show HN:") == false)
			{
				lista += temp.toString() + "<br>";
			}
			temp = temp.getNext();
		}
		resetList();
		return lista;
	}
	
	public String colocarPuntaje(int id_submit,String user_name)
	{
		ou.crearLista( le.LeerPublicaciones("Usuarios.txt") );
		if( ou.searchUser(user_name) != null )
		{
		Submit temp = head.getNext();
		if(searchByID(id_submit))
		{
		while(temp != null)
		{
			if(temp.getId_submit() == id_submit)
			{
				break;
			}
			temp = temp.getNext();
		}
		
			int puntaje = temp.getPuntaje() + 1;
			temp.setPuntaje( puntaje );
			escribirLista( textoLista() );
			return "Puntaje colocado";
		}
		else
		{
			return "Id no existe.";	
		}
		}
		else
		{
			return "Usuario no existe";
		}
	}
	
	public boolean searchByID(int id_submit)
	{
		Submit temp = head.getNext();
		
		while(temp != null)
		{
			if(temp.getId_submit() == id_submit)
			{
				return true;
			}
			temp = temp.getNext();
		}
		return false;
	}
	
	public Submit searchByIDComplete(int id_submit,String user_name)
	{
		Submit temp = head.getNext();
		
		while(temp != null)
		{
			if(temp.getId_submit() == id_submit  && temp.getCreated_by().equals(user_name))
			{
				return temp;
			}
			temp = temp.getNext();
		}
		return null;
	}
	
	
	
	public String deleteSubmit(int id_submit,String user_name)
	{
		Submit temp = head.getNext();
		
		if(ou.searchUser(user_name) != null)
		{
		
		while(temp != null)
		{
			if(temp.getNext().getId_submit() == id_submit && temp.getNext().getCreated_by().equals(user_name))
			{
				temp.setNext(temp.getNext().getNext());
				escribirLista( textoLista() );
				return "Elemento Borrado";
			}
			temp = temp.getNext();
		}
			return "Elemento no encontrado";
		}
		else
		{
			return "El usuario no es el correcto";
		}
		
	}
	
	public String updateSubmit(int id_submit,String user_name, String description)
	{
		crearLista( le.LeerPublicaciones("Publicaciones.txt"));
		Submit temp = searchByIDComplete(id_submit,user_name);
		if(temp != null)
		{
			temp.setDescription(description);
			escribirLista(textoLista());
			resetList();
			return "Actualizado correctamente!.";
		}
		else
		{
			return "Error!.";
		}
	}
	
	
	
}
