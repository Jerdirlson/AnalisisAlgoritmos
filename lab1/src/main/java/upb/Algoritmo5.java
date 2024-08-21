package upb;

import java.util.Iterator;

import resources.structures.doublee.linked.DoubleLinkedList;
import resources.structures.interfaces.node.NodeInterface;

public class Algoritmo5 {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        int objetivo = 10;

        for (int i = 1; i <= 2000; i++) {
            list.add(i);
        }

        long startTime = System.nanoTime();

        findPairs(list, objetivo);

        long endTime = System.nanoTime();

        long duration = endTime - startTime;


        System.out.println("El algoritmo de ordenamiento por inserción tardó: " + duration + " milisegundos");
    }

    private static void findPairs(DoubleLinkedList<Integer> list, int objetivo) {
        Iterator<NodeInterface<Integer>> iterator1 = list.iterator();
        while (iterator1.hasNext()) {
            NodeInterface<Integer> node1 = iterator1.next();
            Iterator<NodeInterface<Integer>> iterator2 = list.iterator();
            while (iterator2.hasNext()) {
                NodeInterface<Integer> node2 = iterator2.next();
                if (node1 != node2 && node1.getObject() + node2.getObject() == objetivo) {
                    System.out.println("(" + node1.getObject() + ", " + node2.getObject() + ")");
                    // Remover el par para evitar duplicados
                    removePair(list, node1, node2);
                }
            }
        }
    }

    private static void removePair(DoubleLinkedList<Integer> list, NodeInterface<Integer> node1, NodeInterface<Integer> node2) {
        list.remove(node1.getObject());
        list.remove(node2.getObject());
    }

    //500 32384313
    //1000 53863858
    //1500 99646109
    //2000 101213515
    //2500 126133115
    //3000 147803731


}
