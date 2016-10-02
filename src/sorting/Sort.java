package sorting;

/**
 * @author Subhomoy Haldar
 * @version 02-10-2016
 */
public interface Sort {
    default void sort(int[] a) {
        sort(a, 0, a.length);
    }

    void sort(int[] a, int p, int r);
}
