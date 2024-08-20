package cl.desafiolatam.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.desafiolatam.utiles.UtilesGeneral;

/**
 * Servlet implementation class ConsultaParImpar
 */
@WebServlet("/ConsultaParImpar")
public class ConsultaParImpar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ConsultaParImpar() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

		// Incluye librerias Java requeridas
		UtilesGeneral utilesgeneral = new UtilesGeneral();

		// Obtener Numero desde request
		int num = Integer.parseInt(request.getParameter("num"));

		// Retorna salida de funcion
		boolean espar = utilesgeneral.esPar(num);

		// Evalua y presenta salida de mensaje
		if (espar == true) {
			response.getWriter().append("El número " + num + " es PAR");
		} else {
			response.getWriter().append("El número " + num + " es IMPAR");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
