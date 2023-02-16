package modelo.dao;

import java.util.ArrayList;

import javabean.Empleado;

public interface EmpresaDao {

	boolean alta(Empleado empleado); // C

	boolean eliminarUno(Empleado empleado); // D

	boolean modificarUno(Empleado empleado); // U

	ArrayList<Empleado> buscarPorSexo(char genero); // R

	Empleado buscarUno(int idEmpleado); // R

	ArrayList<Empleado> buscarTodos(); // R

	double masaSalarial(); // Método propio

	ArrayList<Empleado> buscarPorDepartamento(int idDepartamento); // R

	ArrayList<Empleado> buscarPorTrabajo(String idTrabajo); // R

	ArrayList<Empleado> buscarPorPais(String pais); // R

}
