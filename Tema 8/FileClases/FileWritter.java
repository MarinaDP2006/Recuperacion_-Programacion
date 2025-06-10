package FileClases;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritter {
	  public static void main(String[] args) {
		  String texto = "Este es un ejemplo de uso de FileWriter en JAVA del dia 10.06.2025";
		  String fichero = "fichero.txt";
		  
	 try {
		 // Crer un objeto FileWriter
		  FileWriter fileWriter = new FileWriter(fichero);
		  
		 // Escribir un String en el archivo
		  fileWriter.write(texto);
			 
		  // Cerrar el FileWriter
		  fileWriter.close();			
		 System.out.println("Se ha escrito en el fichero.");
	
	 } catch (IOException e) {

		 System.out.println("Ocurrió un error al escribir en el fichero.");
			e.printStackTrace();
	   }	  
   }
}
