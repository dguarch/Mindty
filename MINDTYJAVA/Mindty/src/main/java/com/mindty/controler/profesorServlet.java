package com.mindty.controler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
<<<<<<< HEAD
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
=======
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// request.getRequestDispatcher("profesor.jsp").forward(request, response);
		
		String user = request.getParameter("usuario");
		String pass = request.getParameter("contrasena");
		Usuario unUsuarioEncontrado = BBDD.Login(user, pass);
		//77int id=0;
		//id=unUsuarioEncontrado.getId();
		
		System.out.println(user+ ":"+pass+":"+unUsuarioEncontrado);
		
		
		
			
				
				
>>>>>>> c8241ac3f3e3677ee9a3aaa638ab2607c40d1e39

		

<<<<<<< HEAD
		System.out.println("Hola");
	
		//on datos lita cursos
//		BBDD.getInstance().CrearCurso();
		List<Curso> listaCursos= BBDD.getInstance().ConsultaCursos();
		System.out.println(listaCursos.toString());
		request.setAttribute("listaCursos", listaCursos);
		// off datos lita cursos
		
		//on datos lita cursos
//		BBDD.getInstance().CrearCurso();
		List<Curso> listaModulos= BBDD.getInstance().ConsultaCursos();
		System.out.println(listaModulos.toString());
		request.setAttribute("listaModulos", listaModulos);
		// off datos lita cursos
		
		
		
=======
		// on datos lita cursos
		BBDD.getInstance().CrearCurso();
		List<Curso> listaCursos = BBDD.getInstance().ConsultaCursos(3);
		//System.out.println(listaCursos.toString());
		request.setAttribute("listaCursos", listaCursos);
		// off datos lita cursos

>>>>>>> c8241ac3f3e3677ee9a3aaa638ab2607c40d1e39
		request.getRequestDispatcher("profesor.jsp").forward(request, response);
	}

	private void ListaModulo() {
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

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
	}

}
