package com.mindty.controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/alumno")

public class alumnoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if (session.getAttribute("usuario") != null) {
			BBDD.getInstance();
			Usuario elUser = BBDD.getUsuarioByUsuario((String) session.getAttribute("usuario"));
			
			request.setAttribute("usuario", elUser);
			request.getRequestDispatcher("alumno.jsp").forward(request, response);
		} else {
			response.sendRedirect("login");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
