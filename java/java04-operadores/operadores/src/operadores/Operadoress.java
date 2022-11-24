package operadores;

import java.util.Scanner;

public class Operadoress {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//		//System.out.println("Da un dato: " );
//		//String dato = scanner.nextLine();
//		//System.out.println("El dato es: " + dato);
//		
//		System.out.println("Da un valor: ");
//		
//		int valor = scanner.nextInt();
//		System.out.println("Da un segundo valor: ");
//	
//	
//		int valor0 = scanner.nextInt();
//		
//		int suma = valor + valor0;
//		System.out.println("Suma: " + suma);
//		
//		int multiply = valor * valor0;
//		System.out.println("Multiplicación: " + multiply);
//		
//		int divide = valor / valor0;
//		System.out.println("División: " + divide);
//		
//		int resta = valor - valor0;
//		System.out.println("Resta: " + resta);
//		
//		System.out.println("________Modulo__________");
//		System.out.println("Introduzca un numero");
//		int datosMo = scanner.nextInt();
//		int modulo = datosMo % datosMo;
//		System.out.println("Modulo: " + modulo);
//		
//		if (modulo == 0) {
//			System.out.println("EL numero es par");
//			
//		}else {
//			System.out.println("EL numero no es par");
//			
//		}
		
//		
//		int a = 3;
//		int b = 5;
//		boolean comparar = a >= b;
//		boolean logica = false;
//		
//		if(!comparar || (!logica)) {
//		
//			System.out.println("Hola si soy verdadero");
//			System.out.println("Comparar: " + comparar);
//		}else {
//			System.out.println(comparar);
//			System.out.println(logica);
//		}
//	
		
		
		
		
		
		
//		int numero = scanner.nextInt();
//		String msj = " ";
//		switch (numero) {
//		case 1:
//			System.out.println("uno");
//			break;
//		case 2:
//			System.out.println("dos");
//			break;
//		case 3:
//			System.out.println("tres");
//			break;
//			default:
//				break;
//		}
//		int i = 0;
//		do {
//			System.out.println("Loop do while");
//			System.out.println(i); 
//			i++;
//		}while(i <= 9);
//		
//		int valor,valor0, numero;	
//		  do{
//			
//
//		      System.out.println("1-suma \n"
//		      		+ "2-resta \n"
//		      		+ "3-multiplicacion\n "
//		      		+ "4-division \n"
//		      		+ "5-modulo\n"
//		      		+ "6-boleanos\n"
//		      		+ "7-salir"
//		      		);
//
//		        System.out.println("elija una operacion");
//		  	  numero=scanner.nextInt();
//			  	;
//
//		  switch(numero) {
//
//		  case 1:
//			  System.out.println("introdusca el numero1");
//		        valor=scanner.nextInt();
//		  	  System.out.println("introdusca el numero2");
//		  	  valor0=scanner.nextInt();   
//			  int suma=valor+valor0;
//			System.out.println("suma: "+suma);
//			break;
//		case 2:
//			System.out.println("introdusca el numero1");
//	        valor=scanner.nextInt();
//	  	  System.out.println("introdusca el numero2");
//	  	  valor0=scanner.nextInt();   
//			int res=valor-valor0;
//			System.out.println("resta: "+res);
//			break;
//		case 3:
//			System.out.println("introdusca el numero1");
//	    valor=scanner.nextInt();
//		  System.out.println("introdusca el numero2");
//		  valor0=scanner.nextInt();   
//			int mult=valor+valor0;
//			System.out.println("multiplicacion: "+mult);
//			break;
//		case 4:
//			System.out.println("introdusca el numero1");
//		    valor=scanner.nextInt();
//			  System.out.println("introdusca el numero2");
//			  valor0=scanner.nextInt();   
//			int div=valor/valor0;
//			System.out.println("division: "+div);
//			break;
//		case 5:
//			System.out.println("introdusca el numero1");
//		    valor=scanner.nextInt();
//			  System.out.println("introdusca el numero2");
//			  valor0=scanner.nextInt();   
//			int mod=valor%valor0;
//			System.out.println("modulo: "+mod);
//			break;
//		case 6:
//			System.out.println("introdusca el numero1");
//	        valor=scanner.nextInt();
//	  	  System.out.println("introdusca el numero2");
//	  	  valor0=scanner.nextInt();   
//			boolean comparar=valor>=valor0;
//			boolean logica=false;
//			if (comparar||logica) {
//
//				System.out.println("hola si soy verdadero");
//
//				System.out.println("comparar "+comparar);
//			}else {
//
//				System.out.println(comparar);
//
//				System.out.println(logica);
//			}
//			break;
//		  }}
//		  while(numero!=7);
//		  }}
//		
//		
//		
//		
//		
//
//	}
//
//}

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner scanner = new Scanner(System.in);
				int numero = 0;
				do {
				System.out.println("\t\t ----- Menu-----");
				System.out.println(" \t\t1: Suma");
				System.out.println(" \t\t2: Resta");
				System.out.println(" \t\t3: Multiplicacion");
				System.out.println(" \t\t4: Division");
				System.out.println(" \t\t5: Modulo");
				System.out.println(" \t\t6: Booleans");
				System.out.println(" \t7: Salir");
				
				System.out.print(" introduzca la opcion: ");
				 numero = scanner.nextInt();	
				
				switch(numero){
				case 1:
					 System.out.println("uno");
					 System.out.println("\t----Suma---");
						System.out.print("introduzca un numero ");
						int datosS = scanner.nextInt();
						System.out.print("introduzca un numero ");
						int datosSu = scanner.nextInt();		
						int suma = datosS + datosSu;
						System.out.println("Suma: " + suma);
					 break;
				case 2:
					System.out.println("\t----Resta---");
					System.out.print("introduzca un numero ");
					int datosR = scanner.nextInt();
					System.out.print("introduzca un numero ");
					int datosRe = scanner.nextInt();		
					int rest = datosR - datosRe;
					System.out.println("Rest: " + rest);
					System.out.println("dos");
					break;
				case 3: 
					System.out.println("\t----Multiplicacion---");
					System.out.print("introduzca un numero ");
					int datosM = scanner.nextInt();
					System.out.print("introduzca un numero ");
					int datosMu = scanner.nextInt();		
					int mult = datosM * datosMu;
					System.out.println("Mult: " + mult);
					System.out.println("tres");
					break;
				case 4:
					System.out.println("\t----Division---");
					
					System.out.print("introduzca un numero ");
					int datosD = scanner.nextInt();
					System.out.print("introduzca un numero ");
					int datosDi = scanner.nextInt();
					
					if (datosDi != 0) {
						int div = datosD / datosDi;
						System.out.println("Div: " + div);			
					} else {
						System.out.println(" el denominador es cero");
					}
					
					break;
				case 5:
					
					System.out.println("\t----Modulo---");
					System.out.print("introduzca un numero ");
					int datosMo = scanner.nextInt();
					System.out.print("introduzca un numero ");
					int datosMod = scanner.nextInt();		
					int modulo = datosMo % datosMod;
					System.out.println("Modulo: " + modulo);
					if (modulo == 0) {
						System.out.println("El numero es un par");
					} else {
						System.out.println("El numero no es par ");
					}
					
					break;
				case 6:
					int a = 3;
					int b =5;
					boolean comparar= a >= b;
					boolean logica = false;
					if (!comparar || !(logica)) {
						System.out.println("hola si soy verdadero ");
						System.out.println(" comparar: " + comparar);			
					} else {
						System.out.println(comparar);
						System.out.println(logica);
					}
				case 7:
					System.out.println("Bye");
					break;
					default:
						break;
					
				}
				
					System.out.println("loop do while");
					System.out.println(numero);
				
				}while(numero != 7);
				
			}

		}
		
