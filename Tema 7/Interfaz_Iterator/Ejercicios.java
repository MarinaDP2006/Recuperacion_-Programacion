package Interfaces_Iterator;
/* 
1. Crear una lista de 5 palabras. Usar un Iterator para imprimirlas en mayúscula.
2. Eliminar palabras que empiecen por vocal usando Iterator.
3. Eliminar los impares de una lista de enteros usando Iterator. 
*/

import java.util.ArrayList;
import java.util.Iterator;

public class ejercicios_Iterator {
    public static void main(String[] args) {
    	
        // 1. Crear una lista de 5 palabras
        ArrayList<String> palabras = new ArrayList<String>();
        palabras.add("Joya");
        palabras.add("Elefante");
        palabras.add("Casa");
        palabras.add("Perro");
        palabras.add("Uva");

        // Por consola y en mayúscula
        System.out.print("Palabras en mayúscula: ");
        Iterator<String> it = palabras.iterator();
        while (it.hasNext()) {
            String palabra = it.next();
            System.out.print(palabra.toUpperCase() + " "); // Imprime en mayúsculas
        }
        System.out.println();

        // 2. Eliminar palabras que empiecen por vocal (de la lista)
        it = palabras.iterator();
        while (it.hasNext()) {
            String palabra = it.next();
            if (palabra.toLowerCase().matches("^[aeiou].*")) { // Formato de voccales
                it.remove();
            }
        }

        System.out.print("Palabras: ");
        for (String palabra : palabras) {
            System.out.print(palabra + " ");
        }
        System.out.println();

        // 3. Crear una lista de enteros
        ArrayList<Integer> enteros = new ArrayList<Integer>();
        enteros.add(1);
        enteros.add(2);
        enteros.add(3);
        enteros.add(4);
        enteros.add(5);
        enteros.add(6);

        // Eliminar los impares (de la lista)
        Iterator<Integer> itEnteros = enteros.iterator();
        while (itEnteros.hasNext()) {
            Integer numero = itEnteros.next();
            if (numero % 2 != 0) {
                itEnteros.remove();
            }
        }

        // En consola
        System.out.print("Enteros: ");
        for (Integer numero : enteros) {
            System.out.print(numero + " ");
        }
    }
}
