package modelo.dao;

import java.util.ArrayList;

import javabean.Departamento;
import javabean.Empleado;
import javabean.Localidad;
import javabean.Trabajo;

public class EmpresaDaoImplList implements EmpresaDao { // Implemento los métodos del interface, los tengo que redefinir

	private String nombre;
	private ArrayList<Empleado> listaEmpleados;

	// Constructor
	public EmpresaDaoImplList(String nombre) {
		this.nombre = nombre;
		listaEmpleados = new ArrayList<>();
		cargarDatos();
	}

	// Método para llenar el array de empleados

	private void cargarDatos() {

		Trabajo trab1 = new Trabajo("21", "Administrativo", 1600.0, 2000.0);
		Trabajo trab2 = new Trabajo("14", "Contable", 1300.0, 1800.0);
		Trabajo trab3 = new Trabajo("6", "Abogado", 2000.0, 2400.0);
		Trabajo trab4 = new Trabajo("19", "Analista", 1600.0, 1900.0);
		Trabajo trab5 = new Trabajo("4", "Ingeniero", 1800.0, 2400.0);

		Localidad loc1 = new Localidad(5, "740 5th Avenue", "New York", "EE.UU");
		Localidad loc2 = new Localidad(5, "Calle Preciados, 5", "Madrid", "España");
		Localidad loc3 = new Localidad(5, "32 Rue du Commandant Guilbaud", "París", "Francia");
		Localidad loc4 = new Localidad(5, "Great Russell Street", "Londres", "Reino Unido");
		Localidad loc5 = new Localidad(5, "Werner-Heisenberg-Allee. 34", "Münich", "Alemania");

		Departamento dep1 = new Departamento(11, "Administración", loc1);
		Departamento dep2 = new Departamento(12, "Contabilidad", loc2);
		Departamento dep3 = new Departamento(13, "Laboral", loc3);
		Departamento dep4 = new Departamento(14, "Estadística", loc4);
		Departamento dep5 = new Departamento(15, "Ingeniería", loc5);

		listaEmpleados.add(new Empleado(1, "Roberto", "Martinez Rodriguez", 'H', "rmartinez@gmail.com", 1850.0, 250.0,
				trab1, dep1));
		listaEmpleados.add(
				new Empleado(2, "Ana", "Fernandez Conde", 'M', "afernandez@hotmail.com", 1500.0, 150.0, trab2, dep2));
		listaEmpleados.add(
				new Empleado(3, "Claudia", "Ruiz de Haro", 'M', "claudia_ruiz@yahoo.es", 2200.0, 220.0, trab3, dep3));
		listaEmpleados.add(new Empleado(4, "Fernando", "Ladrón de Guevara", 'H', "fernando_la_gue@telefonica.net",
				1760.0, 200.0, trab4, dep4));
		listaEmpleados.add(new Empleado(5, "Emilio", "Valverde Casares", 'H', "emiliovalverdec@gmail.com", 2000.0,
				300.0, trab5, dep5));
	}

	// Métodos getter and setter:

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Redefino los métodos del interface EmpresaDao

	/*
	 * Método para dar de alta un empleado: Recibe un empleado por parámetro y a
	 * través del método contains() comprueba si está incluido en el array
	 * listaEmpleados. Si esta incluido el empleado en listaEmpleados devuelve false
	 * y si no está incluido utiliza el método add() para incluir el empleado en el
	 * array listaEmpleados
	 */

	@Override
	public boolean alta(Empleado empleado) {
		if (listaEmpleados.contains(empleado))
			return false;
		else
			return listaEmpleados.add(empleado);
	}

	/*
	 * Método para eliminar un empleado: Recibe un empleado para parámetro y
	 * mediante el método remove() lo elimina del array listaEmpleados. Si el
	 * empleado a eliminar no estuviera en el array listaEmpleados devuelve false.
	 */

	@Override
	public boolean eliminarUno(Empleado empleado) {
		return listaEmpleados.remove(empleado);
	}

	/*
	 * Método para modificar un empleado: Recibe un empleado por parámetro y
	 * mediante el método indexOf() calcula la posición que ocupa en el array
	 * listaEmpleados. Si el empleado no tiene el mismo idEmpleado que el que se
	 * quiere sustituir, la posición sería -1 y devuelve false. Dos empleados son
	 * diferentes si tienen distinto idEmpleado lo definimos en los métodos hasCode
	 * y Equals de la clase Empleado. Si existe el empleado en el array, mediante el
	 * método set(), el empleado que entra como parámetro sustituye al que tiene el
	 * mismo idEmpleado.
	 */

	@Override
	public boolean modificarUno(Empleado empleado) {
		int posicion = listaEmpleados.indexOf(empleado);
		if (posicion == -1)
			return false;
		else
			listaEmpleados.set(posicion, empleado);
		return true;
	}

