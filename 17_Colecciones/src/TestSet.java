import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {
		Set<String> lista1, lista2, lista3;
		
		lista1 = new HashSet<>();
		
		lista1.add("Tomás");
		lista1.add("Carmen");
		lista1.add("Eva");
		lista1.add("Sara");
		lista1.add("Felix");
		lista1.add("Tomás");
		
		for (String nombre : lista1) {
			
			System.out.println(nombre);
		}
		
		//En este caso la lista se imprime tomáas una sola vez porque no admite repetidos
		//Como no ordena, por el hash, la lista aparece en orden aleatorio
	}

}
