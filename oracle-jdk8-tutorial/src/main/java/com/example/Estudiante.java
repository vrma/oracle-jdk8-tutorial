package com.example;

public class Estudiante {

	String nombre;
	String apellido1;
	String apellido2;
	int totalAsignaturas;
	Facultad facultad;
	
	public Estudiante() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Estudiante(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Estudiante(String nombre, String apellido1, String apellido2, int totalAsignaturas, Facultad facultad) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.totalAsignaturas = totalAsignaturas;
		this.facultad = facultad;
	}
	
	
}
