package oop;

import java.util.Scanner;

public class OperacionesAritmeticas {

	Scanner s = new Scanner (System.in);
	
	double add () {
		System.out.print("Introduce el numero a sumar");
		double valor0 = s.nextDouble();
		System.out.print("Introduce el numero 2 a sumar");
		double valor1 = s.nextDouble();
		return valor0 + valor1;
	}

	double resta () {
		System.out.print("Introduce el numero a restar");
		double valor0 = s.nextDouble();
		System.out.print("Introduce el numero 2 a restar");
		double valor1 = s.nextDouble();
		return valor0 - valor1;
	}
	double multiply() {
		System.out.print("Introduce el numero a multiplicar");
		double valor0 = s.nextDouble();
		System.out.print("Introduce el numero 2 a multiplicar");
		double valor1 = s.nextDouble();
		return valor0 * valor1;
	}
	double divide() {
		System.out.print("Introduce el numero a dividir");
		double valor0 = s.nextDouble();
		System.out.print("Introduce el numero 2 a dividir");
		double valor1 = s.nextDouble();
		if(valor1 != 0) {
			return valor0 / valor1;
		}else {
			System.out.println("No se puede dividir");
		}
		return 0;
	}
	double module() {
		System.out.print("Introduce el numero a sumar");
		double valor0 = s.nextDouble();
		System.out.print("Introduce el numero 2 a sumar");
		double valor1 = s.nextDouble();
		return valor0 % valor1;
		

}}
