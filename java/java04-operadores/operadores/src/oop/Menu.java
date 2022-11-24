package oop;

import java.util.Scanner;

public class Menu {
	Scanner s = new Scanner(System.in);
	int menuOp() {
	
		int numero;
		
		System.out.println("\t\t ----- Menu-----");
		System.out.println(" \t\t1: Suma");
		System.out.println(" \t\t2: Resta");
		System.out.println(" \t\t3: Multiplicacion");
		System.out.println(" \t\t4: Division");
		System.out.println(" \t\t5: Modulo");
		System.out.println(" \t\t6: Booleans");
		System.out.println(" \t7: Salir");
		
		System.out.println("Introduzca la opción ");
		return numero = s.nextInt();	}
	
	
	int submenuOp() {
		
		int numero= 0;
		System.out.println("\t\t ----- Menu operaciones arit-----");
		System.out.println(" \t\t1: Suma");
		System.out.println(" \t\t2: Resta");
		System.out.println(" \t\t3: Multiplicacion");
		System.out.println(" \t\t4: Division");
		System.out.println(" \t\t5: Modulo");
		System.out.println(" \t\t6: Booleans");
		System.out.println(" \t7: Salir");
		
		System.out.println("Introduzca la opción ");
		return numero = s.nextInt();	
		}
	

}
