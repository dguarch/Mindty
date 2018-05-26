package com.mindty.modelos;

public class Usuario {
	
	protected int id;
	protected String nombre;
	protected String usuario;
	protected String contraseña;
	protected String tipo;
	
	public Usuario(int id, String nombre, String usuario, String contraseña, String tipo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.usuario = usuario;
		this.contraseña = contraseña;
		this.tipo = tipo;
	}
	
	

}
