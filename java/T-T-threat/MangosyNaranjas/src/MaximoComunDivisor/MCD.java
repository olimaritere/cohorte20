package MaximoComunDivisor;

import java.util.Scanner;

public class MCD {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer numero");
		int num1 = sc.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Introduce el segundo numero");
		int num2 = sc2.nextInt();
		
		int res = MCD(num1, num2);
		System.out.println("El MCD: " + res);
	}
		
		
		public static int MCD(int num1, int num2) {
			
			int a = Math.max(num1, num2);
			int b = Math.min(num1, num2);
			
			int resultado = 0;
			do {
			
			resultado = b;
			b = a % b;
			a = resultado;
			
			}while (b !=0);
			
			return resultado;
		
		
	}
}	
