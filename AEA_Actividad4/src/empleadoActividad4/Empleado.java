package empleadoActividad4;

import java.text.DecimalFormat;

public class Empleado {
	
	private int idEmpleado;
	private String nombre, apellidos, email;
	private double salario, complemento;
	private char sexo;
	private int idDepartamento;

	
//Mètodo constructor por defecto 
	public Empleado() {
	super();
	}
	
//Método constructor con todos los parámetros

public Empleado(int idEmpleado, String nombre, String apellidos, String email, double salario, double complemento,
		char sexo, int idDepartamento) {
	super();
	this.idEmpleado = idEmpleado;
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.email = email;
	this.salario = salario;
	this.complemento = complemento;
	this.sexo = sexo;
	this.idDepartamento = idDepartamento;
	}


	//Getter and setter
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

	public double getComplemento() {
		return complemento;
	}

	public void setComplemento(double complemento, double i) {
		this.complemento = complemento;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}
	
//Redefino toString
	@Override
	public String toString() {
	return "Empleado [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellidos=" + apellidos + ", email="
				+ email + ", salario=" + salario + ", complemento=" + complemento + ", sexo=" + sexo
				+ ", idDepartamento=" + idDepartamento + "]";
	}
	
//Método responsabilidad de la clase que que devuelve email

	public String emailEmpleado() {
	nombre = nombre.toLowerCase();
	char n = nombre.charAt(0);
	apellidos = apellidos.toLowerCase();
	apellidos = apellidos.trim();
	int apellido2= apellidos.lastIndexOf(" ");
	String apellido1 = apellidos.substring(0, apellido2);
	String email = n+apellido1+"@gmail.com";
	return email;
	}


//Mètodo responsabilidad de la clase que devuelve el salarioMensual

	public double salarioMensual () {
	double mensualidadEmpleado= salario/12;
	return mensualidadEmpleado;
	}

//Mètodo responsabilidad de la clase que devuelve el nombre completo

	public String nombreCompleto () {
	
	return nombre + " " +apellidos;
	}

//Mètodo que responsabilidad de la clase que devuelve el género 

	public String sexoPersona() {
	
	if (sexo == 'M')  
	return "Mujer"; 
	else 
	return "Hombre";
	}
	
//Método constructor que devuelve el salario bruto
	public double salarioBruto() {
	double salarioBrutoAnual = (salario/12)*14;
	return salarioBrutoAnual;
		
	}
}



