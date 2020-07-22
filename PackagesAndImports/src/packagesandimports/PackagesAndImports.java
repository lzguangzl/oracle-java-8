package packagesandimports;

// importing package to use sum
import a.b.c.TestImport;
// importing package to use random
import java.util.Random;

public class PackagesAndImports {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Random Number=" + random.nextInt(5));
        System.out.println("Sum of two integers=" + TestImport.sum(1, 2));

    }
}
