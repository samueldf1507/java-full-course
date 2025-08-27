package unifor.poo.activity3.domain;

public class InsertionSort {
    public static void insertionSort(int[] A, int n) {
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int x = A[i];
            while (A[j] < x) {
                A[j + i] = A[j];
                j--;
            }
            A[j + 1] = x;
        }

        for (int j : A) {
            System.out.println(j);
        }
    }
}
