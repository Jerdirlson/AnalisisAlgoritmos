package upb;

import java.util.Iterator;

import resources.product.Product;
import resources.structures.doublee.linked.DoubleLinkedList;
import resources.structures.interfaces.node.NodeInterface;

public class BusquedaBinaria {
    public static void main(String[] args) {

        DoubleLinkedList<Product> products = new DoubleLinkedList<>();

        for (int i = 1; i <= 250; i++) {
            products.add(new Product("Producto" + i, i, (int)(Math.random() * 100), i));
        }

        Iterator<NodeInterface<Product>> it = products.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().getObject());
        }

        // Tiempo de inicio
        long startTime = System.nanoTime();

        // Buscar un producto específico por precio
        int index = binarySearch(products, 20);

        // Tiempo de fin
        long endTime = System.nanoTime();

        if (index != -1) {
            Product foundProduct = products.getIndex(index);
            System.out.println("Producto encontrado: " + foundProduct.getName() + " con precio " + foundProduct.getPrice());
        } else {
            System.out.println("Producto no encontrado.");
        }

        System.out.println("Tiempo de ejecución: " + (endTime - startTime) + " nanosegundos");
    }

    public static int binarySearch(DoubleLinkedList<Product> products, double targetPrice) {
        int left = 0;
        int right = products.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            Product midProduct = products.getIndex(mid);

            if (midProduct.getPrice() == targetPrice) {
                return mid;
            } else if (midProduct.getPrice() < targetPrice) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public int suma(int[] v, int tamaño) {
        int i, result = 0;
        for (i = 0; i < tamaño; i++) {
            result += v[i];
        }
        return result;
    }

    int i, result = 0;

}
