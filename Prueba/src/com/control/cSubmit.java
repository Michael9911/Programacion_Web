package com.control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.control.operations.oSubmit;
import com.model.Leer_Escribir;


/**
 * Servlet implementation class cSubmit
 */
@WebServlet("/cSubmit")
public class cSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public cSubmit() {}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Leer_Escribir le = new Leer_Escribir();
		oSubmit c = new oSubmit();
		c.crearLista( le.LeerPublicaciones("Publicaciones.txt") );
		String link = request.getParameter("link");
		String tittle = request.getParameter("tittle");
		String description = request.getParameter("description");
		String usuario = request.getParameter("usuario");
		String respuesta = c.crearSubmit(link, tittle, description, usuario);
		String submit = c.mostrarAsk();
		PrintWriter out = response.getWriter();
		c.resetList();
		out.println(
				"<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"   <head>\r\n" + 
				"      <title>HTML Meta Tag</title>\r\n" + 
				"      <meta http-equiv = \"refresh\" content = \"0; url = index.jsp\" />\r\n" + 
				"   </head>\r\n" + 
				"   <body>\r\n" + 
				"   </body>\r\n" + 
				"</html>"
				);
	}

}
