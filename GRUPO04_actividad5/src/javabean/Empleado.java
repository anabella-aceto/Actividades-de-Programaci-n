package javabean;

import java.util.Objects;

public class Empleado {

	// Atributos de instancia:

	private int idEmpleado;
	private String nombre;
	private String apellidos;
	private char genero;
	private String email;
	private double salario;
	private double comision;
	private Trabajo trabajo;
	private Departamento departamento;

	// Constructor por defecto (sin parámetros):

	public Empleado() {
		super();
	}

	// Constructor con todos los parámetros:

	public Empleado(int idEmpleado, String nombre, String apellidos, char genero, String email, double salario,
			double comision, Trabajo trabajo, Departamento departamento) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.genero = genero;
		this.email = email;
		this.salario = salario;
		this.comision = comision;
		this.trabajo = trabajo;
		this.departamento = departamento;
	}

	/*
	 * Métodos Getter & Setter:
	 */

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	public Trabajo getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(Trabajo trabajo) {
		this.trabajo = trabajo;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	/*
	 * Método toString de Object:
	 */

	/*
	 * Métodos hashCode y equals de Object (dos empleados son iguales y su
	 * idEmpleado es el mismo):
	 */

	@Override
	public int hashCode() {
		return Objects.hash(idEmpleado);
	}

	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellidos=" + apellidos + ", genero="
				+ genero + ", email=" + email + ", salario=" + salario + ", comision=" + comision + ", trabajo="
				+ trabajo + ", departamento=" + departamento + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Empleado))
			return false;
		Empleado other = (Empleado) obj;
		return idEmpleado == other.idEmpleado;
	}

	// Métodos propios:

	public double salarioBruto() {
		double salarioBruto = salario + comision;
		return salarioBruto;
	}

	public String salarioMensual(int meses) { // meses es el número de pagas por añoo
		double salarioMensual = (salario + comision) / meses;
		return "Salario Bruto Mensual con " + meses + " pagas " + salarioMensual + " / mes";
	}

	public String literalSexo() {
		if (genero == 'H')
			return "Sexo : Hombre";
		else if (genero == 'M')
			return "Sexo : Mujer";
		else
			return "Sexo erróneo";
	}

	public String obtenerEmail() {
		int espacio = apellidos.indexOf(" "); // para averiguar en qué posición está el espacio entre los apellidos
		String obtenerEmail = (nombre.charAt(0) + apellidos.substring(0, espacio)).toLowerCase() + "@nombreEmpresa.com";
		return obtenerEmail;
	}

	public String nombreCompleto() {
		String nombreCompleto = nombre + " " + apellidos;
		return nombreCompleto;
	}

}
