package Ejercicios_Introduccion;

import java.util.HashSet;
import java.util.Set;

public class Ej2 {
	
    public static void main(String[] args) {
	// Agregar duplicadoss a un Set y mostrar cuantos elementos contiene
	Set<String> pais = new HashSet<>();
	
	pais.add("España");
	pais.add("Italia");
	pais.add("Francia");
	pais.add("España");
	
		System.out.println(pais);
		
	// Mostrar cuantos elementos contiene (3)
		System.out.println("\nEl número de elementos es: " + pais.size());
    }  
}
