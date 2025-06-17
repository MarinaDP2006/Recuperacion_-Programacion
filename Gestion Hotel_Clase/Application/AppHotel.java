import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import DAO.ClienteDAO;
import DAO.HabitacionDAO;
import DAO.ReservaDAO;

public class AppHotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        // Conexión a la base de datos
        String url = "jdbc:mysql://localhost:3306/tu_base_de_datos";
        String user = "tu_usuario";
        String password = "tu_contraseña";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            ClienteDAO clienteDAO = new ClienteDAO(connection);
            HabitacionDAO habitacionDAO = new HabitacionDAO(connection);
            ReservaDAO reservaDAO = new ReservaDAO(connection);

            do {
                System.out.println("\n=== Gestión de Hotel ===");
                System.out.println("1. Hacer una reserva de habitación");
                System.out.println("2. Ver reservas");
                System.out.println("3. Ver habitaciones disponibles");
                System.out.println("4. Modificar reserva");
                System.out.println("5. Cancelar reserva");
                System.out.println("6. Salir");
                System.out.print("\nSeleccione opción: ");
                opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {
                    case 1:
                        // hacer una reserva
                        Reserva reserva = new Reserva();
                        System.out.print("ID Cliente: ");
                        reserva.setIdCliente(sc.nextInt());
                        System.out.print("ID Habitación: ");
                        reserva.setIdHabitacion(sc.nextInt());
                        System.out.print("Fecha Entrada (YYYY-MM-DD): ");
                        reserva.setFechaEntrada(Date.valueOf(sc.nextLine()));
                        System.out.print("Fecha Salida (YYYY-MM-DD): ");
                        reserva.setFechaSalida(Date.valueOf(sc.nextLine()));
                        reservaDAO.crearReserva(reserva);
                        System.out.println("Reserva creada con éxito.");
                        break;
                    case 2:
                        List<Reserva> reservas = reservaDAO.obtenerReservas();
                        for (Reserva r : reservas) {
                            System.out.println("Reserva ID: " + r.getIdReserva() + ", Cliente ID: " + r.getIdCliente() + ", Habitación ID: " + r.getIdHabitacion());
                        }
                        break;
                    case 3:
                        List<Habitacion> habitaciones = habitacionDAO.obtenerHabitaciones();
                        for (Habitacion h : habitaciones) {
                            System.out.println("Habitación ID: " + h.getIdHabitacion() + ", Número: " + h.getNumero() + ", Tipo: " + h.getTipo() + ", Precio: " + h.getPrecio());
                        }
                        break;
                    case 4:
                        // modificar reserva
                        break;
                    case 5:
                        // cancelar reserva
                        break;
                    case 6:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } while (opcion != 6);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
