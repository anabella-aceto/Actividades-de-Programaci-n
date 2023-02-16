package src;

import java.util.Scanner;

public class AEA_Actividad2_2 {

	public static void main(String[] args) {
		/*
		 * Defino la variable y pido a la persona que teclee un numero
		 */
		int x =0, contador=0;
		
		System.out.println("teclea un numero entero entre el 1 y el 40");

/*
 * Leo el numero por consola
 */
		Scanner leer = new Scanner(System.in);
		x = leer.nextInt();

/*
 * El numero a adivinar es el 27. Genero el bucle y las condiciones para que así sea
 */
		
		while(x!=27) {
			if(x>0 && x<27)
				System.out.println("teclea un numero mayor");
		
			
				if(x>27 && x<41)
				System.out.println("teclea un numero menor");
			contador++;
		/*
		 * Pido que teclee otro numero y vuelvo a leer
		 */
				x = leer.nextInt();
				
	}	
	System.out.println("¡Has acertado el número! : ");
	System.out.println("cantidad de intentos : " +contador);
	}

}
