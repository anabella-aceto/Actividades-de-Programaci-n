package modelo.javabean;

public class Profesor extends Persona{
	//Atributo
	String competencias;

	//Métodos constructores
	public Profesor() {
		super();
	}
	
	public Profesor(String nif, String nombre, String direccion, String telefono, String tipoPersona,
			String competencias) {
		super(nif, nombre, direccion, telefono, tipoPersona);
		this.competencias = competencias;
	}

	//Sobreescritura método toString
	@Override
	public String toString() {
		return "Profesor [getNif()=" + getNif() + ", getNombre()=" + getNombre() + ", getDireccion()=" + getDireccion()
				+ ", getTelefono()=" + getTelefono() + ", toString()=" + super.toString() + ", hashCode()=" + hashCode()
				+ ", getClass()=" + getClass() + ", competencias=" + competencias + "]";
	}

	@Override
	public String trabajar() {
	
		return ("El profesor " +this.getNombre() +" va a impartir su clase");
	}

	
}
