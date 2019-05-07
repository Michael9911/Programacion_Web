package vista;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Controller.cUser;

/**
 * Servlet implementation class User
 */
@WebServlet("/User")
public class User extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public User() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#destroy()
	 */
    
	public void destroy() {
		// TODO Auto-generated method stub
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ruta = request.getRequestURI();
		
		optionValue(ruta , request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String ruta = request.getRequestURI();
		
		optionValue(ruta , request, response);
		
		
	}
	
	private void optionValue(String option , HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		String[] path = option.split("/");
		
		switch(path[path.length-1])
		{
		case "newUser":
			createUser(request,response);
			break;
		case "login":
			validarUser(request, response);
			break;
		case "submit.jsp":
			validarSesion(request,response);
			break;
		case "cerrarSession.jsp":
			cerrarSesion(request, response);
			break;
		}
	}
	
	private void createUser(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		String user_name = request.getParameter("user_name");
		String password = request.getParameter("password");
		cUser su = new cUser();
		if(su.UsuarioNuevo(user_name, password))
		{
			response.sendRedirect("http://localhost:9000/hacker.net/index.jsp");
		}
		else
		{
			response.sendRedirect("http://localhost:9000/hacker.net/login.jsp");
		}
	}
	
	private void validarUser(HttpServletRequest request, HttpServletResponse response) throws IOException 
	{
		HttpSession session = request.getSession(true);
		String user_name = request.getParameter("user_name");
		String password = request.getParameter("password");
		cUser c = new cUser();
		boolean respuesta = c.ValidarInicioUser(user_name, password);
		if(respuesta == true)
		{
			session.setAttribute("user_name", user_name);
			response.sendRedirect("http://localhost:9000/hacker.net/index.jsp");
		}
		else
		{
			response.sendRedirect("http://localhost:9000/hacker.net/login.jsp");
		}
		
		
	}
	
	private void cerrarSesion(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		HttpSession session = request.getSession(false);
		if(session != null)
		{
			session.invalidate();
			response.sendRedirect("http://localhost:9000/hacker.net/index.jsp");
		}
	}
	
	private void validarSesion(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		HttpSession session = request.getSession(false);

		if( session.getAttribute("user_name") == null )
		{
			response.sendRedirect("http://localhost:9000/hacker.net/login.jsp");
		}
		else
		{
			response.sendRedirect("http://localhost:9000/hacker.net/publicacion.jsp");
		}
	}
	
	
	

}
