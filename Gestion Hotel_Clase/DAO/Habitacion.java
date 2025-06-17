package DAO;
import DTO.Habitacion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Habitacion {
    private Connection connection;

    public Habitacion(Connection connection) {
        this.connection = connection;
    }

    public void crearHabitacion(Habitacion habitacion) throws SQLException {
        String sql = "INSERT INTO Habitacion (numero, tipo, precio) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, habitacion.getNumero());
            stmt.setString(2, habitacion.getTipo());
            stmt.setDouble(3, habitacion.getPrecio());
            stmt.executeUpdate();
        }
    }

    public List<Habitacion> obtenerHabitaciones() throws SQLException {
        List<Habitacion> habitaciones = new ArrayList<>();
        String sql = "SELECT * FROM Habitacion";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Habitacion habitacion = new Habitacion();
                habitacion.setIdHabitacion(rs.getInt("id_habitacion"));
                habitacion.setNumero(rs.getInt("numero"));
                habitacion.setTipo(rs.getString("tipo"));
                habitacion.setPrecio(rs.getDouble("precio"));
                habitaciones.add(habitacion);
            }
        }
        return habitaciones;
    }

    // Métodos para modificar y eliminar habitaciones
  

}

