package com.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Comments;

/**
 * Servlet implementation class cComment
 */
@WebServlet("/cComment")
public class cComment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cComment() {
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
		String user_name = request.getParameter("user_name");
		int id_submit = Integer.parseInt( request.getParameter("id_submit") );
		String comment = request.getParameter("comment");
		Comments c = new Comments();
		String respuesta = c.Create_Comment(comment, user_name, id_submit);
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
