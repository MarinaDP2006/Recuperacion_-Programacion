package Ejercicios_Introduccion;

import java.util.ArrayList;
import java.util.List;

public class Ej1 {
    public static void main(String[] args) {

	// Crear lista de enteros del 1 al 5 y mostrar por consola
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        
      System.out.println("Lista de números: " + numeros);	
    }  
}
