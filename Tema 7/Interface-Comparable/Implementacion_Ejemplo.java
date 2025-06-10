import java.util.Comparator;

public class NombreComparator implements Comparator<Object> {
    @Override
    public int compare(Object obj1, Object obj2) {
        String nombre1 = null;
        String nombre2 = null;
    // verificar si un objeto es una instancia de una clase específica, una subclase de esa clase o una clase que implementa una interfaz
        if (obj1 instanceof Alumno) {
            nombre1 = ((Alumno)obj1).getNombre();
        } else if (obj1 instanceof Docente) {
            nombre1 = ((Docente)obj1).getNombre();
        }
        
        if (obj2 instanceof Alumno) {
            nombre2 = ((Alumno)obj2).getNombre();
        } else if (obj2 instanceof Docente) {
            nombre2 = ((Docente)obj2).getNombre();
        }
        
        if (nombre1 != null && nombre2 != null) {
            return nombre1.compareTo(nombre2);
        } else if (nombre1 != null) {
            return -1;
        } else if (nombre2 != null) {
            return 1;
        }
        return 0;
    }
}

public class Alumno {
    private String nombre;
    private String nia;
    private int edad;
    
    // Constructor
    public Alumno(String nombre, String nia, int edad) {
        this.nombre = nombre;
        this.nia = nia;
        this.edad = edad;
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNia() {
        return nia;
    }
    
    public void setNia(String nia) {
        this.nia = nia;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
}

public class Docente {
    private String nombre;
    private int permanencia;
    private double salario;
    
    // Constructor
    public Docente(String nombre, int permanencia, double salario) {
        this.nombre = nombre;
        this.permanencia = permanencia;
        this.salario = salario;
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getPermanencia() {
        return permanencia;
    }
    
    public void setPermanencia(int permanencia) {
        this.permanencia = permanencia;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
}

// El main de la implementacion:
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Lista de alumnos y docentes
        List<Object> personas = new ArrayList<>();
        personas.add(new Alumno("Carlos García", "A12345", 20));
        personas.add(new Docente("Ana Martínez", 5, 2500.0));
        personas.add(new Alumno("Beatriz López", "A67890", 22));
        personas.add(new Docente("David Fernández", 3, 2200.0));
        personas.add(new Alumno("Elena Torres", "A13579", 21));

        // Lista sin ordenar
        System.out.println("=== Lista original (sin ordenar) ===");
        imprimirLista(personas);
        Collections.sort(personas));

        //  Lista ordenada
        System.out.println("\n=== Lista ordenada por nombre ===");
        imprimirLista(personas);
    }
}
