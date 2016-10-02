package sorting;

/**
 * @author Subhomoy Haldar
 * @version 02-10-2016
 */
public class InsertionSort implements Sort {
    @Override
    public void sort(int[] a, int p, int r) {
        for (int i = p + 1; i < r; i++) {
            int n = a[i];
            int j = i;
            while (j > 0 && a[j - 1] > n) {
                j--;
            }
            System.arraycopy(a, j, a, j + 1, i - j);
            a[j] = n;
        }
    }
}
