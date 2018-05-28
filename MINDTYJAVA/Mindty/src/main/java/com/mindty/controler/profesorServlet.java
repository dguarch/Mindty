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
		
		request.getRequestDispatcher("profesor.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Holaaa");
		
		
		Curso NuevoCurso=new Curso(1, 100, "Curso", "Pedro");
		System.out.println("Holaaaaaaaaaaaaaaaaaaa2");
		List<Modulo> listaModulos = new ArrayList<>();
		//System.out.println("el id del curso es " + NuevoCurso.getIdCurso() );
		if((request.getParameter("code_modulo")!=null) && (request.getParameter("nombre_modulo")!=null) )
		{
			Modulo nuevoModulo=new Modulo(request.getParameter("code_modulo"),request.getParameter("nombre_modulo"));
			System.out.println(listaModulos.toString());
			listaModulos.add(nuevoModulo);
			boolean nSalida=BBDD.getInstance().CrearModulo(NuevoCurso, listaModulos);
		}
		System.out.println("Hola3");
		doGet(request, response);
	}

}
