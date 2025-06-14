Métodos BufferedWriter y BufferedReader --> Pág 35

/* Ejercicio BufferedWriter: 
Crea un método que reciba el nombre de un archivo, y un entero. El método deberá crear el
archivo y escribir ‘n’ líneas dentro. Cada línea deberá tener escrito “Esta es la línea n”,
sustituyendo ‘n’ por el número de la línea. Utiliza un buffer para realizar la escritura.
*/
// MAIN:
public static void main(String args[]) {
  Syste.out.print("Archivo de 14 lineas") // Nombre
  crearLineas(MiArchivo, 14); // Llamar método y el número de líneas que tiene el archivo

public static void crearLineas(String nombreFichero, int numLineas) {
  try {
    FileWriter fw = new FileWriter(nombreFichero);
    BufferedWriter bw = new BufferedWriter(fw);

for (int i = 1; i <= numLineas; i++) {
    bw.write("Esta es la línea " + i);
    bw.newLine();
  }

// Al cerrar el BufferedWriter se cierra también el FileWriter
bw.close();
System.out.println(nombreFichero + " creado con " + numLineas + " líneas");

} catch (IOException e) {
    System.out.println("Error al crear o escribir en el archivo: " + e.getMessage());
  }
}

/* Ejercicio BufferedReader:
Crea un método que reciba un archivo y devuelva la cantidad de palabras de dicho archivo.
Utiliza un buffer para realizar la lectura.
*/
public static void contarPalabras(String nombreArchivo) {
    try {
    int palabras = 0;
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
