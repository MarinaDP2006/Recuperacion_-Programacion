/* Usar Comparator para ordenar alumnos por longitud de nombre.
  Ordenar por nota descendente y luego nombre alfabéticamente.
 Crear TreeSet con Comparator personalizado. */

import java.util.*;

class Alumno {
    String nombre;
    double nota;
    
    public Alumno(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    
    @Override
    public String toString() {
        return nombre + " (" + nota + ")";
    }
}

public class App_Main {
    public static void main(String[] args) {
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("María", 8.5));
        alumnos.add(new Alumno("Juan", 7.2));
        alumnos.add(new Alumno("Ana", 9.1));
        alumnos.add(new Alumno("Carlos", 7.2));
        alumnos.add(new Alumno("Luis", 6.8));
        alumnos.add(new Alumno("Patricia", 9.1));
        
        System.out.println("Lista original:");
        mostrarAlumnos(alumnos);
        
        // 1. Ordenar por longitud de nombre
        ordenarPorLongitudNombre(alumnos);
        System.out.println("\nOrdenados por longitud de nombre:");
        mostrarAlumnos(alumnos);
        
        // 2. Ordenar por nota descendente y luego nombre
        ordenarPorNotaYNombre(alumnos);
        System.out.println("\nOrdenados por nota (desc) y nombre (asc):");
        mostrarAlumnos(alumnos);
    }
    
    // Método para mostrar la lista de alumnos
    public static void mostrarAlumnos(List<Alumno> alumnos) {
        for (Alumno a : alumnos) {
            System.out.println(a);
        }
    }
    
    // Ordena los alumnos por la longitud de su nombre (de más corto a más largo)
    public static void ordenarPorLongitudNombre(List<Alumno> alumnos) {
        alumnos.sort(new Comparator<Alumno>() {
            @Override
            public int compare(Alumno a1, Alumno a2) {
                return a1.nombre.length() - a2.nombre.length();
            }
        });
    }
    
    // Ordena primero por nota descendente y luego por nombre ascendente
    public static void ordenarPorNotaYNombre(List<Alumno> alumnos) {
        alumnos.sort(new Comparator<Alumno>() {
            @Override
            public int compare(Alumno a1, Alumno a2) {
                // Primero comparar por nota (orden descendente)
                if (a1.nota > a2.nota) return -1;
                if (a1.nota < a2.nota) return 1;
                
                // Si las notas son iguales, comparar por nombre (orden ascendente)
                return a1.nombre.compareTo(a2.nombre);
            }
        });
    }
}
