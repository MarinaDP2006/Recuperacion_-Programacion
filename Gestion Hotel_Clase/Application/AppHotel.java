import java.util.Scanner;
import DAO.Habitacion;
import DAO.Reserva;

public class AppHotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Habitacion habitacion = new Habitacion();
        Reserva reserva = new Reserva();
        int opcion;

        do {
            System.out.println("\n=== Gestión de Hotel ===");
            System.out.println("1. Hacer una reserva de habitacion");
            System.out.println("2. Ver reservas");
            System.out.println("3. Ver habotaciones disponibles");
            System.out.println("4. Modificar reserva");
            System.out.println("5. Cancelar reserva");
            System.out.println("6. Salir");
            System.out.print("\nSeleccione opción: ");
            opcion = sc.nextInt();
            System.out.println();
            sc.nextLine();
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
                	break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 6);

        sc.close();
    }
}
