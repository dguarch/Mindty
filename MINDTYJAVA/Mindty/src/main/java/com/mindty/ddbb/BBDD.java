package com.mindty.ddbb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.mindty.modelos.Curso;
import com.mindty.modelos.Modulo;

public class BBDD {

	private static BBDD instance = null;
	private static List<Curso> listaCursos = new ArrayList<>();
	private static Map<Integer, Modulo> HasModulos = new HashMap<Integer, Modulo>();

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
}
