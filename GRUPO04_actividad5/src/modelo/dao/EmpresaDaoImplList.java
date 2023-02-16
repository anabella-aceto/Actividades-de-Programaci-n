package modelo.dao;

import java.util.ArrayList;

import javabean.Departamento;
import javabean.Empleado;
import javabean.Localidad;
import javabean.Trabajo;

public class EmpresaDaoImplList implements EmpresaDao { // Implemento los m�todos del interface, los tengo que redefinir

	private String nombre;
	private ArrayList<Empleado> listaEmpleados;

	// Constructor
	public EmpresaDaoImplList(String nombre) {
		this.nombre = nombre;
		listaEmpleados = new ArrayList<>();
		cargarDatos();
	}

	// M�todo para llenar el array de empleados

	private void cargarDatos() {

		Trabajo trab1 = new Trabajo("21", "Administrativo", 1600.0, 2000.0);
		Trabajo trab2 = new Trabajo("14", "Contable", 1300.0, 1800.0);
		Trabajo trab3 = new Trabajo("6", "Abogado", 2000.0, 2400.0);
		Trabajo trab4 = new Trabajo("19", "Analista", 1600.0, 1900.0);
		Trabajo trab5 = new Trabajo("4", "Ingeniero", 1800.0, 2400.0);

		Localidad loc1 = new Localidad(5, "740 5th Avenue", "New York", "EE.UU");
		Localidad loc2 = new Localidad(5, "Calle Preciados, 5", "Madrid", "Espa�a");
		Localidad loc3 = new Localidad(5, "32 Rue du Commandant Guilbaud", "Par�s", "Francia");
		Localidad loc4 = new Localidad(5, "Great Russell Street", "Londres", "Reino Unido");
		Localidad loc5 = new Localidad(5, "Werner-Heisenberg-Allee. 34", "M�nich", "Alemania");

		Departamento dep1 = new Departamento(11, "Administraci�n", loc1);
		Departamento dep2 = new Departamento(12, "Contabilidad", loc2);
		Departamento dep3 = new Departamento(13, "Laboral", loc3);
		Departamento dep4 = new Departamento(14, "Estad�stica", loc4);
		Departamento dep5 = new Departamento(15, "Ingenier�a", loc5);

		listaEmpleados.add(new Empleado(1, "Roberto", "Martinez Rodriguez", 'H', "rmartinez@gmail.com", 1850.0, 250.0,
				trab1, dep1));
		listaEmpleados.add(
				new Empleado(2, "Ana", "Fernandez Conde", 'M', "afernandez@hotmail.com", 1500.0, 150.0, trab2, dep2));
		listaEmpleados.add(
				new Empleado(3, "Claudia", "Ruiz de Haro", 'M', "claudia_ruiz@yahoo.es", 2200.0, 220.0, trab3, dep3));
		listaEmpleados.add(new Empleado(4, "Fernando", "Ladr�n de Guevara", 'H', "fernando_la_gue@telefonica.net",
				1760.0, 200.0, trab4, dep4));
		listaEmpleados.add(new Empleado(5, "Emilio", "Valverde Casares", 'H', "emiliovalverdec@gmail.com", 2000.0,
				300.0, trab5, dep5));
	}

	// M�todos getter and setter:

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Redefino los m�todos del interface EmpresaDao

	/*
	 * M�todo para dar de alta un empleado: Recibe un empleado por par�metro y a
	 * trav�s del m�todo contains() comprueba si est� incluido en el array
	 * listaEmpleados. Si esta incluido el empleado en listaEmpleados devuelve false
	 * y si no est� incluido utiliza el m�todo add() para incluir el empleado en el
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
	 * M�todo para eliminar un empleado: Recibe un empleado para par�metro y
	 * mediante el m�todo remove() lo elimina del array listaEmpleados. Si el
	 * empleado a eliminar no estuviera en el array listaEmpleados devuelve false.
	 */

	@Override
	public boolean eliminarUno(Empleado empleado) {
		return listaEmpleados.remove(empleado);
	}

