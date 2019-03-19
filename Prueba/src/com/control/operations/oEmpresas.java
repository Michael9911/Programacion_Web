package com.control.operations;

import com.model.Empresa;
import com.model.Leer_Escribir;

public class oEmpresas extends Empresa {

	static Empresa head = new Empresa();
	static Leer_Escribir le = new Leer_Escribir();
	
	public oEmpresas(){}
	
	
	public Empresa addEnd(Empresa node)
	{
		Empresa temp = head;
		
		while(temp.getNext() != null)
		{
			temp = temp.getNext();
		}
		
		temp.setNext( node );
		node.setNext( null );
		
		return null;
	}
	
	public Empresa searchCompany(String user_company)
	{
		Empresa temp = head.getNext();
		
		while(temp != null)
		{
			if(temp.getUser_company().equals(user_company))
			{
				return temp;
			}
			temp = temp.getNext();
		}
		
		return null;
	}
	
	public String crearCompany(String user_company, String password)
	{
		if(searchCompany(user_company) == null)
		{
			CreateCompany(user_company,password);
			escribirLista( textoLista() );
			return "Empresa creada con exito!.";
		}
		else
		{
			return "Empresa ya existe!!.";
		}
	}
	
	public void escribirLista(String texto) 
	{
		
        le.EscribirPublicaciones( texto,"Empresas.txt" );
	}
	
	public static String textoLista()
	{
		String list= "";
        Empresa temp = head.getNext();
        
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
            addEnd( new Empresa( temp[0],temp[1]) );
        }
	}
	
	public Empresa login(String user_company,String password)
	{
		crearLista( le.LeerPublicaciones("Empresas.txt") );
		Empresa temp = head.getNext();
		while(temp != null)
		{
			if(temp.getUser_company().equals(user_company)== true && temp.getPassword().equals(password))
			{
				return temp;
			}
			temp = temp.getNext();
		}
		return null;
	}
	
	public String updatePassword(String user_company,String password,String newPassword)
	{
		Empresa temp = login(user_company, password);
		if(temp != null) 
		{
			temp.setPassword(newPassword);
			escribirLista( textoLista() );
			resetList();
			return "Actualizacion completada!";
		}
		else
		{
			return "Error de inicio";
		}
			
	}
	
}
