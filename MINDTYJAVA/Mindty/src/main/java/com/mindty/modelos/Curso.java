package com.mindty.modelos;

import java.util.ArrayList;
import java.util.List;



public class Curso {
	
	private int idCurso,nhoras;
	private String strnombre,strformador; 
	private List<Alumno> listaAlumnos=new ArrayList<>();
	
	
	public Curso(int idCurso, int nhoras, String strnombre, String strformador) {
		super();
		this.idCurso = idCurso;
		this.nhoras = nhoras;
		this.strnombre = strnombre;
		this.strformador = strformador;
		//this.listaAlumnos = listaAlumnos;
	}
	
	public void addAlumnos( Curso nuevoCurso)
	{
		
		listaAlumnos.add(new Alumno(1,"Raul","raul","raul","Alumno","Raul@r.com","65235895"));
		listaAlumnos.add(new Alumno(1,"Manolito","Manolo","MM","Alumno","MM@r.com","65435895"));
		listaAlumnos.add(new Alumno(1,"Jose","JS","oe","Alumno","jose@r.com","54135895"));
		
		
	}

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public int getNhoras() {
		return nhoras;
	}

	public void setNhoras(int nhoras) {
		this.nhoras = nhoras;
	}

	public String getStrnombre() {
		return strnombre;
	}

	public void setStrnombre(String strnombre) {
		this.strnombre = strnombre;
	}

	public String getStrformador() {
		return strformador;
	}

	public void setStrformador(String strformador) {
		this.strformador = strformador;
	}

	public List<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}

	public void setListaAlumnos(List<Alumno> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}
	
	

}