	/*
	 * Método para buscar empleados por sexo: Recibe como parámetro el sexo que se
	 * quiere buscar en el array listaEmpleados. Se crea un array auxiliar en el que
	 * se van a añadir las coincidencias encontradas de géneno mediante el método
	 * getGenero(). Finalmente, mediante el método add(), se añaden al array
	 * auxiliar las coincidencias de género encontradas y las devuelve como true. Si
	 * no encuentra coincidencias devuelve el array auxiliar vacío.
	 */

	@Override
	public ArrayList<Empleado> buscarPorSexo(char genero) {
		ArrayList<Empleado> aux = new ArrayList<>();
		for (Empleado empleado : listaEmpleados) {
			if (empleado.getGenero() == genero)
				aux.add(empleado);
		}
		return aux;
	}

	/*
	 * Método para buscar un empleado: Este método crea un empleado vacío.
	 * Posteríormente se le asigna el idEmpleado que se ha recibido de parámetro de
	 * entrada. Después mediante el método indexOf() busca la posición que ocupa el
	 * idEmpleado en el array listaEmpleados. Si no la encuentra devuelve false y si
	 * la encuentra muestra ese empleado mediante el método get().
	 */

	@Override
	public Empleado buscarUno(int idEmpleado) {
		Empleado emp = new Empleado(); // creamos un empleado vacío
		emp.setIdEmpleado(idEmpleado);
		int posicion = listaEmpleados.indexOf(emp);
		if (posicion == -1)
			return null;
		else
			return listaEmpleados.get(posicion);
	}

	/*
	 * Método para mostrar todos los empleados: Devuelve los elementos que contiene
	 * el array listaEmpleados.
	 */

	@Override
	public ArrayList<Empleado> buscarTodos() {
		return listaEmpleados;
	}

	/*
	 * Método para calcular la masa salarial de todos los empleados: Mediane un
	 * bucle for each se van acumulando los salarios brutos de todos los empleados
	 * en la variable masaSalarial. Cuando finaliza el bucle devuelve el valor de
	 * masa salarial.
	 */

	@Override
	public double masaSalarial() {
		double masaSalarial = 0;
		for (Empleado empleado : listaEmpleados) {
			masaSalarial += empleado.salarioBruto();
		}
		return masaSalarial;
	}

	/*
	 * Método para buscar empleados por Departamento: Primero se crea un array
	 * auxiliar vacío. Después, mediante un bucle for each se recorre el array
	 * listaEmpleados buscando los empleados que tienen el mismo idDepartamento que
	 * el que se recibe como parámetro de entrada. Los empleados que encuentra se
	 * añaden al array auxiliar mediante el método add() y devuelve el array
	 * auxiliar. Para comparar al ser int utiliza ==. Si no encuentra ningún
	 * empleado con el mismo idDepartamento devuelve el array auxiliar vacío.
	 */

	@Override
	public ArrayList<Empleado> buscarPorDepartamento(int idDepartamento) {
		ArrayList<Empleado> aux = new ArrayList<>();
		for (Empleado empleado : listaEmpleados) {
			if (empleado.getDepartamento().getIdDepar() == idDepartamento)
				aux.add(empleado);
		}
		return aux;
	}

	/*
	 * Método para buscar empleados por Trabajo: Primero se crea un array auxiliar
	 * vacío. Después, mediante un bucle for each se recorre el array listaEmpleados
	 * buscando los empleados que tienen el mismo idTrabajo que el que se recibe
	 * como parámetro de entrada. Los empleados que encuentra se añaden al array
	 * auxiliar mediante el método add() y devuelve el array auxiliar. Para comparar
	 * al ser String utiliza el método equals() Si no encuentra ningún empleado con
	 * el mismo idTrabajo devuelve el array auxiliar vacío.
	 */

	@Override
	public ArrayList<Empleado> buscarPorTrabajo(String idTrabajo) {
		ArrayList<Empleado> aux = new ArrayList<>();
		for (Empleado empleado : listaEmpleados) {
			if (empleado.getTrabajo().getIdTrabajo().equals(idTrabajo))
				aux.add(empleado);
		}
		return aux;
	}

	/*
	 * Método para buscar empleados por Pais: Primero se crea un array auxiliar
	 * vacío. Después, mediante un bucle for each se recorre el array listaEmpleados
	 * buscando los empleados que tienen el mismo pais que el que se recibe como
	 * parámetro de entrada. Los empleados que encuentra se añaden al array auxiliar
	 * mediante el método add() y devuelve el array auxiliar. Para comparar al ser
	 * String utiliza el método equalsIgnoreCase() para que no haga distinción de
	 * mayúsculas y minúsculas cuando busque el pais. Si no encuentra ningún
	 * empleado con el mismo pais devuelve el array auxiliar vacío.
	 */

	@Override
	public ArrayList<Empleado> buscarPorPais(String pais) {
		ArrayList<Empleado> aux = new ArrayList<>();
		for (Empleado empleado : listaEmpleados) {
			if (empleado.getDepartamento().getLocalidad().getPais().equalsIgnoreCase(pais))
				aux.add(empleado);
		}
		return aux;
	}

}