	/*
	 * M�todo para modificar un empleado: Recibe un empleado por par�metro y
	 * mediante el m�todo indexOf() calcula la posici�n que ocupa en el array
	 * listaEmpleados. Si el empleado no tiene el mismo idEmpleado que el que se
	 * quiere sustituir, la posici�n ser�a -1 y devuelve false. Dos empleados son
	 * diferentes si tienen distinto idEmpleado lo definimos en los m�todos hasCode
	 * y Equals de la clase Empleado. Si existe el empleado en el array, mediante el
	 * m�todo set(), el empleado que entra como par�metro sustituye al que tiene el
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
	 * M�todo para buscar empleados por sexo: Recibe como par�metro el sexo que se
	 * quiere buscar en el array listaEmpleados. Se crea un array auxiliar en el que
	 * se van a a�adir las coincidencias encontradas de g�neno mediante el m�todo
	 * getGenero(). Finalmente, mediante el m�todo add(), se a�aden al array
	 * auxiliar las coincidencias de g�nero encontradas y las devuelve como true. Si
	 * no encuentra coincidencias devuelve el array auxiliar vac�o.
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
	 * M�todo para buscar un empleado: Este m�todo crea un empleado vac�o.
	 * Poster�ormente se le asigna el idEmpleado que se ha recibido de par�metro de
	 * entrada. Despu�s mediante el m�todo indexOf() busca la posici�n que ocupa el
	 * idEmpleado en el array listaEmpleados. Si no la encuentra devuelve false y si
	 * la encuentra muestra ese empleado mediante el m�todo get().
	 */

	@Override
	public Empleado buscarUno(int idEmpleado) {
		Empleado emp = new Empleado(); // creamos un empleado vac�o
		emp.setIdEmpleado(idEmpleado);
		int posicion = listaEmpleados.indexOf(emp);
		if (posicion == -1)
			return null;
		else
			return listaEmpleados.get(posicion);
	}

	/*
	 * M�todo para mostrar todos los empleados: Devuelve los elementos que contiene
	 * el array listaEmpleados.
	 */

	@Override
	public ArrayList<Empleado> buscarTodos() {
		return listaEmpleados;
	}

	/*
	 * M�todo para calcular la masa salarial de todos los empleados: Mediane un
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
	 * M�todo para buscar empleados por Departamento: Primero se crea un array
	 * auxiliar vac�o. Despu�s, mediante un bucle for each se recorre el array
	 * listaEmpleados buscando los empleados que tienen el mismo idDepartamento que
	 * el que se recibe como par�metro de entrada. Los empleados que encuentra se
	 * a�aden al array auxiliar mediante el m�todo add() y devuelve el array
	 * auxiliar. Para comparar al ser int utiliza ==. Si no encuentra ning�n
	 * empleado con el mismo idDepartamento devuelve el array auxiliar vac�o.
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
	 * M�todo para buscar empleados por Trabajo: Primero se crea un array auxiliar
	 * vac�o. Despu�s, mediante un bucle for each se recorre el array listaEmpleados
	 * buscando los empleados que tienen el mismo idTrabajo que el que se recibe
	 * como par�metro de entrada. Los empleados que encuentra se a�aden al array
	 * auxiliar mediante el m�todo add() y devuelve el array auxiliar. Para comparar
	 * al ser String utiliza el m�todo equals() Si no encuentra ning�n empleado con
	 * el mismo idTrabajo devuelve el array auxiliar vac�o.
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
	 * M�todo para buscar empleados por Pais: Primero se crea un array auxiliar
	 * vac�o. Despu�s, mediante un bucle for each se recorre el array listaEmpleados
	 * buscando los empleados que tienen el mismo pais que el que se recibe como
	 * par�metro de entrada. Los empleados que encuentra se a�aden al array auxiliar
	 * mediante el m�todo add() y devuelve el array auxiliar. Para comparar al ser
	 * String utiliza el m�todo equalsIgnoreCase() para que no haga distinci�n de
	 * may�sculas y min�sculas cuando busque el pais. Si no encuentra ning�n
	 * empleado con el mismo pais devuelve el array auxiliar vac�o.
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
