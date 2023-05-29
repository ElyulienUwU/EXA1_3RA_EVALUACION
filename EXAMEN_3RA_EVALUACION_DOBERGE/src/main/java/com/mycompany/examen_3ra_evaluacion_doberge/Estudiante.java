package main.java.com.mycompany.examen_3ra_evaluacion_doberge;

import java.io.Serializable;

public class Estudiante implements Serializable{
	//Parametros
	private String nombre;
	private int nLista;
	private String grado;
	//default	
	public Estudiante() {
		// TODO Auto-generated constructor stub
		nombre = "___";
		nLista = 0;
		grado = "___";
	}
//Constructor
	public Estudiante(String nombre, int nlista, String grado) {
		super();
		this.nombre = nombre;
		nLista = nlista;
		this.grado = grado;
	}
//Getter and setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNlista() {
		return nLista;
	}

	public void setNlista(int nlista) {
		nLista = nlista;
	}

	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}
}
