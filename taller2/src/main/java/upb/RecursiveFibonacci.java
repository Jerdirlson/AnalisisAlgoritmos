package upb;
import java.math.BigInteger;
import upb.resources.utils.Timer;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        int n = 500;
        Timer timer = new Timer();
        timer.start();
        System.out.println("Fibonacci de " + n + " es: " + fibonacciRecursivo(BigInteger.valueOf(n)));

        timer.stop();

        System.out.println("Tiempo de ejecución: "  + timer.getElapsedTime() + " ns");
    }

    public static BigInteger fibonacciRecursivo(BigInteger n) {
        if (n.compareTo(BigInteger.ONE) <= 0) {
            return n;
        }

        return fibonacciRecursivo(n.subtract(BigInteger.ONE)).add(fibonacciRecursivo(n.subtract(BigInteger.TWO)));
    }
}