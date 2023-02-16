package testing;

import java.util.ArrayList;
import java.util.List;

import modelo.javabean.Administrativo;
import modelo.javabean.Alumno;
import modelo.javabean.Persona;
import modelo.javabean.Profesor;

public class Principal {

	public static void main(String[] args) {
		
	//Instancio los objetos profesor, alumno y administrativo
	Profesor p1 = new Profesor();
	p1.setNif("A23465190");
	p1.setNombre("Sara Palacios Mou");
	p1.setDireccion("Descalzos 3, piso 3");
	p1.setTelefono("665432008");
	p1.setTipoPersona("profesor");
		
	Alumno a1 = new Alumno();
	a1.setNif("B7603407");
	a1.setNombre("Martín Lust Han");
	a1.setDireccion("Vidal y Barraquer 11, piso 7");
	a1.setTelefono("625432911");
	a1.setTipoPersona("alumno");
		
	Administrativo ad1 = new Administrativo();
	ad1.setNif("B20451912");
	ad1.setNombre("Manuel Vilas Pérez");
	ad1.setDireccion("Francesc Maciá 15, piso 8, Dpto 6");
	ad1.setTelefono("977432008");
	ad1.setTipoPersona("administrativo");
	
	// Imprimo los datos de cada persona
	System.out.println(p1);
	System.out.println();
	System.out.println(a1);
	System.out.println();
	System.out.println(ad1);
	System.out.println();
	
	
	//Pruebo el método trabajar
	List<Persona> persona = new ArrayList();
	persona.add(p1);
	persona.add(ad1);
	persona.add(a1);
	
	for (Persona ele : persona) {
	System.out.println(ele.trabajar());
	System.out.println();
	}

	//Pruebo el método llamar
	System.out.println(a1.llamarPersona(p1));
	System.out.println();
	
	for (Persona ele : persona) {
	System.out.println((Administrativo)ele.buscarPersona("administrativo"));
	}
	}
	

}
