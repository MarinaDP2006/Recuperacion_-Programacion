package Intermedio;

import java.util.Objects;

public class Alumno {
	private String nombre;
	private String nia;
	private int edad;
	
	
	public Alumno(String nombre, String nia, int edad) {
		this.nombre = nombre;
		this.nia = nia;
		this.edad = edad;
	}

    // Equals y hashCode de alumnos con mismo DNI/NIA
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(nia, alumno.nia); // Verifica si los DNI son iguales
    }

    @Override
    public int hashCode() {
        return Objects.hash(nia); // Pone los DNI que no son iguales
    }
   
    @Override
	public String toString() {
		return "Nombre: " + nombre + "," + " NIA: " + nia + "," + " Edad: " + edad;
	}
}