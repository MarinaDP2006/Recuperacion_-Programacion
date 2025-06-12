public class Libro {

    // INSERTAR LIBRO
    public void insertarLibro(String titulo, int anio, int idAutor) {
        String sql = "INSERT INTO Libro (titulo, anio, id_autor) VALUES (?, ?, ?)";
        try (Connection conn = ConexBD.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, titulo);
            stmt.setInt(2, anio);
            stmt.setInt(3, idAutor);
            stmt.executeUpdate();
            System.out.println("Libro insertado correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // VER LIBROS
    public void verLibros() {
        String sql = "SELECT id_libro, titulo, anio, id_autor FROM Libro";
        try (Connection conn = ConexBD.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                int id = rs.getInt("id_libro");
                String titulo = rs.getString("titulo");
                int anio = rs.getInt("anio");
                int idAutor = rs.getInt("id_autor");
                System.out.println("ID: " + id + ", Título: " + titulo + ", Año: " + anio + ", ID Autor: " + idAutor);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // MODIFICAR TITULO DE LIBRO
    public void modificarTitulo(int idLibro, String nuevoTitulo) {
        String sql = "UPDATE Libro SET titulo = ? WHERE id_libro = ?";
        try (Connection conn = ConexBD.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nuevoTitulo);
            stmt.setInt(2, idLibro);
            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Título modificado correctamente.");
            } else {
                System.out.println("No se encontró el libro.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ELIMINAR LIBRO
    public void eliminar(int idLibro) {
        String sql = "DELETE FROM Libro WHERE id_libro = ?";
        try (Connection conn = ConexBD.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idLibro);
            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Libro eliminado correctamente.");
            } else {
                System.out.println("No se encontró el libro.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
