import java.util.Scanner;

public class AppBiblioteca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Autor autor = new Autor();
        Libro libro = new Libro();
        int opcion;

        do {
            System.out.println("\n=== Gestión de Biblioteca ===");
            System.out.println("1. Insertar autor");
            System.out.println("2. Ver autores");
            System.out.println("3. Insertar libro");
            System.out.println("4. Ver libros");
            System.out.println("5. Modificar título de un libro");
            System.out.println("6. Eliminar un libro");
            System.out.println("0. Salir");
            System.out.print("Seleccione opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    // Insertar autor
                    break;
                case 2:
                    // Ver autores
                    break;
                case 3:
                    // Insertar libro
                    break;
                case 4:
                    // Ver libros
                    break;
                case 5:
                    // Modificar título de libro
                    break;
                case 6:
                    // Eliminar libro
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}
