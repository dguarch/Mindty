package com.mindty.ddbb;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.mindty.modelos.Curso;
import com.mindty.modelos.Modulo;
import com.mindty.modelos.Usuario;


public class BBDD {

	private static BBDD instance = null;
	private static List<Curso> listaCursos = new ArrayList<>();
	private static Map<Integer, List<Modulo>> HasModulos = new HashMap<>();
	private static ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();

	public static BBDD getInstance() {
		if (instance == null)
			instance = new BBDD();
		return instance;
	}

	private BBDD() {
		loadUsuarios();
		CrearCurso();

	}

	// Creamos los cursos
	public boolean CrearCurso() {

		listaCursos.add(new Curso(1, 200, "Artes Aven", "Hector"));
		listaCursos.add(new Curso(1, 200, "Mecanica quantica", "Pedrito"));
		listaCursos.add(new Curso(2, 250, "Sumas", "luis"));

		// listaCursos.add(unCurso);

		return true;
	}

	public int IdCurso(String strNombreCurso) {
		int nId = 0;
		for (Curso cursoN : listaCursos) {
			if (cursoN.getStrnombre() == strNombreCurso) {
				nId = cursoN.getIdCurso();

				break;
			}
		}
		return nId;
	}

	// Obtenemos el curso creado
	public static List<Curso> ConsultaCursos() {
		return listaCursos;
	}

	// Creamos los modulos

	public boolean CrearModulo(int idCurso, List nuevoModulo) {

		HasModulos.put(idCurso, nuevoModulo);
		return true;
	}

	public List<Modulo> ModulosCurso(int idCurso) {

		return HasModulos.get(new Integer(idCurso));
	}

	//
	// Usuarios
	public static Usuario Login(String usuario, String contraseña) {
		loadUsuarios();
		Usuario user = null;
		for (int i = 0; i < listaUsuarios.size(); i++) {
			if (listaUsuarios.get(i).getUsuario().equals(usuario)
					&& listaUsuarios.get(i).getContraseña().equals(contraseña)) {
				user = listaUsuarios.get(i);
			}
		}
		return user;
	}

	public static Usuario getUsuarioByUsuario(String usuario) {
		Usuario unUsuario = null;
		for (Usuario user : listaUsuarios) {
			if (user.getUsuario().equals(usuario)) {
				unUsuario = user;
				break;
			}
		}

		return unUsuario;
	}

	private static final boolean loadUsuarios() {
		listaUsuarios.add(new Usuario(1, "Youssef", "Youssef", "Youssef", "coordinador"));
		listaUsuarios.add(new Usuario(2, "Hector", "Hector", "Hector", "profesor"));
		listaUsuarios.add(new Usuario(3, "Raul", "Raul", "Raul123", "alumno"));
		listaUsuarios.add(new Usuario(4, "Ivan", "Ivan", "Ivan123", "coordinador"));
		return true;
	}

public boolean AnalisisLogin( String usuario, String contraseña) {
//	String regexNum=".?[0-9].?";    //&& !usuario.toLowerCase()
	boolean isOk = false;
	if (usuario != null && usuario.equals("") && usuario.equals(".?[0-9].?") ) {
		
		
			for (Usuario usuarioT : listaUsuarios) {
				if (usuarioT.getUsuario() == usuario) {
					usuarioT.setUsuario(usuario);
					usuarioT.setContraseña(contraseña);
					int index = listaUsuarios.indexOf(usuarioT);
					listaUsuarios.set(index, usuarioT);
					isOk = true;
					break;
				}
			}
		}
		

	return isOk;
}

}


// datos lanzados a jsp profesor

// public final Curso getCurso(String strnombre) {
// Curso unCurso = null;
// for (Curso cursoc : listaCursos) {
// if (cursoc.getIdCurso() == strnombre) {
// unCurso = cursoc;
// break;
// }
// }
// return unCurso;
// }
// }
