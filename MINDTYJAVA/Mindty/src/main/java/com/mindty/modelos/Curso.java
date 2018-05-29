package com.mindty.modelos;

import java.util.ArrayList;
import java.util.List;



public class Curso {
	
	private String idCurso, nombreCurso;
	private int codFormador, modulosCurso, horasCurso;
	private List<Alumno> listaAlumnos=new ArrayList<>();
	
	
	public Curso(String idCurso, String nombreCurso, int codFormador, int modulosCurso, int horasCurso) {
		this.idCurso = idCurso;
		this.nombreCurso = nombreCurso;
		this.codFormador = codFormador;
		this.modulosCurso = modulosCurso;
		this.horasCurso = horasCurso;
		//this.listaAlumnos = listaAlumnos;
	}
	
	public void addAlumnos( Curso nuevoCurso)
	{
		listaAlumnos.add(new Alumno(1,"Raul","raul","raul","Alumno","Raul@r.com","65235895"));
		listaAlumnos.add(new Alumno(1,"Manolito","Manolo","MM","Alumno","MM@r.com","65435895"));
		listaAlumnos.add(new Alumno(1,"Jose","JS","oe","Alumno","jose@r.com","54135895"));	
	}

	public String getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(String idCurso) {
		this.idCurso = idCurso;
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public int getCodFormador() {
		return codFormador;
	}

	public void setCodFormador(int codFormador) {
		this.codFormador = codFormador;
	}

	public int getModulosCurso() {
		return modulosCurso;
	}

	public void setModulosCurso(int modulosCurso) {
		this.modulosCurso = modulosCurso;
	}

	public int getHorasCurso() {
		return horasCurso;
	}

	public void setHorasCurso(int horasCurso) {
		this.horasCurso = horasCurso;
	}

	public List<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}

	public void setListaAlumnos(List<Alumno> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}
}