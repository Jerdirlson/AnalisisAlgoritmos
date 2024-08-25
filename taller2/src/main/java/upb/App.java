package upb;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        int prev = 0;
        int actual = 1;
        int result = 0;
        while (actual < 200) {
            result = prev + actual;
            System.out.println(result);
            prev = actual;
            actual = result;
        }
    }
}
