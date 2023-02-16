package modelo.javabean;

public class Administrativo extends Persona{
	
	//Atributos de la clase
	String tareas;
	
	//M�todos constructores
	public Administrativo() {
		super();
	}
	
	public Administrativo(String nif, String nombre, String direccion, String telefono, String tipoPersona,
			String tareas) {
		super(nif, nombre, direccion, telefono, tipoPersona);
		this.tareas = tareas;
	}


	//Sobreescribo el m�todo trabajar()
	@Override
	public String trabajar() {
		
		return ("El administrativo " +this.getNombre() + " va a realizar estas tareas: "
				+ "hacer matr�culas, controlar asistencia");
	}

	//Sobreescribo el m�todo llamar()
	
	@Override
	public String llamarPersona(Persona p) {
		
		return (this.getNombre() + " est� llamando a " +p.getNombre());
	}
	//M�todo propio de la clase
		
	public String gestionarMatr�cula(){
		return ("El administrativo " +this.getNombre() + " va a gestionar una matr�cula");
	}
	
	//Sobreescribo toString
	@Override
	public String toString() {
		return "Administrativo [getNif()=" + getNif() + ", getNombre()=" + getNombre() + ", getDireccion()="
				+ getDireccion() + ", getTelefono()=" + getTelefono() + ", toString()=" + super.toString()
				+ ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", tareas=" + tareas + "]";
	}
		
	}

	
	
	


