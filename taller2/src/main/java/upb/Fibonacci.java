package upb;

import upb.resources.structures.doublee.linked.DoubleLinkedList;
import upb.resources.structures.interfaces.node.NodeInterface;
import java.util.Iterator;
import upb.resources.utils.Timer;

public class Fibonacci {

    public static void main(String[] args) {
        int n = 3000;
        Timer timer = new Timer();
        timer.start();

        DoubleLinkedList<Integer> fibonacci = fibonacci(n);
        timer.stop();
        System.out.println("Tiempo de ejecución: " + timer.getElapsedTime() + " ns");
        // Iterator<NodeInterface<Integer>> it = fibonacci.iterator();
        // while (it.hasNext()) {
        //     System.out.println(it.next().getObject());
        // }
    }

    public static DoubleLinkedList<Integer> fibonacci(int n) {
        if (n == 0) {
            return createSingleDigitList(0);
        }
        if (n == 1) {
            return createSingleDigitList(1);
        }

        DoubleLinkedList<Integer> a = createSingleDigitList(0);
        DoubleLinkedList<Integer> b = createSingleDigitList(1);

        for (int i = 2; i <= n; i++) {
            DoubleLinkedList<Integer> c = addLargeNumbers(a, b);
            a = b;
            b = c;
        }

        return b;
    }

    public static DoubleLinkedList<Integer> addLargeNumbers(DoubleLinkedList<Integer> num1, DoubleLinkedList<Integer> num2) {
        DoubleLinkedList<Integer> result = new DoubleLinkedList<>();
        int carry = 0;

        int size1 = num1.size();
        int size2 = num2.size();
        int maxSize = Math.max(size1, size2);

        for (int i = 0; i < maxSize; i++) {
            int digit1 = i < size1 ? num1.getIndex(size1 - 1 - i) : 0;
            int digit2 = i < size2 ? num2.getIndex(size2 - 1 - i) : 0;

            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            result.addOnHead(sum % 10);
        }

        if (carry != 0) {
            result.addOnHead(carry);
        }

        return result;
    }

    public static DoubleLinkedList<Integer> createSingleDigitList(int digit) {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.add(digit);
        return list;
    }
}
