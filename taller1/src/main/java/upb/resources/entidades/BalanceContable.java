package upb.resources.entidades;

import upb.resources.structures.doublee.linked.DoubleLinkedList;

public class BalanceContable {
    private DoubleLinkedList<Venta> ventas;
    private double totalIngresos;
    private double totalGastos;
    private double gananciasNetas;

    public BalanceContable() {
        ventas = new DoubleLinkedList<>();
        totalIngresos = 0;
        totalGastos = 0;
        gananciasNetas = 0;
    }

    public void registrarVenta(Venta venta) {
        ventas.add(venta);
        totalIngresos += venta.calcularIngreso();
        totalGastos += venta.calcularGasto();
    }

    public void calcularGananciasNetas() {
        gananciasNetas = totalIngresos - totalGastos;
    }

    public void generarBalance() {
        calcularGananciasNetas();
        System.out.println("Total Ingresos: " + totalIngresos);
        System.out.println("Total Gastos: " + totalGastos);
        System.out.println("Ganancias Netas: " + gananciasNetas);
    }
}
