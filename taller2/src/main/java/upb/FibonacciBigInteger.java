package upb;

import java.math.BigInteger;
import upb.resources.utils.Timer;

public class FibonacciBigInteger {
     public static void main(String[] args) {
        int n = 3000;
        Timer timer = new Timer();
        timer.start();

        System.out.println("Fibonacci de " + n + " es: " + fibonacciBigInteger(n));
        timer.stop();
        System.out.println("Tiempo de ejecución: " + timer.getElapsedTime() + " ns");
    }

    public static BigInteger fibonacciBigInteger(int n) {
        if (n <= 1) {
            return BigInteger.valueOf(n);
        }

        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        BigInteger c = BigInteger.ZERO;

        for (int i = 2; i <= n; i++) {
            c = a.add(b);
            a = b;
            b = c;
        }

        return b;
    }
}
