package excepciones_ejecuta;

import excepciones_operacion.Division;
import excepciones_operacion.OpExcept;

public class TestExcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Division d = new Division(4, 2);
			d.visualizarD();

			
		}catch (OpExcept e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		System.out.println("Continua....");
		
		
	}

}
