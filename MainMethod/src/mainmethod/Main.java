package mainmethod;

public class Main {

    /* Main method */
    public static void main(String[] args) {
        System.out.println("args-size=" + args.length);

        /* Add arguments by going to edit configuration of Main */
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "]=" + args[i]);
        }
    }

}
