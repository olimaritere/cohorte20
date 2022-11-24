package colecciones;

import java.util.Arrays;

public class Arreglos {

	public static void main(String[] args) {
		// Arrays - Arreglos - Matrices
		//Solo permiten un tipo de dato
		//Se tiene que especificar su tamaño
		
		/*
		 * String
		 * int
		 * double
		 * long
		 */
		
		String[] miArreglo = new String[5];
		
		miArreglo[0] = "Olivia";
		miArreglo[1] = "Maria";
		miArreglo[2] = "Teresa";
		miArreglo[3] = "Sia";
		miArreglo[4] = "Liz";
		
		System.out.println(miArreglo[0]);
		
		for(int i=0; i<miArreglo.length; i++) {
			System.out.println("Ciclo for: " +miArreglo[i]);
		}
		
		System.out.println("------------------------------------------------------");
		
		//forEach
		for(String nombre : miArreglo)   {
			System.out.println("For Each: " + nombre);
			
		}
		
		//Math.pow(2, 2);
		//Arrays
		
		System.out.println(Arrays.toString(miArreglo));
		
		//Tipos de valores
		
		int numeros [] = new int[5];
		
		numeros[0] = 3;
		numeros[1] = -56;
		numeros[2] = (int) 3.45; //Casteo= cambiar el valor
		numeros[3] = Integer.parseInt("2");//parseo - cambiar la clase del valor
		
		for(int numero : numeros) {
			System.out.println("Valores del arreglo números: " + numero);
		}
		
		//Arreglos de objetos
		Persona persona1 = new Persona("Pancho", 30);
		Persona persona2 = new Persona("Patty", 58);
		
		//
		Persona [] arrPersonas = new Persona[3];
		arrPersonas[0] = persona1;
		arrPersonas[1] = persona2;
		arrPersonas[2] = new Persona("Luis", 18);
		
		System.out.println(arrPersonas[0].nombre);
		System.out.println(arrPersonas[1].nombre);
		System.out.println(arrPersonas[2].nombre);
		
		for(Persona persona : arrPersonas) {
			System.out.println("nombre: " + persona.nombre + ". " + "Edad: " + persona.edad);
		}
		
		//Arreglos literales
		String [] arrString = {"Manzana", "Pera", "12", "Hola"};
		System.out.println(Arrays.toString(arrString));
		
		
		
		}
	
	

}
