package modelo.dao;

import java.util.ArrayList;
import java.util.List;

import modelo.javabean.Persona;

public interface InstitutoDao {
	
	boolean altaPersona(Persona persona);
	Persona buscarPersona(String nif);
	List<Persona>buscarTodos();
	boolean EliminarPersona(Persona persona);
	List<Persona>buscarPersonaPorTipo(String tipoPersona);
	
	
	
	

}
