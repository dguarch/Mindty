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
import com.mindty.modelos.Usuario;

@WebServlet("/coordinador")
public class coordinadorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Usuario> profes = BBDD.getInstance().getProfes();
		request.setAttribute("profes", profes);
		request.getRequestDispatcher("coordinador.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Curso nuevoCurso = new Curso(request.getParameter("codigoCurso"),request.getParameter("nombreCurso"),Integer.parseInt(request.getParameter("profes")),Integer.parseInt(request.getParameter("modulos")),Integer.parseInt(request.getParameter("horas")));
		BBDD.getInstance().newCurso(nuevoCurso);
		doGet(request, response);
	}
}