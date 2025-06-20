/* 
● BufferedReader se utiliza para leer el texto, utiliza un búfer para almacenar datos de entrada.
Al leer, BufferedReader intentará leer tantos caracteres como sea posible a la vez en el búfer, lo que puede ser mucho más eficiente que leer un carácter a la vez.

● BufferedWriter se utiliza para escribir texto, utiliza un búfer para almacenar datos de salida.
Cuando escribes en BufferedWriter, los datos se escriben primero en el búfer y se vacían (escriben) cuando el búfer está lleno o cuando se usa el método flush().
*/

BufferedWriter escribirConBuffer1 = new BufferedWriter(new FileWriter("test.txt"));
BufferedWriter escribirConBuffer2 = new BufferedWriter(new PrintWriter("test.txt"));

BufferedReader leerConBuffer1 = new BufferedReader(new FileReader("test.txt"));
Scanner leerConBuffer2 = new Scanner(leerConBuffer1);
