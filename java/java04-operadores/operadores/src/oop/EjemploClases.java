package oop;

public class EjemploClases {
	
	static void cambio() {
	
		Tablas t = new Tablas();
		Menu m = new Menu();
		
		
		int numero = m.menuOp();
		
		switch (numero) {
		case 1: {
			t.tabla();	
			break;
		}
		case 2:
			System.out.println("EStoy en el caso 2");
			break;
		default:
		
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EjemploClases.cambio();
		
	}

}
