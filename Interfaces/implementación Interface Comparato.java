/* implementar la interface sin crear directamente una clase. */
public static void ordenarAlumnosPorEdad(ArrayList<Alumno> alumnos) {
alumnos.sort(new Comparator<Alumno>() {
  
@Override
public int compare(Alumno a1, Alumno a2) {
  if (a1.getEdad() > a2.getEdad()) 
  return 1;
  if (a1.getEdad() < a2.getEdad()) 
    return -1;
      return a1.getNombre().compareTo(a2.getNombre());
    }
  });
}

public static void ordenarAlumnosPorNia(ArrayList<Alumno> alumnos) {
alumnos.sort(new Comparator<Alumno>() {
  
  @Override
  public int compare(Alumno a1, Alumno a2) {
    return a1.getNia().compareTo(a2.getNia());
    }
  });
}
