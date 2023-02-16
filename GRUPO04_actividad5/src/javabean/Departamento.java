package javabean;

import java.util.Objects;

public class Departamento {

	// Atributos de instancia:

	private int idDepar;
	private String descripcion;
	private Localidad localidad;

	// Constructor por defecto (sin parámetros):

	public Departamento() {
		super();
	}

	// Constructor con todos los parámetros:

	public Departamento(int idDepar, String descripcion, Localidad localidad) {
		super();
		this.idDepar = idDepar;
		this.descripcion = descripcion;
		this.localidad = localidad;
	}

	/*
	 * Métodos Getter & Setter:
	 */

	public int getIdDepar() {
		return idDepar;
	}

	public void setIdDepar(int idDepar) {
		this.idDepar = idDepar;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Localidad getLocalidad() {
		return localidad;
	}

	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}

	/*
	 * Método toString de Object:
	 */

	@Override
	public String toString() {
		return "Departamentos [idDepar=" + idDepar + ", descripcion=" + descripcion + ", localidad=" + localidad + "]";
	}

	/*
	 * Métodos hashCode y equals de Object (dos departamentos son iguales y su
	 * idDepar es la misma):
	 */

	@Override
	public int hashCode() {
		return Objects.hash(idDepar);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Departamento))
			return false;
		Departamento other = (Departamento) obj;
		return idDepar == other.idDepar;
	}

}
