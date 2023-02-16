package modelo.dao;

import java.util.ArrayList;

import javabean.Departamento;
import javabean.Empleado;
import javabean.Localidad;
import javabean.Trabajo;

public class EmpresaDaoImplList implements IntGestionEmpresa {

	//Atributos
	
	private String nombre;
	private ArrayList<Empleado> lista; 
	
	
	public EmpresaDaoImplList (String nombre) {
	this.nombre = nombre;
	lista = new ArrayList<>();
	cargarDatos();
	}
	
	//Agregamos algunos empleados
	
	private void cargarDatos() {
		
		Localidad loc1 = new Localidad(43003,"Descalzos 3", "Tarragona", "España" ); 
		Trabajo t1 = new Trabajo("1", "contador", 1900.0, 1600);
		Departamento d1 = new Departamento(1, "Finanzas", loc1);
		Trabajo t2 = new Trabajo("2", "programador", 2100.0, 1500);
		Departamento d2 = new Departamento(2, "IT", loc1);
		
		
		lista.add(new Empleado(1, "Juan", "García Re", 'H', "jgarciare@gmail.com", 1700, 250, t1, d1)); 
		lista.add(new Empleado(2, "Sara", "Pérez Vargas", 'M', "sperezvargas@gmail.com", 1800, 100, t2, d2));
		lista.add(new Empleado(3, "Marta", "Díaz Ohms", 'M', "mdiazohms@gmail.com", 1600, 100, t2, d2));
		}

	//Get and set de nombre

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
//Sobreescribimos los métodos abstractos de la Interface
	
	//Método para dar de alta un empleado
	@Override
	public boolean altaEmpleado(Empleado empleado) {
		if (lista.contains(empleado))
		return false;
		else
			return lista.add(empleado);
	}

	//Método para eliminar un empleado
	@Override
	public boolean eliminarUno(Empleado empleado) {
		return lista.remove(empleado);
	}

	//Método para modificarUno
	public boolean modificarUno(Empleado empleado) {
		int posicion = lista.indexOf(empleado);
		if (posicion == -1)
		return false;
		else 
		lista.set(posicion, empleado);
		return true;
	}
	
	//Método para buscar un empleado según su género
	@Override
	public ArrayList<Empleado> buscarPorSexo(char genero) {
		ArrayList<Empleado> aux = new ArrayList<>();
		for (Empleado empleado : lista) {
			if (empleado.getGenero() == genero)
				aux.add(empleado);
		}
		return aux;
		
	}
	
	//Método  buscar un empleado según su idEmpleado
	@Override
	public Empleado buscarUno(int idEmpleado) {
		Empleado emp = new Empleado();
		emp.setIdEmpleado(idEmpleado);
		int posicion = lista.indexOf(emp);
		
		if (posicion == -1)
			return null;
		else 
			return lista.get(posicion);
	}

	 //Obtener la lista completa de todos los empleados
	@Override
	public ArrayList<Empleado> buscarTodos() {
		return lista;
	}

	//Método para obtener la masa salarial
	@Override
	public double masaSalarial() {
		double masaSalarial = 0;
		for (Empleado empleado : lista) {
		masaSalarial = masaSalarial + empleado.salarioBruto();
		}
		return masaSalarial;
	}

	//Método  buscar el departamento de un empleado según su idDepartamento
	@Override
	public ArrayList<Empleado> buscarPorDepartamento(int idDepartamento) {
		
		ArrayList<Empleado> aux = new ArrayList();
		
		for (Empleado ele : lista) {
		if (ele.getDepartamento().getIdDepar() == idDepartamento)
			aux.add(ele);
		}
		return aux;
		}
	
	//Método  buscar el trabajo que realiza un empleado según su idTrabajo
	@Override
	
	public ArrayList<Empleado> buscarTrabajo(String idTrabajo) {
		ArrayList<Empleado> aux = new ArrayList();
		
		for (Empleado ele : lista) {
		if (ele.getTrabajo().getIdTrabajo().equals(idTrabajo))		
				aux.add(ele);
		}
		return aux;
		}
	
	//Método  buscar el país en el que se encuentra un departamento según su país
	@Override
	public ArrayList<Empleado> buscarPorPais(String pais) {
		ArrayList<Empleado> aux = new ArrayList();
		
		for (Empleado ele : lista) {
		if (ele.getDepartamento().getLocalidad().getPais().equalsIgnoreCase(pais)); 	
				aux.add(ele);
		}
		return aux;
	}
	
}
