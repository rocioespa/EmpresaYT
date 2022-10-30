package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEmpresa {

	@Test
	public void mostrarTodosLosSalarios() {
		Empresa emp = new Empresa();
		
		emp.agregarEmpleado(new EmpleadoSalarioFijo("123","Ana","Lopez",2021,45000.0));
		emp.agregarEmpleado(new EmpleadoAComision("123","Pepe","Gomez",2021,30000.0,100,500.0));
		emp.agregarEmpleado(new EmpleadoSalarioFijo("123","Luis","Lopez",2019,50000.0));
		emp.agregarEmpleado(new EmpleadoAComision("123","Leo","Torres",2017,30000.0,200,100.0));
		emp.agregarEmpleado(new EmpleadoSalarioFijo("123","Maria","Perez",2014,100000.0));
		
		System.out.println(emp.toString());
		
//		
	}
	

	@Test
	public void mostrarElEmpleadoConMasClientesCaptados() {
        Empresa emp = new Empresa();
		
		emp.agregarEmpleado(new EmpleadoSalarioFijo("123","Ana","Lopez",2021,45000.0));
		emp.agregarEmpleado(new EmpleadoAComision("123","Pepe","Gomez",2021,30000.0,100,500.0));
		emp.agregarEmpleado(new EmpleadoSalarioFijo("123","Luis","Lopez",2019,50000.0));
		emp.agregarEmpleado(new EmpleadoAComision("123","Leo","Torres",2017,30000.0,200,100.0));
		emp.agregarEmpleado(new EmpleadoSalarioFijo("123","Maria","Perez",2014,100000.0));
		
		System.out.println(emp.empleadoConMasClientes().toString());
		
		
	}
   
	@Test
	public void queSePuedaCalcularElSalarioTotalDeEmpleadosConSalarioFijo() {
        Empresa emp = new Empresa();
		
		emp.agregarEmpleado(new EmpleadoSalarioFijo("123","Ana","Lopez",2021,45000.0));
		emp.agregarEmpleado(new EmpleadoAComision("123","Pepe","Gomez",2021,30000.0,100,500.0));
		emp.agregarEmpleado(new EmpleadoSalarioFijo("123","Luis","Lopez",2019,50000.0));
		emp.agregarEmpleado(new EmpleadoAComision("123","Leo","Torres",2017,30000.0,200,100.0));
		emp.agregarEmpleado(new EmpleadoSalarioFijo("123","Maria","Perez",2014,100000.0));
//		System.out.println(emp.salarioTotalESF());
		Double valorEsperado = 207500.0;
		Double valorObtenido = emp.salarioTotalESF();
		assertEquals(valorEsperado, valorObtenido);
		
	}

}
