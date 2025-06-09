// La interface Comparable<T> tiene un único método abstracto que debemos implementar, dicho 
// método es compareTo(T obj), debe devolver un entero.
// La implementación de compareTo() es para que los objetos de una clase puedan ser ordenados y 
// comparados de manera coherente en todo tipo de Colecciones.

  public class Alumno implements Comparable<Alumno> {
    private String nombre;
    private String nia;
    private int edad;

  // constructores, getters y setters

  @Override
  public int compareTo(Alumno a) {
    int comparacion = Integer.compare(this.edad, a.edad);
      if (comparacion == 0) comparacion = this.nombre.compareTo(a.nombre);
    return comparacion;
  }
} 
// ordenamos por edad, de menor a mayor, y luego por nombre
