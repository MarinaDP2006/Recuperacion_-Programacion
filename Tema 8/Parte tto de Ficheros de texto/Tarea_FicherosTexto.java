/* 1. Crea un método que reciba un archivo de texto y modiﬁque su contenido, de modo que cada palabra del archivo deberá empezar en mayúscula.*/



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
