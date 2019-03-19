package com.control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.control.operations.oUser;
import com.model.Leer_Escribir;

/**
 * Servlet implementation class cUser
 */
@WebServlet("/cUser")
public class cUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cUser() {
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
		oUser ou = new oUser();
		ou.crearLista( le.LeerPublicaciones("Usuarios.txt"));
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String respuesta = ou.crearUser(username, password);
		ou.resetList();
		PrintWriter out = response.getWriter();
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
