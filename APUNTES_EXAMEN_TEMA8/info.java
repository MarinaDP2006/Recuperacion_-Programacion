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

// ACCESO A BASE DE DATOS: 
/* 
Para conectar con una BD en MySQL debemos realizar la conexión a través del método
getConnection de la clase DriverManager. El método recibe 3 parámetros:
  ● Usuario
  ● Contraseña
  ● URL de nuestra BD a través del conector MySQL CONECTOR LIBRERIA
*/
  try {
  String user = "root";
  String pwd = "";
  String url = "jdbc:MySQL://localhost/agenda";
  Connection conex = DriverManager.getConnection(url,user,pwd);
} catch (SQLException e) { 
    System.out.println(e); 
}

// Ejemplo de consulta sobre MySQL
try {

String user = "root";
String pwd = "";
String url = "jdbc:MySQL://localhost/agenda";

Connection conex = DriverManager.getConnection(url,user,pwd);

String query = "SELECT nombre, correo FROM contacto"; // Consulta
Statement instruccion = (Statement)conex.createStatement();
ResultSet resultado = instruccion.executeQuery(query); // Resultado de la consulta

    while(resultado.next()) 
    {
  String nombre = resultado.getString("nombre");
  String correo = resultado.getString("correo");
  System.out.println("NOMBRE: " + nombre);
  System.out.println("CORREO: " + correo);
}
  } catch (SQLException e) { 
    System.out.println(e); 
}

// Ejemplo INSERT
try {
  String user = "root";
  String pwd = "";
  String url = "jdbc:MySQL://localhost/agenda";

  Connection conex = DriverManager.getConnection(url,user,pwd);
  String query = "INSERT INTO contacto VALUES ('pepe', 'pepe@pepe.com')"; // Consulta

  Statement instruccion = (Statement)conex.createStatement();
  instruccion.executeUpdate(query); // Ejecución INSERT

} catch (SQLException e) { 
  System.out.println(e); 
}

// Ejemplo con DELETE
try {
  String user = "root";
  String pwd = "";
  String url = "jdbc:MySQL://localhost/agenda";

  Connection conex = DriverManager.getConnection(url,user,pwd);
  String query = "INSERT INTO contacto VALUES ('pepe', 'pepe@pepe.com')";

  Statement instruccion = (Statement)conex.createStatement();
  instruccion.executeUpdate(query);

} catch (SQLException e) { 
  System.out.println(e); 
}

