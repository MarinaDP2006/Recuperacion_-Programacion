/*
Interfaces y Programación Funcional
*/
/*
Map (Interfaz): Almacena datos en pares clave-valor (key-value) donde cada clave es única. Ideal para búsquedas rápidas.
Implementaciones: HashMap (no ordenado), TreeSet (ordenado), LinkedHashMap (orden de inserción).
*/ 

// Ejemplo: Contador de palabras
Map<String, Integer> contador = new HashMap<>();
for (String palabra : palabras) {
    contador.put(palabra, contador.getOrDefault(palabra, 0) + 1);
}

/*
Set (Interfaz): Colección que no permite elementos duplicados. Usado cuando necesitas unicidad.
Implementaciones: HashSet (rápido, no ordenado), TreeSet (ordenado), LinkedHashSet (mantiene orden de inserción).
*/

// Ejemplo: Eliminar duplicados de una lista
List<Integer> numeros = Arrays.asList(1, 2, 2, 3);
Set<Integer> unicos = new HashSet<>(numeros);

/*
Iterator/Iterable (Interfaces)
- Iterable: Permite que una clase sea recorrible con for-each (debe implementar iterator()).
- Iterator: Proporciona métodos para recorrer una colección (hasNext(), next(), remove()).
*/
    public static void main(String[] args) {
        // Crear grupo de personas
        GrupoPersonas grupo = new GrupoPersonas();
        grupo.agregarPersona(new Persona("María", 30));
        grupo.agregarPersona(new Persona("Juan", 25));
        grupo.agregarPersona(new Persona("Carlos", 20));
        grupo.agregarPersona(new Persona("Ana", 35));
        
        System.out.println("=== Iteración básica ===");
        for (Persona p : grupo) {
            System.out.println(p);
        }
        
        System.out.println("\n=== Ordenado por edad ===");
        grupo.ordenarPorEdad();
        grupo.forEach(System.out::println); // forEach
        
        System.out.println("\n=== Ordenado por nombre ===");
        grupo.ordenarPorNombre();
        Iterator<Persona> it = grupo.iterator();
        while (it.hasNext()) {
            Persona p = it.next();
            System.out.println(p);
            if (p.nombre.equals("Juan")) {
                it.remove(); // Eliminar a Juan durante la iteración
            }
        }
        
        System.out.println("\n=== Después de eliminar a Juan ===");
        grupo.forEach(System.out::println);
    }
}

/*
Comparator y Comparable
- Comparable (Interfaz): Define un orden natural para los objetos de una clase. La clase implementa compareTo().
*/

class Producto implements Comparable<Producto> {
    String nombre;
    double precio;
    
    @Override
    public int compareTo(Producto otro) {
        return Double.compare(this.precio, otro.precio);
    }
}
// Uso: 
Collections.sort(productos); // Ordena por precio
/*
- Comparator (Interfaz): Para qué sirve: Permite definir múltiples criterios de ordenación externos a la clase.
*/
public class EjemploComparacion {
    public static void main(String[] args) {
        List<Persona> personas = Arrays.asList(
            new Persona("Juan", 25),
            new Persona("María", 30),
            new Persona("Carlos", 20)
        );
        
        System.out.println("Lista original:");
        personas.forEach(System.out::println);
        
        // Orden natural (Comparable - por edad)
        Collections.sort(personas);
        System.out.println("\nOrdenado por edad (Comparable):");
        personas.forEach(System.out::println);
        
        // Orden por nombre (Comparator)
        Comparator<Persona> porNombre = Comparator.comparing(p -> p.nombre);
        personas.sort(porNombre);
        System.out.println("\nOrdenado por nombre (Comparator):");
        personas.forEach(System.out::println);
    }
}

/*
Programación Funcional
- Stream: Permite operaciones (filtrado, mapeo, reducción)
    .filter: Elimina elementos que no cumplen condición.
    .map: Transforma cada elemento.
    .reuce: Agrega elementos.
    .collect: Coloca en lista el resultado.
*/

// Ejemplo:
List<Producto> filtrados = productos.stream()
    .filter(p -> p.precio > 10)                   // Filtra
    .sorted(Comparator.comparing(p -> p.nombre))  // Ordena
    .collect(Collectors.toList());                // Resultado
