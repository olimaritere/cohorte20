package operadores;

import java.util.Scanner;

public class Ciclos {
//	
//	void saludo () {
//		System.out.println("Hola a las funciones en java ");
//	
//	}
//	
//	int operacion () {
//		int f = (int) Math.pow(3, 2);
//		return f;
//		
//		
//	}
//	
//	
//	static float nuevo () {
//		return 0;
//	}
//	
//	String caracteres () {
//		String nombre = "HOla buen dia ";
//		return nombre;
//	}
//	
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Ciclos objC = new Ciclos ();
//		 objC.saludo();
//		 objC.operacion();
//		 
//		 System.out.println();
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("\t\t\tIntroduzca el valor de la tabla de multiplicar");
//		int tabla = scanner.nextInt();
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(tabla + " * " + i + " = " + (tabla * i));
//		}
//		
//		int j =1;
//		System.out.println("\t\t\tIntroduzca el valor de la tabla de multiplicar");
//		int tablaw = scanner.nextInt();
//		while (j<=10) {
//			System.out.println(tablaw + " * " + j + " = " + (tablaw * j));
//			j++;
//		}
//	}
//
//}
//	package operadores;
//
//	import java.util.Scanner;
//
//	public class Ciclos {
//		
		void saludo() {
			System.out.println("Hola a las funciones en java ");
			
		}
		
		int operacion () {
			int f = (int) Math.pow(3, 2);
			return f;
		}
		static float nuevo() {
			return 0;
		}
		
		String caracteres () {
			String nombre = "Hola buen día ";
			return nombre;
		}
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Ciclos objC;
			objC = new Ciclos();
			objC.saludo();
			
			System.out.println("uso de pow()" + objC.operacion() );
			
			
			nuevo();
			
			Scanner scanner = new Scanner(System.in);
			System.out.print("\t\t\tIntroduzca el valor de la tabla de multiplicar con el ciclo for --> ");	
			int tabla = scanner.nextInt();
			for (int i = 1; i <= 10; i++) {
				System.out.println(tabla + " * " + i + " = " +(tabla * i));
			}
			
			int j = 1;
			System.out.print("\t\t\tIntroduzca el valor de la tabla de multiplicar con el ciclo while --> ");	
			int tablaW = scanner.nextInt();
			
			while (j <= 10) {
				System.out.println(tablaW + " * " + j + " = " +(tablaW * j));
				j++;
			}

		}

	}


