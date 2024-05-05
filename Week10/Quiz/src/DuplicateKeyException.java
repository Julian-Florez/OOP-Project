/**
 * Exception thrown when a duplicate key is encountered.
 */
public class DuplicateKeyException extends Exception {

    /**
     * Constructs a new DuplicateKeyException with the specified detail message.
     *
     * @param message the detail message
     */
    public DuplicateKeyException(String message) {
        super(message);
    }

}
