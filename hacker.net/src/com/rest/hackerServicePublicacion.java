package com.rest;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.google.gson.*;

import Controller.cPublicacion;
import Model.Publicacion;


@Path("servicio")
public class hackerServicePublicacion{
	
	@GET
	@Path("mostrar/news")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<Publicacion> getNews()
	{
	
		cPublicacion CPublicacion = new cPublicacion();
		List<Publicacion> show = CPublicacion.mostrarNews();
		return show;
	}
	
	@GET
	@Path("mostrar/show")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<Publicacion> getShow_JSON()
	{
		cPublicacion CPublicacion = new cPublicacion();
		List<Publicacion> show = CPublicacion.mostrarShow();
		return show;
	}
	
	@GET
	@Path("/mostrar/ask")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<Publicacion> getAsk(){
		cPublicacion CPublicacion = new cPublicacion();
		List<Publicacion> show = CPublicacion.mostrarAsk();
		return show;
	}
	
	@DELETE
	@Path("eliminar/publicacion/{id_publicacion},{user_name}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<Publicacion>  deleteById( @PathParam("id_publicacion") long id_publicacion, @PathParam("user_name") String user_name )
	{
		cPublicacion CPublicacion = new cPublicacion();
		CPublicacion.removerPublicacion(id_publicacion,user_name);
		List<Publicacion> show = CPublicacion.mostrarNews();
		return show;
	}
	
	@PUT
	@Path("dar_puntaje/publicacion/{id_publicacion},{user_name}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<Publicacion>  darPuntaje( @PathParam("id_publicacion") long id_publicacion, @PathParam("user_name") String user_name )
	{
		cPublicacion CPublicacion = new cPublicacion();
		CPublicacion.darPuntajePublicacion(id_publicacion, user_name);
		List<Publicacion> show = CPublicacion.mostrarNews();
		return show;
	}
	
	@PUT
	@Path("remover_puntaje/publicacion/{id_publicacion},{user_name}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<Publicacion>  removerPuntaje( @PathParam("id_publicacion") long id_publicacion, @PathParam("user_name") String user_name )
	{
		cPublicacion CPublicacion = new cPublicacion();
		CPublicacion.removerPuntajePublicacion(id_publicacion, user_name);
		List<Publicacion> show = CPublicacion.mostrarNews();
		return show;
	}
	
}
