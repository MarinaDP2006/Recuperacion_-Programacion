package Ejercicios_Introduccion;

import java.util.ArrayList;
import java.util.List;

public class Ej3 {
    public static void main(String[] args) {

	// Crear lista de nombres y recorrerla con foreach
    	List<String> nombres = new ArrayList<>();
        nombres.add("Leroy");
        nombres.add("María");
        nombres.add("Pedro");       
    // FOR
        System.out.println("(for) Los nombres son: ");
        for (int n = 0; n < nombres.size(); n++) {
            System.out.println(nombres.get(n));
     }
    // FOR-EACH
        System.out.println("\n(for-each) Los nombres son: ");
        for (String nombre : nombres) {
        	System.out.println(nombre);
        }
    }  
}
