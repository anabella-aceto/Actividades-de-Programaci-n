package empleadoActividad4;

public class TestingEmpleado {

	public static void main(String[] args) {
		
	Empleado empleado1 = new Empleado();
	
	empleado1.setNombre("Juan");
	empleado1.setApellidos("Perez Garcia");
	empleado1.setEmail("jperez@gmail.com");
	empleado1.setSalario(28000);
	empleado1.setComplemento(2333,33);;
	empleado1.setSexo('H');
	empleado1.setIdDepartamento(1);
	
	System.out.println(empleado1);
	System.out.println("El nombre completo es: " +empleado1.nombreCompleto());
	System.out.println("El email es: " +empleado1.emailEmpleado());
	System.out.println("El salario anual es: " + empleado1.getSalario());
	System.out.println("El salario mensual es: " +String.format("%.2f", empleado1.salarioMensual()));
	System.out.println("El salario bruto es: " +String.format("%.2f",  empleado1.salarioBruto()));
	System.out.println("El género es: " +empleado1.sexoPersona());
	
	
	}

	

}

