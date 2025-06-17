
package DAO;
import DTO.Cliente;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private Connection connection;

    public Cliente(Connection connection) {
        this.connection = connection;
    }

    public void crearCliente(Cliente cliente) throws SQLException {
        String sql = "INSERT INTO Cliente (nombre, email) VALUES (?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, cliente.getNombre());
            stmt.setString(2, cliente.getEmail());
            stmt.executeUpdate();
        }
    }

    public List<Cliente> obtenerClientes() throws SQLException {
        List<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT * FROM Cliente";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("id_cliente"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setEmail(rs.getString("email"));
                clientes.add(cliente);
            }
        }
        return clientes;
    }

    // Métodos para modificar y eliminar clientes
  
}
