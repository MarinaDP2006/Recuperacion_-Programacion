package Ejercicios_MAP;

import java.util.*;
import java.util.stream.Collectors;

//Crear Map de productos y precios. Mostrar claves y valores.
//Dado Map<String, List<<String>>;, imprimir nombres que estén en varias asignaturas.

public class productos_precios {
	public static void main(String[] args) {
		
		// Ejercicio 1: Crear Map de productos y precios, mostrar claves y valores
		Map<String, Double> productos = new HashMap<>();
	
		productos.put("Laptop", 127.35);
		productos.put("Teléfono", 200.95);
		productos.put("Tablet", 355.90);
		productos.put("Auriculares", 34.22);

		mostrarPreciosProductos(productos);

		// Ejercicio 3: Encontrar alumnos en múltiples asignaturas
		Map<String, List<String>> asignaturas = new HashMap<>();
		
		asignaturas.put("Matemáticas", Arrays.asList("Ana", "Carlos", "Beatriz"));
		asignaturas.put("Física", Arrays.asList("Carlos", "David", "Elena"));
		asignaturas.put("Química", Arrays.asList("Ana", "Elena", "Fernando"));

		List<String> alumnosMultiplesAsignaturas = encontrarAlumnosEnAsignaturas(asignaturas);
		System.out.println("Alumnos en múltiples asignaturas: " + alumnosMultiplesAsignaturas);
	}

	// Muestra los productos y precios
	private static void mostrarPreciosProductos(Map<String, Double> productos) {
		System.out.println("EJERCICIO 1 ");
		System.out.println("\nProductos: "); // String
		productos.keySet().forEach(System.out::println);

		System.out.println("\nPrecios:"); // Double
		productos.values().forEach(System.out::println);
	}

	// Muestra los alumnos en más de una asignatura registrados
    private static List<String> encontrarAlumnosEnAsignaturas(Map<String, List<String>> asignaturas) {
        System.out.println("\nEJERCICIO 3 ");
        
        Map<String, Integer> contarAsignaturas = new HashMap<>();

        // Recorrer todas las listas de alumnos de cada asignatura
        for (List<String> alumnos : asignaturas.values()) {
            for (String alumno : alumnos) {
                contarAsignaturas.put(alumno, contarAsignaturas.getOrDefault(alumno, 0) + 1);
            }
        }

        // Filtrar alumnos que están en más de una asignaturas
        List<String> alumnosMultiples = contarAsignaturas.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)  // Filtra alumnos con más de 1 asignatura
                .map(Map.Entry::getKey)                // Solo el nombre del alumno
                .collect(Collectors.toList());          
        return alumnosMultiples;
    }
}
