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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getTipo() {
		boolean b = true;
		return tipo;

	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}

