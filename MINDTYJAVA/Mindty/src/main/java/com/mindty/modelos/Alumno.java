package com.mindty.modelos;

public class Alumno  extends Usuario{
	
	private String email,telefono;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Alumno(int id, String nombre, String usuario, String contraseņa, String tipo,String email,String telefono) {
		super(id, nombre, usuario, contraseņa, tipo);
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
