package sorting;

/**
 * @author Subhomoy Haldar
 * @version 02-10-2016
 */
public class SelectionSort implements Sort {
    @Override
    public void sort(int[] a, int p, int r) {
        int iLimit = r - 1;
        for (int i = p; i < iLimit; i++) {
            int pos = i;
            int min = a[i];
            for (int j = i + 1; j < r; j++) {
                if (min > a[j]) {
                    min = a[j];
                    pos = j;
                }
            }
            if (pos == i) continue;
            a[pos] = a[i];
            a[i] = min;
        }
    }
}
