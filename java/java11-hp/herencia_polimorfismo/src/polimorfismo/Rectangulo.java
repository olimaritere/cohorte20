package polimorfismo;

import java.util.Scanner;

public class Rectangulo extends FigurasGeometricas {
	private double base;
	private double altura;
	Scanner s = new Scanner(System.in);
	
	@Override
	public void pedirDatos() {
		// TODO Auto-generated method stub
		System.out.println("\t\t\t Area del rectangulo");
		System.out.println("Introduzca base: ");
		base = s.nextDouble();
		System.out.println("Introduzca la altura: ");
		altura = s.nextDouble();
		
		
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		resultado = base * altura;
		
	}
	

}
