package ar.edu.unlam.pb2;

public class EmpleadoAComision extends Empleado{

	private Double salarioMinimo;
	private Integer cantClientesCaptados;
	private Double montoPorCliente;
	
	public EmpleadoAComision(String dni, String nombre, String apellido, Integer anioIngreso,
			Double salarioMinimo,Integer cantClientesCaptados,Double montoPorCliente) {
		super(dni, nombre, apellido, anioIngreso);
		this.salarioMinimo = salarioMinimo;
		this.cantClientesCaptados = cantClientesCaptados;
		this.montoPorCliente = montoPorCliente;
	}
	
	

	public Integer getCantClientesCaptados() {
		return cantClientesCaptados;
	}



	@Override
	public double getSalario() {
		double sal = montoPorCliente * cantClientesCaptados;
		if(sal < salarioMinimo) {
			sal = salarioMinimo;
		}
		return sal;
		
		
	}



	@Override
	public String toString() {
		return "\nEmpleadoAComision \n" + "[ Nombre = " + getNombre() + ", Apellido = "+ getApellido() + ", Salario= "+ getSalario()+"]";
	}
	
	

}
