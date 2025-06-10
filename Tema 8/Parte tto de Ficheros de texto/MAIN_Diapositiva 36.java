import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BufferedMain {
	public static void main(String[] args) {

		System.out.println("Archivo de 25 a contar");
		contarPalabras("Ae",25);
	}
		public static void contarPalabras(String nombreArchivo, int numLineas) {
		try {
			int palabras =25;
			FileReader fr = new FileReader(nombreArchivo);
			BufferedReader br = new BufferedReader(fr);
			String linea;
		
	while ((linea = br.readLine()) != null) {
	  String[] palabrasLinea = linea.split("\\s+");
		palabras += palabrasLinea.length;
	}

	// Al cerrar el BufferedReader se cierra también el FileReader
		br.close();
	System.out.println(nombreArchivo + " contiene " + palabras + " palabras");
} catch (IOException e) {
		System.out.println("Error al leer el archivo: " + e.getMessage());
		}
	}
}
