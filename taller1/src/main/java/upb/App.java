package upb;

import java.util.Scanner;


import upb.resources.structures.doublee.linked.DoubleLinkedList;
import upb.resources.entidades.BalanceContable;
import upb.resources.entidades.Producto;
import upb.resources.entidades.Venta;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        DoubleLinkedList<Producto> productos = new DoubleLinkedList<>();
        BalanceContable balance = new BalanceContable();
        Scanner scanner = new Scanner(System.in);

        // Registrar productos
        while (true) {
            System.out.println("¿Desea agregar un producto? (sí/no)");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("no")) {
                break;
            }

            System.out.print("Nombre del producto: ");
            String nombre = scanner.nextLine();

            System.out.print("Precio de compra: ");
            double precioCompra = Double.parseDouble(scanner.nextLine());

            System.out.print("Precio de venta: ");
            double precioVenta = Double.parseDouble(scanner.nextLine());

            System.out.print("¿El producto tiene IVA? (sí/no): ");
            boolean tieneIVA = scanner.nextLine().equalsIgnoreCase("sí");

            Producto producto = new Producto(nombre, precioCompra, precioVenta, tieneIVA);
            productos.add(producto);
        }

        // Registrar ventas
        while (true) {
            System.out.println("¿Desea registrar una venta? (sí/no)");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("no")) {
                break;
            }

            System.out.print("Nombre del producto vendido: ");
            String nombreProducto = scanner.nextLine();

            Producto productoVendido = null;
            for (int i = 0; i < productos.size(); i++) {
                Producto producto = productos.getIndex(i);
                if (producto.getNombre().equalsIgnoreCase(nombreProducto)) {
                    productoVendido = producto;
                    break;
                }
            }

            if (productoVendido == null) {
                System.out.println("Producto no encontrado.");
                continue;
            }

            System.out.print("Cantidad vendida: ");
            int cantidad = Integer.parseInt(scanner.nextLine());

            Venta venta = new Venta(productoVendido, cantidad);
            balance.registrarVenta(venta);
        }

        // Generar balance
        balance.generarBalance();

        scanner.close();
    }
}
