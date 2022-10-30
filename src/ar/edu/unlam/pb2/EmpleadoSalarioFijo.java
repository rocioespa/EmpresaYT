package ar.edu.unlam.pb2;

public class EmpleadoSalarioFijo extends Empleado{

	private static final double PORC1 =0.05;
	private static final double PORC2 =0.1;
	private static final int ANIO1 = 2;
	private static final int ANIO2 = 5;
	private Double sueldoBasico;
	public EmpleadoSalarioFijo(String dni, String nombre, String apellido, Integer anioIngreso,Double sueldoBasico) {
		super(dni, nombre, apellido, anioIngreso);
		this.sueldoBasico = sueldoBasico;
	}
	
	private double porAdicional() {
		int ant = anioAntiguedad();
		double porc = 0.0;
		if(ant > ANIO2) {
			porc = PORC2; //el 10%
		} else if (ant >= ANIO1) {
			porc = PORC1; // 5%
		}
		return porc;
	}

	@Override
	public double getSalario() {
		return sueldoBasico + sueldoBasico * porAdicional();
		
		
	}
	
	@Override
	public String toString() {
		return  "\nEmpleadoSalarioFijo \n" + "[ Nombre = " + getNombre() + ", Apellido = "+ getApellido() + ", Salario= "+ getSalario()+"]";
	}
	
	

}
