package src;

import java.util.Scanner;

public class AEA_Actividad2_3 {

	public static void main(String[] args) {
	
		Scanner leer = new Scanner(System.in);
	/*
	 * Defino las variables y pido que ingresen el nombre para comenzar
	 */
		double salario =0;
		String nombre = "";
		char genero=0;
		int contador =0;
		double acumulador=0;
				
		System.out.println("ingresa tu nombre para comenzar");
			
		/*
		 * Establezco las condiciones para leer hasta que se ingrese la palabra fin
		 * generando el bucle
		 */
		
		while (nombre != null) {
		nombre = leer.nextLine();
		contador++;
		
		if (nombre.equals("FIN") || nombre.equals("fin")) {
		System.out.println("programa finaizado");
		System.out.println("la cantidad de nombres tecleados es : "+ (contador-1));
		System.out.println("la suma de los salarios es : " +acumulador);
		System.out.println("El promedio de salarios ingresados es : " +(acumulador/(contador-1)));
		break;
		}
		
		else if (!nombre.equals("FIN") && !nombre.equals("fin")) {
		System.out.println("teclea tu salario : ");
		salario = leer. nextDouble(); 
		acumulador += salario;
		System.out.println("ingresa letra para designar tu sexo");
		genero = leer.next().charAt(0);
		
		System.out.println("tu nombre es : " +nombre.toUpperCase());
		System.out.println("tu salario es : " +sueldoPersona(salario));
		System.out.println("eres : " +sexoPersona(genero));
		
		System.out.println("ingresa tu nombre para comenzar");
		nombre = leer.nextLine();}
		}
		}
		
	
	/*
	 * Creo el mètodo para que devuelva salario bajo, medio, alto
	 */
	
	public static String sueldoPersona(double salario) {
		if (salario < 25000) {
		return "Bajo";}
		else if (salario >= 25000 && salario < 40000) { 
		return "Medio";}
		else {
			return "Alto";}
	}
	
	/*
	 * Creo el método para que devuelva el género según h, H, m,M
	 */
public static String sexoPersona(char sexo) {
		if (sexo=='M' || sexo=='m') {
	return "Mujer"; }
		else if (sexo=='H' || sexo=='h') {
	return "Hombre";}
	else {
		return "Sexo erroneo";}
	}
	 
	 }
	 

	 

	
	
	
	
	
		
		
	
	


	
			

