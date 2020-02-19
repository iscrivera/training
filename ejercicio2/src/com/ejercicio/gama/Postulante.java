package com.ejercicio.gama;

public class Postulante {

	private String nombre;
	private int estudios;
	private int sexo;
	private int estadoCivil;
	private long telefono;

	/**
	 * 
	 */
	public Postulante() {
		super();
	}

	
	/**
	 * @param nombre
	 * @param estudios
	 * @param sexo
	 * @param estadoCivil
	 * @param telefono
	 */
	public Postulante(String nombre, int estudios, int sexo, int estadoCivil, long telefono) {
		super();
		this.nombre = nombre;
		this.estudios = estudios;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.telefono = telefono;
	}


	public boolean isCandidato() {
		/*
		 * if (this.estudios >= 3 && this.estadoCivil >= 3) { // return true; // } else
		 * { // return false; // }
		 */
		return this.estudios >= 3 && this.estadoCivil >= 3;
	}

	/**
	 * @return the estudios
	 */
	public int getEstudios() {
		return estudios;
	}

	/**
	 * @param estudios the estudios to set
	 */
	public void setEstudios(int estudios) {
		this.estudios = estudios;
	}

	/**
	 * @return the sexo
	 */
	public int getSexo() {
		return sexo;
	}

	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(int sexo) {
		this.sexo = sexo;
	}

	/**
	 * @return the estadoCivil
	 */
	public int getEstadoCivil() {
		return estadoCivil;
	}

	/**
	 * @param estadoCivil the estadoCivil to set
	 */
	public void setEstadoCivil(int estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the telefono
	 */
	public long getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

}
