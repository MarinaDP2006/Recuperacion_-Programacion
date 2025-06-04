import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InventarioProductos {
      public static void main(String[] args) {
        
    private HashMap<String, Integer> inventario;
    private Scanner scanner;

    public InventarioProductos() {
        inventario = new HashMap<>();
        scanner = new Scanner(System.in);
    }

    public void ejecutar() {
        boolean salir = false;
        
        while (!salir) {
            System.out.println("\n--- MENÚ DE INVENTARIO ---");
            System.out.println("1. Añadir nuevo producto");
            System.out.println("2. Actualizar stock de producto");
            System.out.println("3. Mostrar cantidad de un producto");
            System.out.println("4. Mostrar stock total del inventario");
            System.out.println("5. Eliminar producto");
            System.out.println("6. Mostrar producto con mayor stock");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            
            switch (opcion) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    actualizarStock();
                    break;
                case 3:
                    mostrarCantidadProducto();
                    break;
                case 4:
                    mostrarStockTotal();
                    break;
                case 5:
                    eliminarProducto();
                    break;
                case 6:
                    mostrarProductoMayorStock();
                    break;
                case 7:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. ¡Otra vez!.");
            }
        }
          scanner.close();
    }

private void agregarProducto() {
    System.out.print("Ingrese el nombre del producto: ");
    String nombre = scanner.nextLine();
    System.out.print("Ingrese la cantidad inicial: ");
    int cantidad = scanner.nextInt();
    scanner.nextLine();

    inventario.put(nombre, cantidad);
    System.out.println("Producto añadido: " + nombre + " con cantidad: " + cantidad);
}

private void actualizarStock() {
    System.out.print("Ingrese el nombre del producto: ");
    String nombre = scanner.nextLine();
    
    if (inventario.containsKey(nombre)) { // veirificar el producto (nombre)
        System.out.print("Ingrese la cantidad a añadir (puede ser negativa para restar): ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        int nuevoStock = inventario.get(nombre) + cantidad;
        if (nuevoStock < 0) {
            System.out.println("No se puede tener un stock negativo."); // Si no hay productos en STOCK
        } else {
            inventario.put(nombre, nuevoStock);
            System.out.println("Stock actualizado: " + nombre + " ahora tiene " + nuevoStock + " unidades.");
        }
    } else {
        System.out.println("El producto no existe en el inventario.");
    }
}

private void mostrarCantidadProducto() {
    System.out.print("Ingrese el nombre del producto: ");
    String nombre = scanner.nextLine();
    
    if (inventario.containsKey(nombre)) { // Muestra nombre del producto existente en el stock por unds
        System.out.println("Cantidad de " + nombre + ": " + inventario.get(nombre) + " unidades.");
    } else {
        System.out.println("El producto no existe en el inventario.");
    }
}

   private void mostrarStockTotal() {
    }

    private void eliminarProducto() {
    }

    private void mostrarProductoMayorStock() {
        }
    }
}
