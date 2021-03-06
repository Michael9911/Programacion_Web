package com.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.control.operations.oComment;

/**
 * Servlet implementation class cDeleteComments
 */
@WebServlet("/cDeleteComments")
public class cDeleteComments extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cDeleteComments() {
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
		oComment oc = new oComment();
		String user_name = request.getParameter("user_name");
		int id_comment = Integer.parseInt( request.getParameter("id_comment") );
		String respuesta = oc.deleteComment(id_comment, user_name);
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
