/**
 * Represents a key-value pair.
 */
public class Pair {
    private int key;
    private int value;
    
    /**
     * Constructs a Pair object with the given key and value.
     * 
     * @param key   the key of the pair
     * @param value the value of the pair
     */
    public Pair(int key, int value) {
        this.key = key;
        this.value = value;
    }

    /**
     * Returns the key of the pair.
     * 
     * @return the key of the pair
     */
    public int getKey() {
        return key;
    }

    /**
     * Returns the value of the pair.
     * 
     * @return the value of the pair
     */
    public int getValue() {
        return value;
    }

    /**
     * Swaps the key and value of the pair.
     */
    public void swapPair() {
        int temp = key;
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
