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
		listaCursos.add(new Curso("ASV 12345", "Mecanica quantica", 2, 5, 250));
		listaCursos.add(new Curso("PSV 52145", "Relatividad quantica", 1, 5, 250));

		

		
		return true;
	}


	
	public String IdCurso(String strNombreCurso)
	{
		String nId="";
		for (Curso cursoN : listaCursos) {
			if(cursoN.getNombreCurso()==strNombreCurso) {
				nId=cursoN.getIdCurso();
						

				break;
			}
		}
		return nId;
	}

	// Obtenemos el curso creado
	
	public static List<Curso> ConsultaCursos(int idProfe) {
		ArrayList<Curso> listaCursoProfe = new ArrayList<Curso>();
		for (Curso cursoN : listaCursos) {
			if(cursoN.getCodFormador()==idProfe) {
				listaCursoProfe.add(cursoN);	
				System.out.println(cursoN);
			}
		}
		return listaCursoProfe;
	}

	
	
	
	
	// Creamos los modulos
	
	public boolean CrearModulo(String idCurso, List nuevoModulo) {

		HasModulos.put(idCurso, nuevoModulo);
		return true;
	}

	public List<Modulo> ModulosCurso(String  idCurso) {

		return HasModulos.get(new Integer(idCurso));
	}

	//

	//Usuarios
	
	public static int idUsuario(String usuario)
	{
		int nid=0;
		for (int i = 0; i < listaUsuarios.size(); i++) {
			if(listaUsuarios.get(i).getUsuario().equals(usuario)) {
			nid=listaUsuarios.get(i).getId();
			}
		}
		return(nid);
	}

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



	private static final boolean loadUsuarios() {
		listaUsuarios.add(new Usuario(1, "Youssef", "Youssef", "Youssef123","coordinador"));
		listaUsuarios.add(new Usuario(2, "Hector", "Hector", "Hector","profesor"));
		listaUsuarios.add(new Usuario(3, "Raul", "Raul", "Raul","coordinador"));
		listaUsuarios.add(new Usuario(4, "Ángel M. Rayo", "arayo", "profe2018","profesor"));
		listaUsuarios.add(new Usuario(5, "Joan Marimón", "jmarimon", "profe2018","profesor"));
		listaUsuarios.add(new Usuario(6, "Xavier Saladié", "xsaladie", "profe2018","profesor"));
		listaUsuarios.add(new Usuario(7, "Eduardo di Monte", "emonte", "profe2018","profesor"));
		listaUsuarios.add(new Usuario(8, "Luis Sánchez", "lsanchez", "profe2018","profesor"));
		listaUsuarios.add(new Usuario(9, "Ricardo Ahumada", "rahumada", "profe2018","profesor"));
		return true;
		
	}


	
	///Profes
	public final List<Usuario> getProfes(){
		ArrayList<Usuario> listaProfes = new ArrayList<Usuario>();
		for (Usuario unCoor : listaUsuarios) {
			if (unCoor.getTipo()=="profesor") {
				listaProfes.add(unCoor);
			}
		}
		return listaProfes;
	}
	
	public boolean newCurso(Curso cursoNuevo) {
		listaCursos.add(cursoNuevo);
		return true;
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
