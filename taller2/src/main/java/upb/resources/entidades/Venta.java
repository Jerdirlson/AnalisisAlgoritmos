package upb.resources.entidades;

public class Venta {
    private Producto producto;
    private int cantidad;

    public Venta(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public double calcularIngreso() {
        return producto.getPrecioVenta() * cantidad;
    }

    public double calcularGasto() {
        return producto.getPrecioCompra() * cantidad;
    }
}
