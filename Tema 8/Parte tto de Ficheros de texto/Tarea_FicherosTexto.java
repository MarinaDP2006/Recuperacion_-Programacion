/* 1. Crea un método que reciba un archivo de texto y modiﬁque su contenido, de modo que cada palabra del archivo deberá empezar en mayúscula.*/
	public String modificarTexto(String texto) {
	    if (texto == null || texto.isEmpty()) {
	     return texto;
	 }

	  String[] palabras = texto.split("\\s+"); // Divide el texto en palabras usando espacios como delimitadores
	  StringBuilder resultado = new StringBuilder();

	   for (String palabra : palabras) {
	       if (!palabra.isEmpty()) {
	          String primeraLetra = palabra.substring(0, 1).toUpperCase(); // Obtiene la primera letra y la convierte a mayúscula
	          String restoDeLaPalabra = palabra.substring(1).toLowerCase(); // Obtiene el resto de la palabra y la convierte a minúscula
	           resultado.append(primeraLetra).append(restoDeLaPalabra).append(" "); // Concatena la primera letra en mayúscula con el resto de la palabra en minúscula y agrega un espacio
	      } else {
	         resultado.append(" "); // Si la palabra está vacía con espacios, agrega un espacio para mantener la separación
	            }
	        }

	        return resultado.toString().trim(); // Devuelve el resultado final, eliminando los espacios en blanco al principio y al final
	    }

	    public static void main(String[] args) {
	        ProcesadordeArchivos procesador = new ProcesadordeArchivos();
	        String textoOriginal = "este es un ejemplo de texto.";
	        String textoModificado = procesador.modificarTexto(textoOriginal);
	        System.out.println("Texto original: " + textoOriginal);
	        System.out.println("Texto modificado: " + textoModificado);
	    }
}

/* 2. Crea un método que permita eliminar todas las ocurrencias de una palabra dada en un ﬁchero de texto. Este código producirá automáticamente un nuevo ﬁchero con la 
siguiente nomenclatura: Si el ﬁchero de entrada se llama ﬁchero.txt, el ﬁchero generado se llamará ﬁchero_2.txt. */
import java.io.*;
import java.util.*;

public class ProcesadordeArchivos {
	// Elimina todas las ocurrencias de una palabra y crea un nuevo archivo
	public static void eliminarPalabraYCrearNuevo(String rutaArchivoEntrada, String palabraAEliminar) {
	      try {
	    // Abrir archivo 
	     File archivoEntrada = new File(rutaArchivoEntrada);
	      Scanner lector = new Scanner(archivoEntrada);
	      StringBuilder contenido = new StringBuilder();

	    // Filtra palabras
	      while (lector.hasNext()) {
	      String palabra = lector.next();
	    // Comparar ignorando mayúsculas/minúsculas
	     if (!palabra.equalsIgnoreCase(palabraAEliminar)) {
	      contenido.append(palabra).append(" ");
	  }
	}
	   lector.close();

	  // Creo nombre del nuevo archivo
	     String rutaArchivoSalida = rutaArchivoEntrada.replace(".txt", "_2.txt");
	            
	   // Escribo en el nuevo archivo
	     FileWriter escritor = new FileWriter(rutaArchivoSalida);
	     escritor.write(contenido.toString().trim());
	     escritor.close();

	     System.out.println("Se creó el nuevo archivo: " + rutaArchivoSalida);

	   } catch (IOException e) {
	       System.err.println("Error al procesar el archivo: " + e.getMessage());
	   }
    }
}
