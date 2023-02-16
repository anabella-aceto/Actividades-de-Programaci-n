package testing;

import javabean.Departamento;
import javabean.Empleado;
import javabean.Localidad;
import javabean.Trabajo;

public class TestingEmpleado {

	private static final String VARIOSASTERISCOS = "******************************************************************";

	public static void main(String[] args) {

		Localidad localidad1 = new Localidad(5, "Calle Luciernaga, 5", "Valencia", "España");

		Departamento departamento1 = new Departamento(8, "RR.HH", localidad1);

		Trabajo trabajo1 = new Trabajo("1", "Administrativo", 1400.0, 1800.0);

		Empleado empleado1 = new Empleado(3, "Roberto", "Martinez Rodriguez", 'H', "rmartinez@gmail.com", 1850.0, 250.0,
				trabajo1, departamento1);

		System.out.println(VARIOSASTERISCOS);
		/*
		 * La información completa de un empleado SIN usar toString: Nombre, apellidos,
		 * género, nombre del departamento, nombre de su trabajo, dirección , ciudad y
		 * país.
		 */
		System.out.println("Información del empleado1 : ");
		System.out.println(VARIOSASTERISCOS);
		System.out.println("Nombre y apellidos : " + empleado1.getNombre() + " " + empleado1.getApellidos());
		System.out.println(empleado1.literalSexo());
		System.out.println("Departamento : " + empleado1.getDepartamento().getDescripcion());
		System.out.println("Trabajo : " + empleado1.getTrabajo().getDescripción());
		System.out.println("Dirección : " + empleado1.getDepartamento().getLocalidad().getDireccion());
		System.out.println("Ciudad : " + empleado1.getDepartamento().getLocalidad().getCiudad());
		System.out.println("País : " + empleado1.getDepartamento().getLocalidad().getPais());
		System.out.println();

		System.out.println(VARIOSASTERISCOS);
		System.out.println("Datos del Trabajo " + empleado1.getTrabajo().getDescripción() + " del empleado1 : ");
		System.out.println(VARIOSASTERISCOS);
		System.out.println("Id Trabajo : " + empleado1.getTrabajo().getIdTrabajo());
		System.out.println("Salario mínimo : " + empleado1.getTrabajo().getMinSalario() + " €");
		System.out.println("Salario máximo : " + empleado1.getTrabajo().getMaxSalario() + " €");
		System.out.println();

		System.out.println(VARIOSASTERISCOS);
		System.out.println("Datos Departamento " + empleado1.getDepartamento().getDescripcion() + " del empleado1 : ");
		System.out.println(VARIOSASTERISCOS);
		System.out.println("Id Departamento : " + empleado1.getDepartamento().getIdDepar());
		System.out.println("Dirección : " + empleado1.getDepartamento().getLocalidad().getDireccion());
		System.out.println("Ciudad : " + empleado1.getDepartamento().getLocalidad().getCiudad());
		System.out.println("País : " + empleado1.getDepartamento().getLocalidad().getPais());

	}

}
