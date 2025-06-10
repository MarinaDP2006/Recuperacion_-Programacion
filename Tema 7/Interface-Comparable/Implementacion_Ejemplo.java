// CLase Alumno1:
public class Alumno1 {
    private String nombre;
    private String nia;
    private int edad;
    
    // Constructor
    public Alumno1(String nombre, String nia, int edad) {
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

// Clase Docente
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

// Clase interfaz comparator: 
public class NombreComparator implements Comparator<Object> {
    @Override
    public int compare(Object obj1, Object obj2) {
        String nombre1 = null;
        String nombre2 = null;
    // verificar si un objeto es una instancia de una clase específica, una subclase de esa clase o una clase que implementa una interfaz
        if (obj1 instanceof Alumno1) {
            nombre1 = ((Alumno1)obj1).getNombre();
        } else if (obj1 instanceof Docente) {
            nombre1 = ((Docente)obj1).getNombre();
        }
        
        if (obj2 instanceof Alumno1) {
            nombre2 = ((Alumno1)obj2).getNombre();
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

// Implementacion: 

    public static void main(String[] args) {
        // Lista de alumnos y docentes
        List<Object> personas = new ArrayList<>();
        personas.add(new Alumno1("Carlos García", "A12345", 20));
        personas.add(new Docente("Ana Martínez", 5, 2500.0));
        personas.add(new Alumno1("Beatriz López", "A67890", 22));
        personas.add(new Docente("David Fernández", 3, 2200.0));
        personas.add(new Alumno1("Elena Torres", "A13579", 21));

        // Mostrar lista sin ordenar
        System.out.println("=== Lista original ===");
        imprimirLista(personas);

        // Ordenar por nombre usando un Comparator
        Collections.sort(personas, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                String nombre1 = "";
                String nombre2 = "";
       // verificar si los objetos de Alumno y Docente son instancias de cada clase, una subclase o una clase que implementa una interfaz
                if (o1 instanceof Alumno1) {
                    nombre1 = ((Alumno1) o1).getNombre();
                } else if (o1 instanceof Docente) {
                    nombre1 = ((Docente) o1).getNombre();
                }
                
                if (o2 instanceof Alumno1) {
                    nombre2 = ((Alumno1) o2).getNombre();
                } else if (o2 instanceof Docente) {
                    nombre2 = ((Docente) o2).getNombre();
                }
                
                return nombre1.compareTo(nombre2);
            }
        });

        // Mostrar lista ordenada
        System.out.println("\n=== Lista ordenada por nombre ===");
        imprimirLista(personas);
    }

    private static void imprimirLista(List<Object> lista) {
        for (Object obj : lista) {
            if (obj instanceof Alumno1) {
                Alumno1 a = (Alumno1) obj;
                System.out.println("ALUMNO: " + a.getNombre() + " | NIA: " + a.getNia() + " | Edad: " + a.getEdad());
            } else if (obj instanceof Docente) {
                Docente d = (Docente) obj;
                System.out.println("DOCENTE: " + d.getNombre() + " | Permanencia: " + d.getPermanencia() + " años | Salario: $" + d.getSalario());
            }
        }
    }
}

/* CONSOLA
=== Lista original ===
ALUMNO: Carlos García | NIA: A12345 | Edad: 20
DOCENTE: Ana Martínez | Permanencia: 5 años | Salario: $2500.0
ALUMNO: Beatriz López | NIA: A67890 | Edad: 22
DOCENTE: David Fernández | Permanencia: 3 años | Salario: $2200.0
ALUMNO: Elena Torres | NIA: A13579 | Edad: 21

=== Lista ordenada por nombre ===
DOCENTE: Ana Martínez | Permanencia: 5 años | Salario: $2500.0
ALUMNO: Beatriz López | NIA: A67890 | Edad: 22
ALUMNO: Carlos García | NIA: A12345 | Edad: 20
DOCENTE: David Fernández | Permanencia: 3 años | Salario: $2200.0
ALUMNO: Elena Torres | NIA: A13579 | Edad: 21
*/
