package src;

import java.util.Scanner;

public class AEA_Actividad1_1 {

	public static void main(String[] args) {
		/*
		 * Pido que tecleen tres numeros por consola y los leo
		 */
	int x=0, y=0, z=0;
	System.out.println("teclea tes numeros enteros");
	Scanner leer = new Scanner(System.in);
	x = leer.nextInt();
	y = leer.nextInt();
	z = leer.nextInt();
	
	/*
	 * Condiciones para que sea triangulo y clasificacion segun sus lados
	 */
	
	if((x+y)>z && (y+z)>x && (x+z)>y) 
	System.out.println("es un triángulo valido");
	
		else
		System.out.println("es un triangulo invalido");
	
	
		if(x==y && y==z)
	System.out.println("es un triangulo equilatero");	
else
	if(x==y || x==z||(y==z))
	System.out.println("es un triangulo isosceles");
else
		if(x!=y && x!=z && (y!=z))
		System.out.println("es un triángulo escaleno");
	
	
	
	
	}

}
