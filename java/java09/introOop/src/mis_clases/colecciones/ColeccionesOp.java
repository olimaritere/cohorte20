package mis_clases.colecciones;

import java.util.*;

public class ColeccionesOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ArrayList<String> list = new ArrayList<String>();
		  
	       
        list.add("A");
        list.add("B");
        list.add("C");
        list.add(null);
        list.add("E");
  
       
        System.out.println("ArrayList: " + list);
        
  
       
        HashMap<Integer, String> hm  = new HashMap<Integer, String>();
  
       
        hm.put(1, "A");
        hm.put(2, "B");
        hm.put(3, "C");
        hm.put(4, "D");
        hm.put(5, "E");
  
        
        System.out.println("HashMap: " + hm.get(1));
        System.out.println("HashMap: " + hm.get(5));

	}

}
