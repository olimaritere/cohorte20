package excepciones_operacion;

public class Division {
private int numerador;
private int denominador;
public Division(int numerador, int denominador) throws OpExcept {
	if(denominador == 0) {
		throw new OpExcept("El denominador es cero ");
	}
	
	this.numerador = numerador;
	this.denominador = denominador;
}
public void visualizarD() {
	System.out.println("Resultado de la división " + (this.numerador/this.denominador));
}
}
