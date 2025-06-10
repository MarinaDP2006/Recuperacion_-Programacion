// Lee y escrbe datos en ficheros con PrintWritter
public static void main(String args[]) {
  try{
    String nombreFichero = "ficheroEnteros.txt"; // en eclipse.workspace
    PrintWriter pwr = new PrintWriter(nombreFichero); // crea archivo

  for (int i = 1; i <= 1000; i++) {
    pwr.print(i + " ");
/* 
Se encarga de organizar la salida de los números en el archivo ficheroEnteros.txt,
cada línea contenga hasta 100 números con salto de linea cada 100 números. 
*/  
    if (i % 100 == 0) pwr.println();
}
    pwr.close();
 // Escribe
    Scanner scn = new Scanner(new FileReader(nombreFichero));

    while(scn.hasNext())
    System.out.println("Valor leído: " + scn.nextInt());
  scn.close();
} catch (IOException e) { 
    System.out.println("Problemas en el fichero"); 
  }
}

// CONSOLA: Valor leido... del 1 al 1000
