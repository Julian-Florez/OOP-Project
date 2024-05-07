import java.util.ArrayList;

/**
 * The PairManager class represents a manager for a collection of Pair objects.
 * It provides methods to add pairs, retrieve pairs by key, and convert the pairs to a string representation.
 */
public class PairManager<T> {
    private ArrayList<Pair<T>> pairs;


    /**
     * Constructs a new PairManager object with an empty list of pairs.
     */
    public PairManager() {
        pairs = new ArrayList<>();
    }

    /**
     * Adds a Pair object to the PairManager.
     * 
     * @param pair the Pair object to be added
     * @throws DuplicateKeyException if a Pair with the same key already exists in the PairManager
     */
    public void addPair(Pair<T> pair) throws DuplicateKeyException {
        T key = pair.getKey();
        for (Pair<T> p : pairs) {
            if (p.getKey() == key) {
                throw new DuplicateKeyException("Duplicate key: " + key);
            }
        }
        pairs.add(pair);
    }


    /**
     * Returns a Pair object with the specified key.
     * 
     * @param key the key to search for
     * @return the Pair object with the specified key, or null if not found
     */
    public Pair<T> getPairByKey(T key) {
        for (Pair<T> pair : pairs) {
            if (pair.getKey().equals(key)) {
                return pair;
            }
        }
        return null;
    }

    /**
     * Returns a string representation of the PairManager object.
     * 
     * @return a string representation of the PairManager object.
     */
    public String toString() {
        String result = "";
        for (Pair<T> pair : pairs) {
            result += pair.toString() + "\n";
        }
        return result;
    }
}