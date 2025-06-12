import java.util.Scanner;
import DAO.Autor;
import DAO.Libro;

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
            System.out.print("\nSeleccione opción: ");
            opcion = sc.nextInt();
            System.out.println();
            sc.nextLine();

            switch (opcion) {
                case 1:
                	// Insertar autor
					System.out.print("Ingrese el nombre del autor: ");
					String nombreAutor = sc.nextLine();
					System.out.print("Ingrese el país del autor: ");
					String paisAutor = sc.nextLine();
					autor.insertarAutor(nombreAutor, paisAutor);
                	break;
                case 2:
                    // Ver autores
                	autor.verAutores();
                    break;
                case 3:
                    // Insertar libro
                System.out.print("Ingrese el título del libro: ");
                String tituloLibro = sc.nextLine();
                System.out.print("Ingrese el año de publicación: ");
                int anioLibro = sc.nextInt();
                System.out.print("Ingrese el ID del autor: ");
                int idAutorLibro = sc.nextInt();
                sc.nextLine(); 
                libro.insertarLibro(tituloLibro, anioLibro, idAutorLibro);
                    break;
                case 4:
                    // Ver libros
                	libro.verLibros();
                    break;
                case 5:
                    // Modificar título de libro
                System.out.print("Ingrese el ID del libro a modificar: ");
                int idLibro = sc.nextInt();
                sc.nextLine();
                System.out.print("Ingrese el nuevo título del libro: ");
                String nuevoTitulo = sc.nextLine();
                libro.modificarTitulo(idLibro, nuevoTitulo);
                    break;
                case 6:
                    // Eliminar libro
                	System.out.print("Ingrese el ID del libro a eliminar: ");
                	int idLibroEliminar = sc.nextInt();
                	libro.eliminar(idLibroEliminar);
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
