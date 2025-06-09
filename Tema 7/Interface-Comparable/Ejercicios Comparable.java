/* Clase Alumno con nombre y nota. Implementar Comparable para ordenar por nota.
   Lista de 5 alumnos. Ordenarlos con Collections.sort().
   Cambiar orden para que sea por nombre en vez de nota.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Alumno implements Comparable<Alumno> {
    private String nombre;
    private double nota;

    public Alumno(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNota() {
        return nota;
    }

    /**
     * Implementación del método compareTo para la interfaz Comparable
     * Ordena los alumnos por nota de mayor a menor
     * @return negativo o positivo según si la nota es mayor, igual o menor
     */
    @Override
    public int compareTo(Alumno otro) {
        // Compara las notas en orden inverso (otro.nota primero) para orden descendente
        return Double.compare(otro.nota, this.nota);
    }

    @Override
    public String toString() {
        return nombre + " (" + nota + ")";
    }
}

public class MAIN_App {
    public static void main(String[] args) {
        // Crear lista de 5 alumnos con nombres y notas de ejemplo
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Carlos", 8.5));
        alumnos.add(new Alumno("Ana", 9.2));
        alumnos.add(new Alumno("Luis", 7.8));
        alumnos.add(new Alumno("Marta", 8.9));
        alumnos.add(new Alumno("Pedro", 6.7));

        // Mostrar lista original
        System.out.println("Lista original:");
        alumnos.forEach(System.out::println);

        /**
         * Ordenar usando el orden natural definido en compareTo (por nota)
         * Collections.sort utiliza el método compareTo implementado en la clase Alumno
         */
        Collections.sort(alumnos);
        System.out.println("\nOrdenado por nota (descendente):");
        alumnos.forEach(System.out::println);

        /**
         * Ordenar por nombre usando un Comparator anónimo
         * Se implementa compare para ordenar alfabéticamente por nombre
         */
        Collections.sort(alumnos, new Comparator<Alumno>() {
            /* Compara dos alumnos por su nombre  */
            @Override
            public int compare(Alumno a1, Alumno a2) {
                // compareTo de String para orden alfabético ascendente
                return a1.getNombre().compareTo(a2.getNombre());
            }
        });
        
        System.out.println("\nOrdenado por nombre (ascendente):");
        alumnos.forEach(System.out::println);
    }
}
