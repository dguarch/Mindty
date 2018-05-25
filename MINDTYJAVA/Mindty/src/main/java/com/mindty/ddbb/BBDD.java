package com.mindty.ddbb;

import java.util.ArrayList;
import java.util.List;

import com.mindty.modelos.Curso;
import com.mindty.modelos.Modulo;





public class BBDD {
	
	private static BBDD instance=null;
	private static List<Curso> listaCursos=new ArrayList<>();
	private static List<Modulo> listaModulo=new ArrayList<>();
	
	public static BBDD getInstance() {
		if(instance==null)instance=new BBDD();
		return instance;
	}
	
	private static boolean loadCurso() {
		
		
		
		
		return true;
	}
}
