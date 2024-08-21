package upb;

import java.util.Iterator;

import resources.product.Product;
import resources.structures.doublee.linked.DoubleLinkedList;
import resources.structures.interfaces.node.NodeInterface;
import resources.structures.nodes.DoubleLinkedNode;

public class AlgoritmoPorInsercion {
    public static void main(String[] args) {
        // contexto de que se tiene una lista de productos ya definida
        // y se quiere o se desea ordenar por precio por lagoritmo de inserción.

        DoubleLinkedList<Product> products = new DoubleLinkedList<>();

        for (int i = 1; i <= 750; i++) {
            products.add(new Product("Producto" + i, i, (int)(Math.random() * 100), i));
        }


        long startTime = System.nanoTime();

        insertionSort(products);

        long endTime = System.nanoTime();

        long duration = endTime - startTime;


        System.out.println("El algoritmo de ordenamiento por inserción tardó: " + duration + " milisegundos");


        // Iterator<NodeInterface<Product>> it = products.iterator();
        // while (it.hasNext()) {
        //     System.out.println(it.next().getObject());
        // }

        // System.out.println("Hello World!");
    }


     public static void insertionSort(DoubleLinkedList<Product> products) {
        if (products.size() <= 1) {
            return;
        }

        DoubleLinkedNode<Product> current = products.getHead().getNext();
        
        while (current != null) {
            Product key = current.getObject();
            DoubleLinkedNode<Product> prev = current.getPrevious();

            while (prev != null && prev.getObject().getPrice() > key.getPrice()) {
                prev.getNext().setObject(prev.getObject());
                prev = prev.getPrevious();
            }

            if (prev == null) {
                products.getHead().setObject(key);
            } else {
                prev.getNext().setObject(key);
            }

            current = current.getNext();
        }
    }


    public int suma(int[] v, int tamaño) { 
        int i, result = 0; 
        for (i = 0; i < tamaño; i++) { 
            result += v[i]; 
        } 
        return result; 
    }

    public int minimo(int[] v) { 
        int min = v[0]; 
        for (int i = 1; i < v.length; i++) { 
            if (v[i] < min) { 
                min = v[i]; 
                } 
            } 
        return min; 
    }





}
