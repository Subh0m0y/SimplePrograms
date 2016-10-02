package sorting;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.testng.Assert.*;

/**
 * @author Subhomoy Haldar
 * @version 02-10-2016
 */
public class SortTest {
    private static final int SIZE = 50_00_000;
    private static final int P = SIZE / 10;
    private static final int R = P * 5;
    private Sort sort;
    private int[] a, b, c;

    @Before
    public void setup() {
        // Change this line below to change the algorithm
        sort = new QuickSort();
        // Rest is for setup
        a = new int[SIZE];  // The array to be shuffled and sorted fully
        b = new int[SIZE];  // The array to be shuffled and sorted partly
        c = new int[SIZE];  // An identical, sorted array

        System.out.println("Starting array creation.");
        for (int i = 0; i < SIZE; i++) {
            a[i] = b[i] = c[i] = i + 1;
        }
        // Shuffle and prepare for testing
        System.out.println("Array creation complete. Starting shuffling");
        shuffle(a, 0, SIZE);
        shuffle(b, P, R);
        System.out.println("Shuffling complete. Setup complete.");
    }

    /**
     * Shuffles the given array using the Fischer-Yates algorithm.
     *
     * @param a The array to be shuffled.
     * @param p The starting index (inclusive).
     * @param r The ending index (exclusive).
     */
    private static void shuffle(int[] a, int p, int r) {
        Random random = new Random();
        for (int i = p; i < r; i++) {
            int j = random.nextInt(r - i) + i;
            int temp = a[j];
            a[j] = a[i];
            a[i] = temp;
        }
    }

    @Test
    public void testSort() throws Exception {
        System.out.println("Starting sorting (full).");
        sort.sort(a);
        System.out.println("Sorting complete. (full).");
        System.out.println("Starting sorting (partial).");
        sort.sort(b, P, R);
        System.out.println("Sorting complete. (partial).");
        assertEquals(a, c);
        assertEquals(b, c);
        System.out.println("Verification complete.");
    }
}