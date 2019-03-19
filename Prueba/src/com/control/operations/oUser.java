package com.control.operations;

import java.util.Date;
import com.model.Leer_Escribir;
import com.model.User;

public class oUser extends User {
	
	static User head = new User();
	static java.util.Date fecha = new Date();
	static Leer_Escribir le = new Leer_Escribir();
	
	public oUser(){}
	
	public User addEnd(User node)
	{
		User temp = head;
		
		while(temp.getNext() != null)
		{
			temp = temp.getNext();
		}
		
		temp.setNext( node );
		node.setNext( null );
		
		return null;
	}
	
	public User searchUser(String user_name)
	{
		crearLista( le.LeerPublicaciones("Usuarios.txt"));
		User temp = head.getNext();
		
		while(temp != null)
		{
			if(temp.getUser_name().equals(user_name))
			{
				resetList();
				return temp;
			}
			temp = temp.getNext();
		}
		resetList();
		return null;
	}
	
	public User searchUserComplete(String user_name, String password)
	{
		crearLista( le.LeerPublicaciones("Usuarios.txt"));
		User temp = head.getNext();
		
		while(temp != null)
		{
			if(temp.getUser_name().equals(user_name) && temp.getPassword().equals(password) )
			{
				return temp;
			}
			temp = temp.getNext();
		}
		return null;
	}
	
	public String crearUser(String user_name, String password)
	{
		String date = fecha + " ";
		if(searchUser(user_name) == null)
		{
			CreateUser(user_name,password,"","",date);
			escribirLista( textoLista() );
			return "Usuario creado con exito!.";
		}
		else
		{
			return "Usuario ya existe!!.";
		}
	}
	
	public void escribirLista(String texto) 
	{
		
        le.EscribirPublicaciones( texto,"Usuarios.txt" );
	}
	
	public static String textoLista()
	{
		String list= "";
        User temp = head.getNext();
        
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
            addEnd( new User( temp[0],temp[1],temp[2], temp[3], temp[4] ));
        }
	}
	
	public String updateUser( String user_name, String password, String email, String about,String new_password )
	{
		User temp = searchUserComplete( user_name, password );
		if(temp != null)
		{
			temp.setAbout( about );
			temp.setEmail( email );
			if(new_password.equals("") != true)
			{
				temp.setPassword( new_password );
			}
			escribirLista( textoLista() );
			resetList();
			return "Actualizacion completa!!";
		}
		else
		{
			resetList();
			return "Error de sesion!";
		}
	}
	
}
