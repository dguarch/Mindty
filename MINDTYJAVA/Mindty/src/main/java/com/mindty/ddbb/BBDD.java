package com.mindty.ddbb;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.mindty.modelos.Curso;
import com.mindty.modelos.Modulo;
import com.mindty.modelos.Usuario;

public class BBDD {

	private static BBDD instance = null;
//	private static List listaCursos = new ArrayList<>();
	private static Map<Integer, Modulo> HasModulos = new HashMap<Integer, Modulo>();
	private static ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();

	public static BBDD getInstance() {
		if (instance == null)
			instance = new BBDD();
		return instance;
	}

	// Creamos los cursos
	public boolean CrearCurso(Curso unCurso) {

		listaCursos.add(new Curso(1, 200, "Mecanica quantica", "Pedrito"));
		// listaCursos.add(unCurso);

		return true;
	}

	// Obtenemos el curso creado
	public static List<Curso> ConsultaCursos() {

		return listaCursos;
	}

	// Creamos los modulos

	public boolean CrearModulo(Curso unCurso, Modulo nuevoModulo) {

		HasModulos.put(unCurso.getIdCurso(), nuevoModulo);
		return true;
	}

	public List<Modulo> ModulosCurso(int idCurso) {
		List<Modulo> listaModulos = new ArrayList<>();
		Iterator it = HasModulos.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next();
			if (Integer.parseInt((String) e.getKey()) == idCurso) {
				listaModulos.add((Modulo) e.getValue());
			}
		}
		return listaModulos;
	}
	public static Usuario Login(String usuario, String contrasena) {
		loadUsuarios();
		Usuario user = null;
		for (int i = 0; i < listaUsuarios.size(); i++) {
			if(listaUsuarios.get(i).getUsuario().equals(usuario)&&listaUsuarios.get(i).getContraseña().equals(contrasena)) {
			user=listaUsuarios.get(i);
			}
		}
		return user;
	}
	private static final boolean loadUsuarios() {
		listaUsuarios.add(new Usuario(1, "Youssef", "Youssef", "Youssef123","coordinador"));
		listaUsuarios.add(new Usuario(2, "Hector", "Hector", "Hector123","profesor"));
		listaUsuarios.add(new Usuario(3, "Raul", "Raul", "Raul123","alumno"));
		listaUsuarios.add(new Usuario(4, "Ivan", "Ivan", "Ivan123","coordinador"));
		return true;
	}
}
