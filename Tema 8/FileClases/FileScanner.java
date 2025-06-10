// permite procesar tipos primitivos y cadenas de texto.
  public static void main(String args[]) {
  File archivo = new File("archivo.txt");
    try {
    Scanner scn = new Scanner(archivo);
  while (scn.hasNextLine()) {
    String linea = scn.nextLine();
    System.out.println(linea);
  }
    scn.close();
} catch (FileNotFoundException e) {
  System.err.println("No se pudo encontrar el archivo");
  }
}
