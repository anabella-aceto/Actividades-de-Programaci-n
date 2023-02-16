package javabean;

import java.util.Objects;

public class Trabajo {

	// Atributos de instancia:

	private String idTrabajo;
	private String descripción;
	private double minSalario;
	private double maxSalario;

	// Constructor por defecto (sin parámetros):

	public Trabajo() {
		super();
	}

	// Constructor con todos los parámetros:

	public Trabajo(String idTrabajo, String descripción, double minSalario, double maxSalario) {
		super();
		this.idTrabajo = idTrabajo;
		this.descripción = descripción;
		this.minSalario = minSalario;
		this.maxSalario = maxSalario;
	}

	/*
	 * Métodos Getter & Setter:
	 */

	public String getIdTrabajo() {
		return idTrabajo;
	}

	public void setIdTrabajo(String idTrabajo) {
		this.idTrabajo = idTrabajo;
	}

	public String getDescripción() {
		return descripción;
	}

	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}

	public double getMinSalario() {
		return minSalario;
	}

	public void setMinSalario(double minSalario) {
		this.minSalario = minSalario;
	}

	public double getMaxSalario() {
		return maxSalario;
	}

	public void setMaxSalario(double maxSalario) {
		this.maxSalario = maxSalario;
	}

	/*
	 * Método toString de Object:
	 */

	@Override
	public String toString() {
		return "Trabajo [idTrabajo=" + idTrabajo + ", descripción=" + descripción + ", minSalario=" + minSalario
				+ ", maxSalario=" + maxSalario + "]";
	}

	/*
	 * Métodos hashCode y equals de Object (dos trabajos son iguales y su idTrabajo
	 * es el mismo):
	 */

	@Override
	public int hashCode() {
		return Objects.hash(idTrabajo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Trabajo))
			return false;
		Trabajo other = (Trabajo) obj;
		return Objects.equals(idTrabajo, other.idTrabajo);
	}

}
