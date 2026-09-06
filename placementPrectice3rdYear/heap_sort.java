public class heap_sort {

    static void maxHeap(int[] a, int n, int i) {

        int larger = i;

        int l = 2 * i;
        int r = 2 * i + 1;

        if (l <= n && a[l] > a[larger]) {
            larger = l;
        }

        if (r <= n && a[r] > a[larger]) {
            larger = r;
        }

        if (larger != i) {

            int temp = a[i];
            a[i] = a[larger];
            a[larger] = temp;

            maxHeap(a, n, larger);
        }
    }

    static void sortHeap(int[] a, int n) {

        // Build Max Heap
        for (int i = n / 2; i >= 1; i--) {
            maxHeap(a, n, i);
        }

        // Sorting
        for (int i = n; i >= 2; i--) {

            int temp = a[1];
            a[1] = a[i];
            a[i] = temp;

            maxHeap(a, i - 1, 1);
        }
    }

    public static void main(String[] args) {

        // index 0 is dummy
        int[] a = {0, 12, 13, 53, 11, 52};

        sortHeap(a, a.length - 1);

        for (int i = 1; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}