package upb;

import java.math.BigInteger;
import upb.resources.structures.hash.HashMap;
import upb.resources.utils.Timer;

public class FibonacciHash {
    private static HashMap cache = new HashMap();

    public static void main(String[] args) {
        int n = 2500;
        Timer timer = new Timer();
        timer.start();
        System.out.println("Fibonacci de " + n + " es: " + fibonacciRecursivo(n));
        timer.stop();

        System.out.println("Tiempo de ejecución: "  + timer.getElapsedTime() + " ns");
    }

    public static BigInteger fibonacciRecursivo(int n) {
        if (n <= 1) {
            return BigInteger.valueOf(n);
        }

        BigInteger cachedValue = cache.get(n);
        if (cachedValue != null) {
            return cachedValue;
        }

        BigInteger result = fibonacciRecursivo(n - 1).add(fibonacciRecursivo(n - 2));

        cache.put(n, result);

        return result;
    }
}