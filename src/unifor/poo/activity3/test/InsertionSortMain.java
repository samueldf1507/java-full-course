package unifor.poo.activity3.test;

import unifor.poo.activity3.domain.InsertionSort;

public class InsertionSortMain {
    public static void main(String[] args) {
        int[] array = {8, 5, 7, 3, 2};
        insertionSort(array, array.length);


    }
    public static void insertionSort(int[] A, int n) {
        for (int i = 1; i < n; i++) {
            int x = A[i];
            int j = i - 1;
            while (j >= 0 && A[j] > x) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = x;
        }

        for (int j : A) {
            System.out.print(j + " ");
        }
    }
}
