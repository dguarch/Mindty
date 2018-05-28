package com.mindty.controler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mindty.ddbb.BBDD;
import com.mindty.modelos.Curso;
import com.mindty.modelos.Modulo;


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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hola");
	
		//on datos lita cursos
		BBDD.getInstance().CrearCurso();
		List<Curso> listaCursos= BBDD.getInstance().ConsultaCursos();
		System.out.println(listaCursos.toString());
		request.setAttribute("listaCursos", listaCursos);
		// off datos lita cursos
		
		request.getRequestDispatcher("profesor.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hola");
		Curso NuevoCurso=(Curso) BBDD.getInstance().ConsultaCursos();
		List<Modulo> listaModulos = new ArrayList<>();
		System.out.println("el id del curso es " + NuevoCurso.getIdCurso() );
		listaModulos=BBDD.getInstance().ModulosCurso(NuevoCurso.getIdCurso());
		doGet(request, response);
	}

}
