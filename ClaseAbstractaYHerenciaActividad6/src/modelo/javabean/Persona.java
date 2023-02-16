package modelo.javabean;

import java.util.Objects;

import modelo.dao.Instituto;

public abstract class Persona extends Instituto {
	
	//Atributos privados
	
	private String nif;
	private String nombre;
	private String direccion;
	private String telefono;
	private String tipoPersona;
	
	//Métodos constructores	
	
	public Persona(String nif, String nombre, String direccion, String telefono, 
		String tipoPersona) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.tipoPersona = tipoPersona;
	}

	public Persona() {
		super();
	}

	//Getters and setters
	
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
		
	public String getTipoPersona() {
		return tipoPersona;
	}

	public void setTipoPersona(String tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

	//Redefinición de método toString
	@Override
	public String toString() {
		return "Persona [nif=" + nif + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono
				+ ", tipoPersona=" + tipoPersona + "]";
	}
		
	//MÃ©todos propios de la clase abstracta
	
	public String llamarPersona(Persona p) {
		
	return (this.getNombre() + " estÃ¡ llamando a " +p);
	}
	
	public abstract String trabajar();
	
			 
	@Override
	public int hashCode() {
		return Objects.hash(nif);
	}
	
	//MÃ©todo hash code y equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(nif, other.nif);
	}
		
	 
		
	}
	
	
	
	
	


