package sorting;

/**
 * @author Subhomoy Haldar
 * @version 02-10-2016
 */
public class QuickSort implements Sort {
    @Override
    public void sort(int[] a, int p, int r) {
        qSort(a, p, r - 1);
    }

    private static void qSort(int[] a, int p, int r) {
        if (p >= r) return;
        int q = partition(a, p, r);
        qSort(a, p, q - 1);
        qSort(a, q + 1, r);
    }

    private static int partition(int[] a, int p, int r) {
        int pivot = a[p];
        int s = p + 1, e = r;
        while (e >= p && s <= r) {
            while (s <= r && a[s] <= pivot) {
                s++;
            }
            while (e >= p && a[e] > pivot) {
                e--;
            }
            if (s >= e) break;
            int temp = a[s];
            a[s] = a[e];
            a[e] = temp;
        }
        // put the pivot in place
        a[p] = a[e];
        a[e] = pivot;
        return e;
    }
}
