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
	private static Map<String, List<Modulo>> HasModulos = new HashMap<>();
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

<<<<<<< HEAD
		listaCursos.add(new Curso(1, 200, "Artes Aven", "Hector"));
		listaCursos.add(new Curso(1, 200, "Mecanica quantica", "Pedrito"));
		listaCursos.add(new Curso(2, 250, "Sumas", "luis"));
=======

		listaCursos.add(new Curso("1","Mecanica quantica", 2,5, 250));

		listaCursos.add(new Curso("2","Fisica", 4,5, 250));
>>>>>>> c8241ac3f3e3677ee9a3aaa638ab2607c40d1e39

		// listaCursos.add(unCurso);

		return true;
	}

<<<<<<< HEAD
	public int IdCurso(String strNombreCurso) {
		int nId = 0;
		for (Curso cursoN : listaCursos) {
			if (cursoN.getStrnombre() == strNombreCurso) {
				nId = cursoN.getIdCurso();

=======
	public String IdCurso(String strNombreCurso)
	{
		String nId="";
		for (Curso cursoN : listaCursos) {
			if(cursoN.getNombreCurso()==strNombreCurso) {
				nId=cursoN.getIdCurso();
						
>>>>>>> c8241ac3f3e3677ee9a3aaa638ab2607c40d1e39
				break;
			}
		}
		return nId;
	}

	// Obtenemos el curso creado
	
	public static List<Curso> ConsultaCursos(int idProfe) {
		
		List<Curso> listaCursos = new ArrayList<>();
		
		for (Curso cursoN : listaCursos) {
			if(cursoN.getCodFormador()==idProfe) {
				listaCursos.add(cursoN);
						
			}
		}
		
		
		return listaCursos;
	}

	// Creamos los modulos

	public boolean CrearModulo(String idCurso, List nuevoModulo) {

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
<<<<<<< HEAD

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

=======

	private static final boolean loadUsuarios() {
		listaUsuarios.add(new Usuario(1, "Youssef", "Youssef", "Youssef","coordinador"));
		listaUsuarios.add(new Usuario(2, "Hector", "Hector", "Hector","profesor"));
		listaUsuarios.add(new Usuario(3, "Raul", "Raul", "Raul","alumno"));
		listaUsuarios.add(new Usuario(4, "Ivan", "Ivan", "Ivan123","coordinador"));
		return true;
	}

>>>>>>> c8241ac3f3e3677ee9a3aaa638ab2607c40d1e39
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
