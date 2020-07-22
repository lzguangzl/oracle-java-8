package comments;

/**
 * This is JavaDoc Comments
 *
 * @author zguang
 */
public class Main {

    /**
     * This is main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Printing size of arguments
        System.out.println("args-size=" + args.length);

        /* Add arguments by going to edit configuration of Main */
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "]=" + args[i]);
        }

        System.out.println("Sum="+sum(1,2));
    }

    /**
     * Calculate sum of two integers
     *
     * @param a int
     * @param b int
     * @return a + b int
     */
    public static int sum(int a, int b) {
        return a + b;
    }

}
