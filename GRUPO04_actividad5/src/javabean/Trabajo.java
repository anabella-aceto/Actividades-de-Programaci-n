package javabean;

import java.util.Objects;

public class Trabajo {

	// Atributos de instancia:

	private String idTrabajo;
	private String descripci�n;
	private double minSalario;
	private double maxSalario;

	// Constructor por defecto (sin par�metros):

	public Trabajo() {
		super();
	}

	// Constructor con todos los par�metros:

	public Trabajo(String idTrabajo, String descripci�n, double minSalario, double maxSalario) {
		super();
		this.idTrabajo = idTrabajo;
		this.descripci�n = descripci�n;
		this.minSalario = minSalario;
		this.maxSalario = maxSalario;
	}

	/*
	 * M�todos Getter & Setter:
	 */

	public String getIdTrabajo() {
		return idTrabajo;
	}

	public void setIdTrabajo(String idTrabajo) {
		this.idTrabajo = idTrabajo;
	}

	public String getDescripci�n() {
		return descripci�n;
	}

	public void setDescripci�n(String descripci�n) {
		this.descripci�n = descripci�n;
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
	 * M�todo toString de Object:
	 */

	@Override
	public String toString() {
		return "Trabajo [idTrabajo=" + idTrabajo + ", descripci�n=" + descripci�n + ", minSalario=" + minSalario
				+ ", maxSalario=" + maxSalario + "]";
	}

	/*
	 * M�todos hashCode y equals de Object (dos trabajos son iguales y su idTrabajo
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
