package modelo.javabean;

public class Alumno extends Persona{

	//Atributo privado
	String curso;
	
	//M�todos constructores
	
	

	public Alumno() {
		super();
	}

	public Alumno(String nif, String nombre, String direccion, String telefono, String tipoPersona, String curso) {
		super(nif, nombre, direccion, telefono, tipoPersona);
		this.curso = curso;
	}


	//M�todos getter and setter
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}


	// Sobreescribimos los m�todos de la clase Persona
	@Override
	public String trabajar() {
		
		return ("El alumno " +this.getNombre() + " va a estudiar para el curso 1� de "
		+ "Bachillerato");
	}
	
	//Sobreescribo el m�todo abstracto llamar()
	
	@Override
	public String llamarPersona(Persona p) {
		
		return (this.getNombre() + " est� llamando a " +p.getNombre());
	}
	//M�todo propio de la clase
	public String hacerExamen() {
	return ("El alumno " +this.getNombre() + " va a hacer su examen");
	}
	
	//Sobreescribo el m�todo toString
	@Override
	public String toString() {
		return "Alumno [getNif()=" + getNif() + ", getNombre()=" + getNombre() + ", getDireccion()=" + getDireccion()
				+ ", getTelefono()=" + getTelefono() + ", toString()=" + super.toString() + ", hashCode()=" + hashCode()
				+ ", getClass()=" + getClass() + ", curso=" + curso + "]";
	}
	
	
	}

	


