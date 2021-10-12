package mx.edu.uacm.progweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JassielLinaresServlet_2 extends HttpServlet {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		/*
		 * Si escribe un metodo init que tome un servletconfig
		 * coo argumento siempre llame a supe.init() en la primer linea
		 */
		/*
		 * ServletConfig cuenta con un metodo getInitParameter con el cual podemos buscar parametros de carga inicial, asociados al servlet 
		 */
		
		super.init();
	}
	
	public void init() throws ServletException {
		/*
		 * Si escribe un metodo init que tome un servletconfig
		 * coo argumento siempre llame a supe.init() en la primer linea
		 */
		super.init();
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		 * Cada vez que el servidor recibe una petición, para un servlet, permite un nuevo proceso.
		 * y llama al metodo service 
		 *
		 */
		super.service(req, resp);
		
	}
	
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nombre = req.getParameter("nombre");
		System.out.println("El nombre es: "+ nombre);
		String apellido = req.getParameter("apellido");
		System.out.println("El apellido es: "+ apellido);
		
		PrintWriter salida = resp.getWriter();
		//Utilice salida para enviar el contenido al navegador web
		salida.println("Hola tu nombre es: "+ nombre + " tu apellido es: " + apellido);
		
	}
	
	
	

	
	

}
