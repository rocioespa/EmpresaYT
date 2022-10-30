package ar.edu.unlam.pb2;

import java.time.LocalDate;

public abstract class Empleado {

	private String dni;
	private String nombre;
	private String apellido;
	private Integer anioIngreso;
	
	public Empleado(String dni, String nombre, String apellido, Integer anioIngreso) {
	
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.anioIngreso = anioIngreso;
	}
	
	
	
	public String getDni() {
		return dni;
	}



	public void setDni(String dni) {
		this.dni = dni;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public Integer getAnioIngreso() {
		return anioIngreso;
	}



	public void setAnioIngreso(Integer anioIngreso) {
		this.anioIngreso = anioIngreso;
	}

	public int anioAntiguedad() {
		int anioActual = LocalDate.now().getYear();
		return anioActual - anioIngreso;
	}


	public abstract double getSalario();
}
