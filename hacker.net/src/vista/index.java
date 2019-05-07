package vista;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Controller.cPublicacion;

/**
 * Servlet implementation class index
 */
@WebServlet("/index")
public class index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public index() {
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
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	private void optionValue(String option , HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		String[] path = option.split("/");
		
		switch(path[path.length-1])
		{
		case "index.jsp":
			news(request,response);
			break;
		case "ask.jsp":
			ask(request,response);
			break;
		case "show.jsp":
			show(request,response);
			break;
		}
	}
	
	private void news(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		cPublicacion cp = new cPublicacion();
		String respuesta = cp.mostrarNews();
		PrintWriter out = response.getWriter();
		
		request.getRequestDispatcher("/includes/header.jsp").include(request, response);
		out.println(respuesta);
		request.getRequestDispatcher("/includes/footer.jsp").include(request, response);
		if(validarSesion(request, response))
		{
			request.getRequestDispatcher("/forms/puntaje.jsp").include(request, response);
		}
	}
	
	private void ask(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		cPublicacion cp = new cPublicacion();
		String respuesta = cp.mostrarAsk();
		PrintWriter out = response.getWriter();
		
		request.getRequestDispatcher("/includes/header.jsp").include(request, response);
		out.println(respuesta);
		request.getRequestDispatcher("/includes/footer.jsp").include(request, response);
		if(validarSesion(request, response))
		{
			request.getRequestDispatcher("/forms/puntaje.jsp").include(request, response);
		}
	}
	
	private void show(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		cPublicacion cp = new cPublicacion();
		String respuesta = cp.mostrarShow();
		PrintWriter out = response.getWriter();
		
		request.getRequestDispatcher("/includes/header.jsp").include(request, response);
		out.println(respuesta);
		request.getRequestDispatcher("/includes/footer.jsp").include(request, response);
		if(validarSesion(request, response))
		{
			request.getRequestDispatcher("/forms/puntaje.jsp").include(request, response);
		}
	}
	
	private boolean validarSesion(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		HttpSession session = request.getSession(false);

		if( session.getAttribute("user_name") == null )
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}
