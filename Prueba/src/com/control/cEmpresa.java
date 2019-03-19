package com.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.control.operations.oEmpresas;
import com.control.operations.oUser;
import com.model.Leer_Escribir;

/**
 * Servlet implementation class cEmpresa
 */
@WebServlet("/cEmpresa")
public class cEmpresa extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cEmpresa() {
        super();
        // TODO Auto-generated constructor stub
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
		oEmpresas oe = new oEmpresas();
		oe.crearLista( le.LeerPublicaciones("Empresas.txt"));
		String user_company = request.getParameter("user_company");
		String password = request.getParameter("password");
		String respuesta = oe.crearCompany(user_company, password);
		oe.resetList();
		PrintWriter out = response.getWriter();
		out.println(
				"<!DOCTYPE html>\r\n" + 
						"<html>\r\n" + 
						"   <head>\r\n" + 
						"      <title>HTML Meta Tag</title>\r\n" +
						"   </head>\r\n" + 
						"   <body>\r\n" + 
						respuesta +
						"   </body>\r\n" + 
						"</html>"
				);
	}

}
