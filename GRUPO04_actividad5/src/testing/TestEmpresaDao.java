package testing;

import javabean.Departamento;
import javabean.Empleado;
import javabean.Localidad;
import javabean.Trabajo;
import modelo.dao.EmpresaDaoImplList;

public class TestEmpresaDao {

	private static final String VARIOS_ASTERISCOS = "**********************************************************************";

	public static void main(String[] args) {

		// Creamos la empresa miEmpresa:

		EmpresaDaoImplList miEmpresa = new EmpresaDaoImplList("MI EMPRESA");

		/*
		 * Crear una clase Principal con main static, con una prueba en secuencia que
		 * muestre cada información que sale de la prueba de cada método de la gestión
		 * de la Empresa. Separar cada prueba con un syso que indique claramente qué se
		 * va a probar, y el resultado.
		 */
		System.out.println(VARIOS_ASTERISCOS);
		System.out.println("ALTA EMPLEADO POR OBJETO -> Test método alta(empleado) :");
		System.out.println(VARIOS_ASTERISCOS);
		System.out.println();
		System.out.println("Antes de la consulta alta(), la lista de empleados es :");
		System.out.println();
		for (Empleado ele : miEmpresa.buscarTodos())
			System.out.println(ele);
		System.out.println();
		/*
		 * Creamos los objetos empleado6 (como si fuera un registro nuevo) y empleado2
		 * con los mismos valores que ya habíamos utilizado para el empleado2 al usar el
		 * método cargarDatos () para llenar el array listaEmpleados.
		 */
		Empleado empleado6 = new Empleado(6, "Vanesa", "Lopez Cuevas", 'M', "vanelocu@radiocable.com", 1900.0, 200.0,
				new Trabajo("41", "Agente Comercial", 1700.0, 2000.0),
				new Departamento(8, "Comercial", new Localidad(6, "Piazza di Trevi. 3", "Roma", "Italia")));
		Empleado empleado2 = new Empleado(2, "María", "Callejón Benítez", 'M', "maria_callejon@vodafone.es", 1900.0,
				180.0, new Trabajo("23", "Azafata", 1700.0, 2200.0),
				new Departamento(8, "Contabilidad", new Localidad(5, "Calle Preciados, 5", "Madrid", "España")));

		System.out.println("El alta de empleado6 que es nuevo debería dar true : " + miEmpresa.alta(empleado6));
		System.out.println("El alta de empleado2 que es repetido debería dar false : " + miEmpresa.alta(empleado2));
		/*
		 * Al probar el método alta() con los dos empleados creados obtenemos distinto
		 * resultado ya que el empleado6 se añade a listaEmpleados pero el empleado2 no
		 * porque ya estaba incluído antes en listaEmpleados.
		 */
		System.out.println();
		System.out.println("Después de la consulta de alta, la lista nueva de empleados es :");
		System.out.println();
		for (Empleado ele : miEmpresa.buscarTodos())
			System.out.println(ele);
		System.out.println();
		System.out.println(VARIOS_ASTERISCOS);
		System.out.println("ELIMINAR EMPLEADO POR OBJETO -> Test método eliminarUno(empleado) :");
		System.out.println(VARIOS_ASTERISCOS);
		System.out.println();
		System.out.println("Antes de la consulta de eliminar, la lista de empleados es :");
		System.out.println();
		for (Empleado ele : miEmpresa.buscarTodos())
			System.out.println(ele);
		/*
		 * Testeamos el método eliminarUno(). Se va a eliminar de listaEmpleados el
		 * empleado que le indiquemos (para esta prueba sería el empleado6 que añadimos
		 * en el anterior test
		 */
		System.out.println();
		System.out.println("Eliminar el empleado 6 resulta (true) : " + miEmpresa.eliminarUno(empleado6)); // True
		System.out.println();
		System.out.println("Después de la consulta de eliminar, la lista nueva de empleados es :");
		System.out.println();
		for (Empleado ele : miEmpresa.buscarTodos())
			System.out.println(ele);
		System.out.println();
		System.out.println(VARIOS_ASTERISCOS);
		System.out.println("MODIFICAR EMPLEADO POR OBJETO -> Test método modificarUno(empleado) :");
		System.out.println(VARIOS_ASTERISCOS);
		System.out.println();
		System.out.println("Antes de la consulta de modificar, la lista de empleados es : ");
		System.out.println();
		for (Empleado ele : miEmpresa.buscarTodos())
			System.out.println(ele);
		System.out.println();
		System.out.println("Modificar empleado2 debería dar true : " + miEmpresa.modificarUno(empleado2));
		System.out.println("Modificar empleado6 debería dar false pq no existe : " + miEmpresa.modificarUno(empleado6));
		System.out.println();
		System.out.println("Después de la consulta de modificar, la lista nueva de empleados es :");
		System.out.println();
		for (Empleado ele : miEmpresa.buscarTodos())
			System.out.println(ele);
		System.out.println();
		System.out.println(VARIOS_ASTERISCOS);
		System.out.println("BUSCAR EMPLEAD@/S POR SEXO -> Test método buscarPorSexo(sexo) :");
		System.out.println(VARIOS_ASTERISCOS);
		System.out.println();
		System.out.println("Antes de la consulta de buscarPorSexo, la lista de empleados es :");
		System.out.println();
		for (Empleado ele : miEmpresa.buscarTodos())
			System.out.println(ele);
		System.out.println();
		System.out.println("Hombres : " + miEmpresa.buscarPorSexo('H'));
		System.out.println("Mujeres : " + miEmpresa.buscarPorSexo('M'));
		System.out.println("Cualquier otro valor (no debe mostrar ningún empleado): " + miEmpresa.buscarPorSexo('Z'));
		System.out.println();
		System.out.println(VARIOS_ASTERISCOS);
		System.out.println("BUSCAR UN EMPLEADO POR OBJETO -> Test método buscarUno(empleado):");
		System.out.println(VARIOS_ASTERISCOS);
		System.out.println();
		System.out.println("Antes de la consulta de buscarUno, la lista de empleados es :");
		System.out.println();
		for (Empleado ele : miEmpresa.buscarTodos())
			System.out.println(ele);
		System.out.println();
		System.out.println("Buscamos el empleado4 que existe y debería mostrarlo :" + miEmpresa.buscarUno(4));
		System.out.println();
		System.out.println("Buscamos el empleado8 que no exixte y debería dar null :" + miEmpresa.buscarUno(8));
		System.out.println();
		System.out.println(VARIOS_ASTERISCOS);
		System.out.println("BUSCAR TODOS LOS EMPLEADOS -> Test método buscarTodos() :");
		System.out.println(VARIOS_ASTERISCOS);
		for (Empleado ele : miEmpresa.buscarTodos()) // El método buscarTodos() lista todos los trabajadores
			System.out.println(ele);
		System.out.println();
		System.out.println(VARIOS_ASTERISCOS);
		System.out.println("MASA SALARIAL POR TODOS LOS EMPLEADOS -> Test método masaSalarial() :");
		System.out.println(VARIOS_ASTERISCOS);
		System.out.println();
		System.out.println("Antes de la consulta de masaSalarial, la lista de empleados es : ");
		System.out.println();
		for (Empleado ele : miEmpresa.buscarTodos())
			System.out.println(ele);
		System.out.println();
		System.out.println("Al tener 5 empleados, vamos a calcular su salarioBruto : ");
		System.out.println();
		System.out.println("Roberto : salario + comisión = 1850€ + 250€ = 2100€");
		System.out.println("María : salario + comisión = 1900€ + 180€ = 2080€");
		System.out.println("Claudia : salario + comisión = 2200€ + 220€ = 2420€");
		System.out.println("Fernando : salario + comisión = 1760€ + 200€ = 1960€");
		System.out.println("Emilio : salario + comisión = 2000€ + 300€ = 2300€");
		System.out.println("                                     TOTAL = 10860€");
		System.out.println("La masa salarial de la empresa debería ser 10860€ : " + miEmpresa.masaSalarial() + "€");
		System.out.println();
		System.out.println(VARIOS_ASTERISCOS);
		System.out.println("BUSCAR EMPLEADOS POR DEPARTAMENTO -> Test método buscarPorDepartamento(idDepar) :");
		System.out.println();
		System.out.println("Antes de la consulta de buscarPorDepartamento, la lista de empleados es : ");
		System.out.println();
		for (Empleado ele : miEmpresa.buscarTodos())
			System.out.println(ele);
		System.out.println();
		System.out.println("Buscamos con idDepar = 8, debería mostrar a María : " + miEmpresa.buscarPorDepartamento(8));
		System.out.println();
		System.out.println("Con idDepar = 22, al no existir, no debe mostrar ningún empleado : "
				+ miEmpresa.buscarPorDepartamento(22));
		System.out.println();
		System.out.println(VARIOS_ASTERISCOS);
		System.out.println("BUSCAR EMPLEADOS POR TRABAJO -> Test método buscarPorTrabajo(idTrabajo) :");
		System.out.println();
		System.out.println("Antes de la consulta de buscarPorTrabajo, la lista de empleados es : ");
		System.out.println();
		for (Empleado ele : miEmpresa.buscarTodos())
			System.out.println(ele);
		System.out.println();
		System.out.println(
				"Buscamos por idTrabajo = \"6\", debería mostrar a Claudia : " + miEmpresa.buscarPorTrabajo("6"));
		System.out.println();
		System.out.println("Con idTrabajo = \"50\", al no existir, no debe mostrar ningún empleado : "
				+ miEmpresa.buscarPorTrabajo("50"));
		System.out.println();
		System.out.println(VARIOS_ASTERISCOS);
		System.out.println("BUSCAR EMPLEADOS POR PAIS -> Test método buscarPorPais(pais) :");
		System.out.println();
		System.out.println("Antes de la consulta de buscarPorPais, la lista de empleados es : ");
		System.out.println();
		for (Empleado ele : miEmpresa.buscarTodos())
			System.out.println(ele);
		System.out.println();
		System.out.println("Buscamos por pais = \"Reino Unido\", debería mostrar a Fernando : "
				+ miEmpresa.buscarPorPais("Reino Unido"));
		System.out.println();
		System.out.println("Buscamos por pais = \"China\", al no existir, no debe mostrar ningún empleado :"
				+ miEmpresa.buscarPorPais("China"));
	}
}
