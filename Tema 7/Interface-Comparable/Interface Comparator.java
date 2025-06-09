/* La interface Comparator como la interfaz Comparable<T> se utilizan para comparar objetos */
/* La interfaz Comparator permite definir múltiples criterios de comparación para un objeto, e incluso, nos permite comparar
objetos de diferentes clases sin necesidad de modificar la clase original.*/

public class AlumnoPorEdadComparator implements Comparator<Alumno> {
  public int compare(Alumno a1, Alumno a2) {
    int comparacion = Integer.compare(a1.getEdad(), a2.getEdad());

  if (comparacion == 0) comparacion = a1.getNombre().compareTo(a2.getNombre());
    return comparacion;
  }
}

public class AlumnoPorNiaComparator implements Comparator<Alumno> {
  public int compare(Alumno a1, Alumno a2) {
    return a1.getNia().compareTo(a2.getNia());
  }
}
