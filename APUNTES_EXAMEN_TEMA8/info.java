/*
Clase File: Representa archivos/directorios en el sistema de archivos. Permite crear, eliminar, buscar, etc.
*/
// Crear directorio en una ruta y archivo, donde aparece el tamaño que tiene el archivo.
File directorio = new File("/ruta");
if (!directorio.exists()) {
    directorio.mkdir();  // Crea el directorio
}

File archivo = new File(directorio, "datos.txt");
System.out.println("Tamaño: " + archivo.length());

/*
FileReader/FileWriter: Lectura/escritura de caracteres (texto) directamente.
*/
// Escritura 
import java.io.*;

public class EjemploBasicoEscritura {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("ejemplo.txt")) {
            fw.write("Línea 1: Hola mundo\n");
            fw.write("Línea 2: Aprendiendo Java I/O\n");
            fw.write("Línea 3: 12345\n");
            System.out.println("Archivo escrito correctamente");
        } catch (IOException e) {
            System.out.println("Error al escribir: " + e.getMessage());
        }
    }
}

// Lectura
import java.io.*;

public class EjemploBasicoLectura {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("ejemplo.txt")) {
            int caracter;
            System.out.println("Contenido del archivo:");
            while ((caracter = fr.read()) != -1) {
                System.out.print((char) caracter);
            }
        } catch (IOException e) {
            System.out.println("Error al leer: " + e.getMessage());
        }
    }
}

/* CONSOLA: 
Archivo escrito correctamente

Contenido del archivo:
Línea 1: Hola mundo
Línea 2: Aprendiendo Java I/O
Línea 3: 12345
*/

/*
BufferedReader/BufferedWriter
Para qué sirven: Mejoran el rendimiento con buffer y ofrecen métodos útiles (readLine(), newLine()).
*/
// Lectura
import java.io.*;

public class EjemploBufferedReader {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("buffered.txt"))) {
            String linea;
            int numLinea = 1;
            System.out.println("Leyendo con BufferedReader:");
            while ((linea = br.readLine()) != null) {
                System.out.println("Línea " + numLinea++ + ": " + linea);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

// Escritura
import java.io.*;

public class EjemploBufferedWriter {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("buffered.txt"))) {
            bw.write("Primera línea con BufferedWriter");
            bw.newLine();
            bw.write("Segunda línea");
            bw.newLine();
            bw.write("Tercera línea");
            System.out.println("Datos escritos con BufferedWriter");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

/* CONSOLA
Datos escritos con BufferedWriter

Leyendo con BufferedReader:
Línea 1: Primera línea con BufferedWriter
Línea 2: Segunda línea
Línea 3: Tercera línea
*/

/*
FileInputStream/FileOutputStream: Lectura/escritura de bytes (imágenes, archivos binarios). 
*/

// ACCESO A BASE DE DATOS: (CLASE DEL 11-06-25)

