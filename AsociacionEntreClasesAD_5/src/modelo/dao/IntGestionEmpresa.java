package modelo.dao;

import java.util.ArrayList;

import javabean.Empleado;

public interface IntGestionEmpresa {
	
	boolean altaEmpleado(Empleado empleado);
	boolean eliminarUno (Empleado empleado);
	boolean modificarUno (Empleado empleado);
	ArrayList<Empleado> buscarPorSexo(char genero);
	Empleado buscarUno(int idEmpleado);
	ArrayList<Empleado> buscarTodos();
	double masaSalarial();
	ArrayList<Empleado> buscarPorDepartamento(int idDepartamento);
	ArrayList<Empleado> buscarTrabajo(String idTrabajo);
	ArrayList<Empleado> buscarPorPais(String pais);
	
}
