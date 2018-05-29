package com.mindty.modelos;

import java.util.ArrayList;
import java.util.List;

public class Modulo {
	
	private String strNombre,strCodigo, strMaterias;
	private List<String> listaMateria=new ArrayList<>();

	public Modulo(String strNombre, String strCodigo,String strMaterias) {
		super();
		this.strNombre = strNombre;
		this.strCodigo = strCodigo;
		this.strMaterias=strMaterias;
	}

	public String getStrNombre() {
		return strNombre;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}

	public String getStrCodigo() {
		return strCodigo;
	}

	public void setStrCodigo(String strCodigo) {
		this.strCodigo = strCodigo;
	}
	
	

}
