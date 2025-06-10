package FileClases;
import java.io.FileReader;
import java.io.IOException;

public class FileReader {
	public static void main(String[] args) {
		String fichero = "fichero.txt";

	try {
		// Crear un objeto FileReader
		FileReader fileReader = new FileReader(fichero);
		
		// lLer y mostrar el contenido del archivo
		int caracter;
		
		System.out.println("Contenido del archivo " + fichero + ":");
		
		while ((caracter = fileReader.read()) != -1) {
		System.out.print((char) caracter);
	}
	
		// Cerrar el FileReader
		fileReader.close();
	} catch (IOException e) {
	
		System.out.println("Ocurrió un error al leer el archivo");
		e.printStackTrace();
		}
	}
}
