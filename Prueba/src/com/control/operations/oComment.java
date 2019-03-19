package com.control.operations;

import com.model.Comments;
import com.model.Leer_Escribir;

public class oComment extends Comments {
	
	static Leer_Escribir le = new Leer_Escribir();
	static oSubmit os = new oSubmit();
	static oUser ou = new oUser();
	static Comments head = new Comments();
	
	public oComment(){}
	
	public String colocarComentario(int id_submit, String comentario,String user_name)
	{
		os.crearLista( le.LeerPublicaciones("Publicaciones.txt") );
		ou.crearLista( le.LeerPublicaciones("Usuarios.txt") );
		if(ou.searchUser(user_name) != null)
		{
			if(os.searchByID(id_submit))
			{
				int size = getSize() + 1;
				addComment( new Comments(id_submit, comentario, user_name,size,0) );
				escribirComents();
				os.resetList();
				ou.resetList();
				return "Comentario creado!";
			}
			else
			{
				return "El submit no existe!";
			}
		}
		else
		{
			return "Usuario no existe!";
		}
	}
	
	public void addComment(Comments node)
	{
		Comments temp = head;
		
		while(temp.getNext() != null)
		{
			temp = temp.getNext();
		}
		
		temp.setNext( node );
		node.setNext( null );
		
	}
	
	public int getSize()
	{
		int puntaje = 0;
		Comments temp = head.getNext();
		
		while(temp != null)
		{
			puntaje += 1;
			temp = temp.getNext();
		}
		
		return puntaje;
	}
	
	public void crearLista()
	{
		String[] texto = le.LeerPublicaciones("Comentarios.txt").split("\n");
		for(int i = 0; i < texto.length; i++ )
		{
			String[] temp = texto[i].split(",");
			addComment( new Comments(Integer.parseInt( temp[0] ),temp[1],temp[2],Integer.parseInt( temp[3] ),Integer.parseInt( temp[4] ) ) );
		}
	}
	
	public void resetList()
	{
		head.setNext(null);
	}
	
	public String printList()
	{
		String texto = "";
		Comments temp = head.getNext();
		while(temp != null)
		{
			texto += temp.toString();
			temp = temp.getNext();
		}
		
		return texto;
	}
	
	public void escribirComents()
	{
		le.EscribirPublicaciones( printList() , "Comentarios.txt");
	}
	
	public String mostarComment()
	{
		crearLista();
		Comments temp = head.getNext();
		String respuesta = "";
		while(temp != null)
		{
			respuesta += temp.toString() + "<br>";
			temp = temp.getNext();
		}
		resetList();
		return respuesta;
	}
	
	public String deleteComment(int id_comment,String user_name)
	{
		crearLista();
		Comments temp = head.getNext();
		
		if(ou.searchUser(user_name) != null)
		{
		
		while(temp != null)
		{
			if(temp.getNext().getId_comment() == id_comment && temp.getNext().getCreated_by().equals(user_name))
			{
				temp.setNext(temp.getNext().getNext());
				escribirComents();
				resetList();
				return "Elemento Borrado";
			}
			temp = temp.getNext();
		}
			resetList();
			return "Elemento no encontrado";
		}
		else
		{
			resetList();
			return "El usuario no es el correcto";
		}
	}
	
	public Comments searchById(int id_comment, String user_name)
	{
		Comments temp = head.getNext();
		
		while(temp != null)
		{
			if(temp.getId_comment() == id_comment && temp.getCreated_by().equals(user_name) )
			{
				return temp;
			}
			temp = temp.getNext();
		}
		
		return null;
	}
	
	public String updateComment(int id_comment, String user_name, String content)
	{
		crearLista();
		Comments temp = searchById(id_comment, user_name);
		
		if(temp != null)
		{
			temp.setDescription(content);
			escribirComents();
			resetList();
			return "Cambio realizado con exito";
		}
		else
		{
			return "Error de usuario o id";
		}
		
	}
	
	
}
