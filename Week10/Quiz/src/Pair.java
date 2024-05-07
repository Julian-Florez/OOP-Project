/**
 * Represents a key-value pair.
 */
public class Pair<T> {
    private T key;
    private T value;
    
    /**
     * Constructs a Pair object with the given key and value.
     * 
     * @param key   the key of the pair
     * @param value the value of the pair
     */
    public Pair(T key, T value) {
        this.key = key;
        this.value = value;
    }

    /**
     * Returns the key of the pair.
     * 
     * @return the key of the pair
     */
    public T getKey() {
        return key;
    }

    /**
     * Returns the value of the pair.
     * 
     * @return the value of the pair
     */
    public T getValue() {
        return value;
    }

    /**
     * Swaps the key and value of the pair.
     */
    public void swapPair() {
        T temp = key;
        key = value;
        value = temp;
    }

    /**
     * Returns a string representation of the pair.
     * 
     * @return a string representation of the pair
     */
    public String toString() {
        return "Key: " + key + ", Value: " + value;
    }
}
