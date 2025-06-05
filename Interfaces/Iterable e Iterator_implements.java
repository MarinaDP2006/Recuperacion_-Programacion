public class Grupo implements Iterable<Alumno> {
  private String nombre;
  private ArrayList<Alumno> alumnos;

  public Grupo(String nombre) {
    this.nombre = nombre;
    this.alumnos = new ArrayList<>();
}

  @Override
public Iterator<Alumno> iterator() {
  return new alumnos.iterator();
  }
}

/* Ejemplo de clase que implementa la interfaz Iterable */

public class Alumno {
  private String nombre;
  private String nia;
  private int edad;
//constructor
//Getters y setters
}

/* Utilizamos el iterator() de una clase que ya lo tiene implementado, en este caso, la clase ArrayList */

/* Creamos una clase interna que implementa la interfaz Iterator, y devolvemos una instancia de clase */
  public class Grupo implements Iterable<Alumno> {
    private String nombre;
    private ArrayList<Alumno> alumnos;

  public Grupo(String nombre) {
    this.nombre = nombre;
    this.alumnos = new ArrayList<>();
}

@Override
public Iterator<Alumno> iterator() {
  return new IteratorGrupo();
  }

  private class IteratorGrupo implements Iterator<Alumno> {
    private int posicion = 0;
    //métodos abstractos interfaz Iterator<T>
  public boolean hasNext() { 
    return posicion < alumnos.size(); 
  }

    public Alumno next() { 
      return alumnos.get(posicion++); 
  }
 }
}
