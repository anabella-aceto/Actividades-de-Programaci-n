package modelo.javabean;

public class Alumno extends Persona{

	//Atributo privado
	String curso;
	
	//Métodos constructores
	
	

	public Alumno() {
		super();
	}

	public Alumno(String nif, String nombre, String direccion, String telefono, String tipoPersona, String curso) {
		super(nif, nombre, direccion, telefono, tipoPersona);
		this.curso = curso;
	}


	//Métodos getter and setter
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}


	// Sobreescribimos los métodos de la clase Persona
	@Override
	public String trabajar() {
		
		return ("El alumno " +this.getNombre() + " va a estudiar para el curso 1º de "
		+ "Bachillerato");
	}
	
	//Sobreescribo el método abstracto llamar()
	
	@Override
	public String llamarPersona(Persona p) {
		
		return (this.getNombre() + " está llamando a " +p.getNombre());
	}
	//Método propio de la clase
	public String hacerExamen() {
	return ("El alumno " +this.getNombre() + " va a hacer su examen");
	}
	
	//Sobreescribo el método toString
	@Override
	public String toString() {
		return "Alumno [getNif()=" + getNif() + ", getNombre()=" + getNombre() + ", getDireccion()=" + getDireccion()
				+ ", getTelefono()=" + getTelefono() + ", toString()=" + super.toString() + ", hashCode()=" + hashCode()
				+ ", getClass()=" + getClass() + ", curso=" + curso + "]";
	}
	
	
	}

	


