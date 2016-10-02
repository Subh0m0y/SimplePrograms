package sorting;

/**
 * @author Subhomoy Haldar
 * @version 02-10-2016
 */
public class MergeSort implements Sort {
    @Override
    public void sort(int[] a, int p, int r) {
        mSort(a, p, r - 1);
    }

    private static void mSort(int[] a, int p, int r) {
        if (p == r) return;
        int q = ((p + r) / 2) + 1;
        mSort(a, p, q - 1);
        mSort(a, q, r);
        merge(a, p, q, r);
    }

    private static void merge(int[] a, int p, int q, int r) {
        int l = r - p + 1;
        int[] b = new int[l];
        int i1 = p, i2 = q, i = 0;
        while (i1 < q && i2 <= r) {
            if (a[i1] <= a[i2]) {
                b[i++] = a[i1++];
            } else {
                b[i++] = a[i2++];
            }
        }
        while (i1 < q) {
            b[i++] = a[i1++];
        }
        while (i2 <= r) {
            b[i++] = a[i2++];
        }
        // copy the merged elements back
        System.arraycopy(b, 0, a, p, l);
    }
}
