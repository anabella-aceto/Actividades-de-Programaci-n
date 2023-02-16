package src;

import java.util.Scanner;

public class AEA_Actividad3_1 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		int opcion=0;
		
		
//Creo el Menú de opciones
		while (opcion>0 || opcion<5) {
			System.out.println("MENU DE OPCIONES");
			System.out.println("1.- Conversor decimal-binario");
			System.out.println("2.- Calculadora");
			System.out.println("3.- Analizador de frase");
			System.out.println("4.- Salir");
			
			System.out.println("Introduce una opción");	
			opcion = leer.nextInt();
			
			if (opcion==4) {
				System.out.println("Adiós");
				break;
		}
		
//Construyo el switch para que se ejecute la opción seleccionada
		switch (opcion) {
		
		case 1:
			System.out.println("Ingresa un número entero");
			int numeroEntero = leer.nextInt();
						
			System.out.println("El número  " +numeroEntero +" en binario es " +numeroBinario(numeroEntero));
			break;
			
		case 2:
			double x = 0, y = 0;
			char operacion=0;
			
			System.out.println("introduce el primer número");
			x = leer.nextDouble();
			System.out.println("introduce el segundo número");
			y = leer.nextDouble();
			System.out.println("introduce un operador (+, -, *, /, %)");
			operacion = leer.next().charAt(0);
			
			
			if (operacion == '+') {
				System.out.println(+x + " + " + y +" = " +String.format("%.2f", calculadoraSuma(x,y)));
				}		
			
			else if (operacion == '-') {
				System.out.println(+x + " - " + y +" = " +String.format("%.2f", calculadoraResta(x,y)));
				}	
			else if (operacion == '*') {
				System.out.println(+x + " * " + y +" = " +String.format("%.2f", calculadoraMultiplicacion(x,y)));
				}	
			else if (operacion == '/') {
				System.out.println(+x + " / " + y +" = " +String.format("%.2f", calculadoraDivision(x,y)));
			}
			else if (operacion == '%') {
				System.out.println(+x + " % " + y +" = " +calculadoraResto(x,y));
			}
			break;
		
		case 3:
			System.out.println("Introduce una palabra");
			String palabra = leer.next();
			palabra = palabra.toLowerCase();
			System.out.println("PALABRA: " +palabra);
			System.out.println("CONSONANTES: " +palabra.replaceAll("[aeiou]", ""));
			System.out.println("VOCALES: " +palabra.replaceAll("[bcdfghjklmnpqrstvwwxyz]", ""));
			System.out.println( "LONGITUD: "  +palabra.length());
			
			break;
		
		default: 
			System.out.println("Introduce un número entre 1 y 4");
		}
		
		}
	}
	
//Creo el método "conversor" decimal-binario

	public static String numeroBinario(int numeroEntero) {
		String binario = "";
		String residuo= "";
		
		while (numeroEntero >0) {
			if (numeroEntero%2 == 0) {
			residuo = residuo + '0';
			}
			else {
			residuo = residuo + '1';			
			}
			numeroEntero /=2;
		}
		for (int i =  residuo.length()-1; i >=0; i--) {
			binario = binario + residuo.charAt(i);
		}
		
		return binario;
		}
	
//Creo los mètodos para la calculadora
	public static double calculadoraSuma (double x, double y) {
		double suma = x+y;
		return suma;
		}
	
	public static double calculadoraResta (double x, double y) {
		double resta = x-y;
		return resta;
		}
		
	public static double calculadoraMultiplicacion (double x, double y) {
		double multiplicacion = x*y;	
		return multiplicacion;
		
		}
			
	public static double calculadoraDivision (double x, double y) {
		double division = x/y;		
		return division;
		}
		
	public static int calculadoraResto (double x, double y) {
		int resto = (int) ((int) x%y);		
		return resto;
		}
	}

