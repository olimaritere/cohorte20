package colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Colecciones {

	public static void main(String[] args) {
		//List - ArrayList
		//Elementos o valores de un mismo tipo
		System.out.println("-------ArrayList------");
		
		List<String> miArray = new ArrayList<String>();
		
		miArray.add("Gdl");
		miArray.add("CDMX");
		miArray.add("MTY");
		miArray.add(2, "Colima");
		
		//boolean valorQuitado = miArray.remove(0);
		//boolean valorQuitado = miArray.remove(GDLx)
		
		String valorQuitado = miArray.remove(0);
		
		System.out.println(valorQuitado);
		System.out.println(miArray.size());
		
		imprimir(miArray);
		System.out.println("-------------HashSet----------------");
		//no permite elementos duplicados
		
		Set<String> miSet = new HashSet<String>();
		
		miSet.add("Panchito");
		miSet.add("Paco");
		miSet.add("Alex");
		miSet.add("Martin");
		
		System.out.println(miSet);
		imprimir(miSet);
		System.out.println(miSet.contains("Paco"));
		
		
		
	}
	
	public static void imprimir(Collection coleccion) {
		for(Object elemento : coleccion ) {
			System.out.println("Elemento = " + elemento);
		}
	}


}
