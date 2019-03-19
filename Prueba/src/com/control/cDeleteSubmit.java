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
 * Servlet implementation class cDeleteSubmit
 */
@WebServlet("/cDeleteSubmit")
public class cDeleteSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cDeleteSubmit() {
        super();
        // TODO Auto-generated constructor stub
    }

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
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Leer_Escribir le = new Leer_Escribir();
		oSubmit oj = new oSubmit();
		oj.crearLista( le.LeerPublicaciones("Publicaciones.txt"));
		String user_name = request.getParameter("user_name");
		int id_submit = Integer.parseInt( request.getParameter("id_submit") );
		String respuesta = oj.deleteSubmit(id_submit, user_name);
		oj.resetList();
		PrintWriter out = response.getWriter();
		out.println(
				"<!DOCTYPE html>\r\n" + 
						"<html>\r\n" + 
						"   <head>\r\n" + 
						"      <title>Hacker.net</title>\r\n" +
						"   </head>\r\n" + 
						"   <body>\r\n" + 
						respuesta +
						"   </body>\r\n" + 
						"</html>"
				);
	}

}
