package com.mindty.controler;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mindty.ddbb.BBDD;
import com.mindty.modelos.Usuario;

@WebServlet("/login")

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession();

		if (session.getAttribute("usuario") != null) {
			response.sendRedirect("");
		} else {
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}

		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String user = request.getParameter("usuario");
		String pass = request.getParameter("contrasena");
		Usuario unUsuarioEncontrado = BBDD.Login(user, pass);
		
		System.out.println(user+ ":"+pass+":"+unUsuarioEncontrado);
		
		
		if (unUsuarioEncontrado != null) {
			
			System.out.println("tipò:"+unUsuarioEncontrado.getTipo()+":"+unUsuarioEncontrado.getNombre());
			
			HttpSession session = request.getSession();
			session.setAttribute("usuario", unUsuarioEncontrado.getUsuario());
			String muro = null;
			switch (unUsuarioEncontrado.getTipo()) {
			case "coordinador":
				muro = "/Mindty/coordinador";
				break;
			case "profesor":
				muro = "/Mindty/profesor";
				break;
			case "alumno":
				muro = "/Mindty/alumno";
				break;
			}
			response.sendRedirect(muro);
			System.out.println(muro);
		} else {
			request.setAttribute("error", "Los datos son incorrectos!!!");
			this.doGet(request, response);
		}
	}

}
