package sorting;

/**
 * @author Subhomoy Haldar
 * @version 02-10-2016
 */
public class BubbleSort implements Sort {
    @Override
    public void sort(int[] a, int p, int r) {
        int iLimit = r - 1;
        int jLimit = r + p - 1;
        for (int i = p; i < iLimit; i++) {
            boolean swapped = false;
            for (int j = p; j < jLimit - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
