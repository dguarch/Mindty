package com.mindty.controler;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.databind.SerializationFeature;
import com.mindty.ddbb.BBDD;
import com.mindty.modelos.Curso;
import com.mindty.modelos.Modulo;
import com.mindty.modelos.Usuario;

@WebServlet("/profesor")

public class profesorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public profesorServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();

	

		// request.getRequestDispatcher("profesor.jsp").forward(request, response);
		
		String user = (String) request.getSession().getAttribute("usuario");
		System.out.println(user);
		int nid=BBDD.getInstance().idUsuario(user);
		
		System.out.println(nid);
		
		
			
				

		
		List<Curso> listaCursos = BBDD.getInstance().ConsultaCursos(nid);
		
		
		request.setAttribute("listaCursos", listaCursos);
		
		
		
		/*List<Modulos> listaModulos= BBDD.getInstance().ConsultaMoldulos(nid);
		
		request.setAttribute("listaModulos", listaModulos);
		// off datos lita cursos
		*/
		
		
		if (session.getAttribute("usuario") != null) {

			Usuario elUser = BBDD.getUsuarioByUsuario((String) session.getAttribute("usuario"));
			
			request.setAttribute("usuario", elUser);
			request.getRequestDispatcher("profesor.jsp").forward(request, response);
		} else {
			response.sendRedirect("login");
		}

		


		
	
		
		
		
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/*String strCurso2 = BBDD.getInstance().IdCurso(request.getParameter("Cursos"));
		System.out.println(strCurso2 +"AAAAAAAAAAAAAAAA");
		System.out.println(strCurso2);
		List<Modulo> listaModulos2 = new ArrayList<>();
		listaModulos2=BBDD.getInstance().ModulosCurso(strCurso2);*/
		
		List<Modulo> listaModulos = new ArrayList<>();
		// System.out.println("el id del curso es " + NuevoCurso.getIdCurso() );
		if ((request.getParameter("code_modulo") != null) && (request.getParameter("nombre_modulo") != null)) {
			String strMaterias="Arquitectura de las apps\n" + "Gestion de software\n" + "Fundamentos UX\n";
			Modulo nuevoModulo = new Modulo(request.getParameter("code_modulo"), request.getParameter("nombre_modulo"),strMaterias);
			listaModulos.add(nuevoModulo);
			String strCurso = BBDD.getInstance().IdCurso(request.getParameter("Cursos"));
			System.out.println(request.getParameter("code_modulo"));
			System.out.println(request.getParameter("nombre_modulo"));
			
			boolean nSalida = BBDD.getInstance().CrearModulo(strCurso, listaModulos);
		}
		else
		{
			System.out.println("No Entro");
		}
		System.out.println("Hola3");
		doGet(request, response);

	/*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	String formulario=request.getParameter("code_modulo")+request.getParameter("nombre_modulo");
		
	
	String respuesta ="";
	
	
		respuesta="{\"idAmigo\":"+formulario+"}";
	
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);		
		StringWriter stringEmp = new StringWriter();

		objectMapper.writeValue(stringEmp,respuesta);
		respuesta =""+stringEmp+"";
		
		response.setContentType("application/json");
		response.getWriter().append(stringEmp.toString()).flush();
		
		
		
		
//		List<Modulo> listaModulos = new ArrayList<>();
//		//System.out.println("el id del curso es " + NuevoCurso.getIdCurso() );
//		if((request.getParameter("code_modulo")!=null) && (request.getParameter("nombre_modulo")!=null) )
//		{
//			Modulo nuevoModulo=new Modulo(request.getParameter("code_modulo"),request.getParameter("nombre_modulo"));
//			int nIdCurso=BBDD.getInstance().IdCurso(request.getParameter("Cursos"));
//			System.out.println(listaModulos.toString());
//			listaModulos.add(nuevoModulo);
//			boolean nSalida=BBDD.getInstance().CrearModulo(nIdCurso, listaModulos);
//		}
//		System.out.println("Hola3");
//		doGet(request, response);

	}*/
	}

}
