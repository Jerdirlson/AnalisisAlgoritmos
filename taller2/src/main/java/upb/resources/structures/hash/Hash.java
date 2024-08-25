package upb.resources.structures.hash;

import java.math.BigInteger;

public class Hash {
    private static final int TABLE_SIZE = 1000;
    private Node[] table;

    public Hash() {
        table = new Node[TABLE_SIZE];
    }

    public void put(int key, BigInteger value) {
        int index = key % TABLE_SIZE;
        Node node = table[index];
        if (node == null) {
            table[index] = new Node(key, value);
        } else {
            while (node.next != null && node.key != key) {
                node = node.next;
            }
            if (node.key == key) {
                node.value = value;
            } else {
                node.next = new Node(key, value);
            }
        }
    }

    public BigInteger get(int key) {
        int index = key % TABLE_SIZE;
        Node node = table[index];
        while (node != null) {
            if (node.key == key) {
                return node.value;
            }
            node = node.next;
        }
        return null;
    }

    private static class Node {
        int key;
        BigInteger value;
        Node next;

        Node(int key, BigInteger value) {
            this.key = key;
            this.value = value;
        }
    }
}
