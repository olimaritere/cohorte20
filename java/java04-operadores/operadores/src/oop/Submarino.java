package oop;

public class Submarino {
	//main temporal
	static void submenu() {
		Menu m = new Menu();
		OperacionesAritmeticas oa = new OperacionesAritmeticas();
		switch (m.submenuOp()) {
		case 1: {
			oa.add();
			break;
			
		}
		case 2: {
			System.out.println("Soy la ope2 de oa");
		}
		default:
		}
		
	}
	
	
	public static void main(String[] args) {
		Submarino.submenu();
		
	}

}
