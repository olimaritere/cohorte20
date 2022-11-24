package variables;

public class TipoVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte, short, int, long
		byte numeroB = 127;
		System.out.println("Tamaño de un byte " + Byte.SIZE);
		System.out.println("Valor maximo " + Byte.MAX_VALUE);
		System.out.println("Valor minimo " + Byte.MIN_VALUE);
		
		System.out.println("__________________________________");
		int entero = 5;
		System.out.println("Tamaño de un entero " + Integer.BYTES);
		System.out.println("Tamaño " + Integer.SIZE);
		System.out.println("Valor maximo " + Integer.MAX_VALUE);
		System.out.println("Valor min " + Integer.MIN_VALUE);
		System.out.println("El valor de entero " + entero);
		
		System.out.println("________________short__________________");
		short variableS = 6;
		System.out.println("Tamaño de short " + Short.SIZE);
		System.out.println("Tamaño bytes short " + Short.BYTES);
		System.out.println("VAlor máximo de short " + Short.MAX_VALUE);
		System.out.println("Valor minimo de short " + Short.MIN_VALUE);
		
		System.out.println("_________________long__________________");
		long variableL = 565;
		System.out.println("Tamaño de long " + Long.SIZE);
		System.out.println("Tamaño de bytes long " + Long.BYTES);
		System.out.println("Valor maximo de long " + Long.MAX_VALUE);
		System.out.println("Valor minimo de long " + Long.MIN_VALUE);
		
		var num = 12;
		
		System.out.println("Esta es la variable con var " + num);
		
		var sistemNum = 10;
		System.out.println("Decimal " + sistemNum);
		
		var sistemDeci = 0b1010;
		System.out.println("---> " + sistemDeci);
		
		var sistemExadec = 0X1010;
		System.out.println("---> " + sistemExadec);
		
		System.out.println("________float, primitivos, double________________");
		
		System.out.println("Tamaño bits: " + Float.SIZE);
		System.out.println("tamaño en bytes " + Float.BYTES);
		System.out.println("valor max: " + Float.MAX_VALUE);
		System.out.println("Valor min: " + Float.MIN_VALUE);
		float comaF = 100F;
		
		
		System.out.println("__________________DOuble__________________");
		
		System.out.println("Tamaño bits: " + Double.SIZE);
		System.out.println("tamaño en bytes " +  Double.BYTES);
		System.out.println("valor max: " +  Double.MAX_VALUE);
		System.out.println("Valor min: " +  Double.MIN_VALUE);
		double comaD = 1000.10E23;
		System.out.println("--> Double " + comaD);
		
		System.out.println("--> float: " + comaF);
		
		System.out.println("________boolean___________-");
		boolean estado = false; // false
		System.out.println("-->: " + estado);
		System.out.println("--> Boolean false " + Boolean.FALSE);
		System.out.println("--> Boolean true " + Boolean.TRUE);
		
		if (estado) {
			System.out.println("Eres el ganador");
		}else {
			System.out.println("No ganaste");
		}
		
		var edad = 20;
		boolean adulto = edad >= 10;
		
		//System.out.println("--->: varBool si edad es mayor o igual a 10" + adulto);
		
		if (adulto) {
			System.out.println("varbool si edad es mayor igual a 10 " + edad);
		}else {
			System.out.println("--> : varbool la edad es menor a " + edad);
		}
		System.out.println("_________________char_____________");
		
		//char caracter = "halo".charAt(3);
		char caracter = '\u0C6A';
		System.out.println("--> " + caracter);
		
		
		
		
		
		
		
		
	}

}
