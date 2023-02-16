package javabean;

import java.util.Objects;

public class Localidad {

	// Atributos de instancia:

	private int idLocalidad;
	private String direccion;
	private String ciudad;
	private String pais;

	// Constructor por defecto (sin par�metros):

	public Localidad() {
		super();
	}

	// Constructor con todos los par�metros:

	public Localidad(int idLocalidad, String direccion, String ciudad, String pais) {
		super();
		this.idLocalidad = idLocalidad;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.pais = pais;
	}

	/*
	 * M�todos Getter & Setter:
	 */

	public int getIdLocalidad() {
		return idLocalidad;
	}

	public void setIdLocalidad(int idLocalidad) {
		this.idLocalidad = idLocalidad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	/*
	 * M�todo toString de Object:
	 */

	@Override
	public String toString() {
		return "Localidad [idLocalidad=" + idLocalidad + ", direccion=" + direccion + ", ciudad=" + ciudad + ", pais="
				+ pais + "]";
	}

	/*
	 * M�todos hashCode y equals de Object (dos localidades son iguales y su
	 * idLocalidad es la misma):
	 */

	@Override
	public int hashCode() {
		return Objects.hash(idLocalidad);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Localidad))
			return false;
		Localidad other = (Localidad) obj;
		return idLocalidad == other.idLocalidad;
	}

}
