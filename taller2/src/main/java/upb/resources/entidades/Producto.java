package upb.resources.entidades;
public class Producto {
    private String nombre;
    private double precioCompra;
    private double precioVenta;
    private boolean tieneIVA;

    public Producto(String nombre, double precioCompra, double precioVenta, boolean tieneIVA) {
        this.nombre = nombre;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.tieneIVA = tieneIVA;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public double getPrecioVenta() {
        return tieneIVA ? precioVenta * 0.81 : precioVenta;
    }

    public String getNombre() {
        return nombre;
    }
}