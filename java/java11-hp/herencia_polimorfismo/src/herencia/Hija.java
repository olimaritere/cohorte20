package herencia;

public class Hija extends Padre {
	
	private int edad;

	public Hija(String nombre, String domicilio, int edad) {
		super(nombre, domicilio);
		this.edad = edad;
	} 
	public void mostrarDatos() {
		System.out.println("El nombre es: " + nombre +
				", " + "el domicilio es: " + domicilio + ", " + "la edad es: " + edad);
		
	}
	public void mostrarDatos(String apellido) {
		
		
		System.out.println("El nombre y el apellido es: " + nombre + " " + apellido +
				", " + "el domicilio es: " + domicilio +
				", " + "la edad es: " + edad);
	}
}
