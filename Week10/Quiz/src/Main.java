/**
 * The Main class is the entry point of the program.
 * It demonstrates the usage of the PairManager class by adding pairs of integers
 * and handling a DuplicateKeyException if a duplicate key is encountered.
 */
public class Main {
    public static void main(String[] args) throws Exception {

        PairManager pairManager = new PairManager();

        try {
            pairManager.addPair(new Pair(1, 10));
            pairManager.addPair(new Pair(2, 20));
            pairManager.addPair(new Pair(3, 30));
            pairManager.addPair(new Pair(1, 40)); // This will throw DuplicateKeyException
        } catch (DuplicateKeyException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println(pairManager.toString());
    }
}
