package oop;

import java.util.Scanner;

public class Tablas {
	Scanner scanner = new Scanner(System.in);
	void tabla () {
		System.out.println("Introduzca el número de tabla de multiplicar");
		int nTabla= scanner.nextInt();
		int i = 1;
		while (i<=10) {
			System.out.println(nTabla + " * " + i + " = " + (nTabla*i));
			i++;
		}
	
		
	}
	
}
