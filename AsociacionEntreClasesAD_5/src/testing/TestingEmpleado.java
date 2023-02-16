package testing;

import javabean.Departamento;
import javabean.Empleado;
import javabean.Localidad;
import javabean.Trabajo;

public class TestingEmpleado {

	public static void main(String[] args) {
		
	Localidad loc1 = new Localidad(43003,"Descalzos 3", "Tarragona", "España" ); 
		
	Trabajo t1 = new Trabajo("1", "contador", 2200.0, 1900);
	
	Departamento d1 = new Departamento(100, "Finanzas", loc1);
	
	Empleado e1 = new Empleado();
	e1.setIdEmpleado(1);
	e1.setNombre("Marta");
	e1.setApellidos("Gomez Sánchez");
	e1.setGenero('M');
	e1.setEmail("mgomezsanchez@gmail.com");
	e1.setSalario(2200);
	e1.setComision(350);
	e1.setTrabajo(t1);
	e1.setDepartamento(d1);
	
	Empleado e2 = new Empleado(4,"Fabián", "Loth Han", 'H', "flothhan@gmail.com", 1200,
			200, null , null);
	
	Empleado e3 = new Empleado(5,"Ana", "Luis Re", 'M', "aluisre@gmail.com", 1500,
			300, null , null);
	
	System.out.println("El trabajo del empleado es: " +e1.getTrabajo().getDescripcion());
	System.out.println("El departamento al que pertenece es : " + e1.getDepartamento().getDescripcion());
	
	
	
	}

	
}
