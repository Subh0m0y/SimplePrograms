package datastructures;

/**
 * @author Subhomoy Haldar
 * @version 09-10-2016
 */
public class CapacityException extends Exception {
    private final String message;

    public CapacityException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return CapacityException.class.getSimpleName() +
                " : " + message;
    }
}
