package ar.edu.unlam.pb2;

import java.util.ArrayList;

public class Empresa {
	
	private ArrayList<Empleado> empleados;
	
	
	
	public Empresa() {
		this.empleados = new ArrayList<>();
	}
	
	public void agregarEmpleado(Empleado e) {
		this.empleados.add(e);
	}
	
	

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}

	public Empleado empleadoConMasClientes() {
		int max = -1;
		Empleado elMayor =null;
		for (Empleado empleado : empleados) {
			if(empleado instanceof EmpleadoAComision) {
				int cant = ((EmpleadoAComision)empleado).getCantClientesCaptados();
				if(cant > max) {
					max = cant;
					elMayor = empleado;
				}
			}
		}
		return elMayor;
		
	}

	@Override
	public String toString() {
		return "Empresa\n" + empleados;
	}

	

	public Double salarioTotalESF() {
		Double salarioTotal = 0.0;
		for (Empleado empleado : empleados) {
			if(empleado instanceof EmpleadoSalarioFijo) {
				salarioTotal += ((EmpleadoSalarioFijo)empleado).getSalario();	
				}
			}
		
		return salarioTotal;
		
		
	}
	
	

}
