package vista;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Controller.cPublicacion;

/**
 * Servlet implementation class publicacion
 */
@WebServlet("/publicacion")
public class publicacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public publicacion() {
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
		case "createSubmit":
			createSubmit(request,response);
			break;
		case "puntaje":
			darPuntaje(request, response);
			break;
		case "removePuntaje":
			removePuntaje(request, response);
			break;
		}
	}
	
	private void createSubmit(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		cPublicacion cp = new cPublicacion();
		HttpSession session = request.getSession(true);
		String link = request.getParameter("link");
		String tittle = request.getParameter("tittle");
		String description = request.getParameter("description");
		String user_name = session.getAttribute("user_name").toString();
		boolean respuesta = cp.publicacionNueva(link, tittle, description, user_name);
		if(respuesta)
		{
			response.sendRedirect("http://localhost:9000/hacker.net/index.jsp");
		}
		else
		{
			response.sendRedirect("http://localhost:9000/hacker.net/submit.jsp");
		}
		
	}
	
	private void darPuntaje(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		HttpSession session = request.getSession(true);
		cPublicacion cp = new cPublicacion();
		long id_publicacion = Long.parseLong(request.getParameter("id_publicacion") );
		String user_name = session.getAttribute("user_name").toString();
		if( cp.darPuntajePublicacion(id_publicacion, user_name) )
		{
			response.sendRedirect("http://localhost:9000/hacker.net/index.jsp");
		}
		else
		{
			response.sendRedirect("http://localhost:9000/hacker.net/index.jsp");
		}
	}
	
	private void removePuntaje(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		HttpSession session = request.getSession(true);
		cPublicacion cp = new cPublicacion();
		long id_publicacion = Long.parseLong(request.getParameter("id_publicacion") );
		String user_name = session.getAttribute("user_name").toString();
		if( cp.removerPuntajePublicacion(id_publicacion, user_name) )
		{
			response.sendRedirect("http://localhost:9000/hacker.net/index.jsp");
		}
		else
		{
			response.sendRedirect("http://localhost:9000/hacker.net/index.jsp");
		}
	}

}
