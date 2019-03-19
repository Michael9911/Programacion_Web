package com.control.operations;

import com.model.Job;

import java.util.Date;

import com.control.operations.oEmpresas;
import com.model.Leer_Escribir;

public class oJobs extends Job {
	
	static Job head = new Job();
	static oEmpresas oe = new oEmpresas();
	static java.util.Date fecha = new Date();
	static Leer_Escribir le = new Leer_Escribir();
	
	public oJobs(){}
	
	public Job addEnd(Job node)
	{
		Job temp = head;
		
		while(temp.getNext() != null)
		{
			temp = temp.getNext();
		}
		
		temp.setNext( node );
		node.setNext( null );
		
		return null;
	}
	
	public String crearJob(String tittle, String link,String user_company, String password)
	{
		if(oe.login(user_company, password) != null)
		{
			String date = fecha + " ";
			Crear_job(tittle, link,user_company,date);
			escribirLista( textoLista() );
			oe.resetList();
			return "Trabajo creado con exito";
		}
		else
		{
			return "Empresa no es correcta";
		}
	}
	
	public void escribirLista(String texto) 
	{
        le.EscribirPublicaciones( texto,"Job.txt" );
	}
	
	public static String textoLista()
	{
		String list= "";
		Job temp = head.getNext();
        
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
            addEnd( new Job( temp[0],temp[1],temp[2],temp[3]) );
        }
	}
	
	public String printJob()
	{
		crearLista( le.LeerPublicaciones( "Job.txt" ) );
		Job temp = head.getNext();
		String lista = "";
		
		while(temp != null)
		{
			lista += temp.toString() + "<br>";
			temp = temp.getNext();
		}
		resetList();
		return lista;
	}
}
