package modelo.dao;

import java.util.ArrayList;
import java.util.List;

import modelo.javabean.Administrativo;
import modelo.javabean.Alumno;
import modelo.javabean.Persona;
import modelo.javabean.Profesor;

public class Instituto implements InstitutoDao {
	private ArrayList<Persona> personas;

	// Constructor

	public Instituto() {
		super();
		personas = new ArrayList<>();
		cargarDatos();
	}

	// Método para llenar el array de personas

	private void cargarDatos() {

		Profesor p= new Profesor("74532195R", "Roberto Martínez", "C/ Dorado, 36", "616669922", "Matemáticas y lengua"));
		personas.add(new Alumno("44526987X", "Andrea Gonzalez", "Avenida de las Americas, 23", "624128953",
				"1º Bachillerato"));
		personas.add(new Administrativo("85412396U", "Rodrigo Jiménez", "Plaza de la Hispanidad, 6", "639689999",
				"Hacer matrículas, controlar asistencia"));
	}

	// tengo que redefinir

	@Override
	public boolean altaPersona(Persona persona) {
		if (personas.contains(persona))
			return false;
		else
			return personas.add(persona);
	}

	@Override
	public Persona buscarPersona(String nif) {
		ArrayList<Persona> aux = new ArrayList<>(); // utilizo un array porque no puedo crear una persona al ser clase
													// abstracta
		for (Persona ele : personas) {
			if (ele.getNif().equals(nif))
				aux.add(ele);
		}
		return null;
	}

	@Override
	public List<Persona> buscarTodas() {
		return personas;
	}

	@Override
	public boolean eliminarPersona(Persona persona) {
		return personas.remove(persona);
	}

	@Override
	public List<Persona> buscarPersonasPorTipo(String tipoPersona) {
		ArrayList<Persona> aux = new ArrayList<>();
		for (Persona ele : personas) {
			if (ele instanceof Profesor && ele.getClass().equals(tipoPersona))
				aux.add(ele);
			else if (ele instanceof Administrativo && ele.getClass().equals(tipoPersona))
				aux.add(ele);
			else if (ele instanceof Alumno && ele.getClass().equals(tipoPersona))
				aux.add(ele);
		}
		return aux;
	}

	@Override
	public List<Persona> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean EliminarPersona(Persona persona) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Persona> buscarPersonaPorTipo(String tipoPersona) {
		// TODO Auto-generated method stub
		return null;
	}
}