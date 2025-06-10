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

// Ejemplo custom: Iterador para rangos de números
class RangoNumeros implements Iterable<Integer> {
    private int inicio, fin;
    
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            private int actual = inicio;
            public boolean hasNext() { return actual <= fin; }
            public Integer next() { return actual++; }
        };
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
// Uso: Collections.sort(productos); // Ordena por precio
/*
- Comparator (Interfaz): Para qué sirve: Permite definir múltiples criterios de ordenación externos a la clase.
*/
Comparator<Producto> porNombre = Comparator.comparing(p -> p.nombre);
Comparator<Producto> porPrecioDesc = (p1, p2) -> Double.compare(p2.precio, p1.precio);
// Uso: productos.sort(porPrecioDesc);

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
