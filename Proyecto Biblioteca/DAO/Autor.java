import java.sql.*;
import CONEXION.ConexBD;

public class Autor {

 // INSERTAR AUTOR
 public void insertarAutor(String nombre, String pais) {
     String sql = "INSERT INTO Autor (nombre, pais) VALUES (?, ?)";
     try (Connection conn = ConexBD.getConnection();
          PreparedStatement stmt = conn.prepareStatement(sql)) {
         stmt.setString(1, nombre);
         stmt.setString(2, pais);
         stmt.executeUpdate();
         System.out.println("Autor insertado correctamente.");
     } catch (SQLException e) {
         e.printStackTrace();
     }
 }

 // VER AUTORES
 public void verAutores() {
     String sql = "SELECT id_autor, nombre, pais FROM Autor";
     try (Connection conn = ConexBD.getConnection();
          Statement stmt = conn.createStatement();
          ResultSet rs = stmt.executeQuery(sql)) {
         while (rs.next()) {
             int id = rs.getInt("id_autor");
             String nombre = rs.getString("nombre");
             String pais = rs.getString("pais");
             System.out.println("ID: " + id + ", Nombre: " + nombre + ", País: " + pais);
         }
     } catch (SQLException e) {
         e.printStackTrace();
     }
 }
}
