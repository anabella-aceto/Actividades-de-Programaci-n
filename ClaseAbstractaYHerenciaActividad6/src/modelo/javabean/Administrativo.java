package modelo.javabean;

public class Administrativo extends Persona{
	
	//Atributos de la clase
	String tareas;
	
	//Métodos constructores
	public Administrativo() {
		super();
	}
	
	public Administrativo(String nif, String nombre, String direccion, String telefono, String tipoPersona,
			String tareas) {
		super(nif, nombre, direccion, telefono, tipoPersona);
		this.tareas = tareas;
	}


	//Sobreescribo el método trabajar()
	@Override
	public String trabajar() {
		
		return ("El administrativo " +this.getNombre() + " va a realizar estas tareas: "
				+ "hacer matrículas, controlar asistencia");
	}

	//Sobreescribo el método llamar()
	
	@Override
	public String llamarPersona(Persona p) {
		
		return (this.getNombre() + " está llamando a " +p.getNombre());
	}
	//Método propio de la clase
		
	public String gestionarMatrícula(){
		return ("El administrativo " +this.getNombre() + " va a gestionar una matrícula");
	}
	
	//Sobreescribo toString
	@Override
	public String toString() {
		return "Administrativo [getNif()=" + getNif() + ", getNombre()=" + getNombre() + ", getDireccion()="
				+ getDireccion() + ", getTelefono()=" + getTelefono() + ", toString()=" + super.toString()
				+ ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", tareas=" + tareas + "]";
	}
		
	}

	
	
	


