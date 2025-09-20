package unifor.poo.binarysearch;

public class BinarySearchMain {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9};
        System.out.println(binarySearch(array, 3));
        System.out.println(binarySearch(array, -1));


    }

    public static int binarySearch(int[] matrix, int item) {
         int low = 0;
         int high = matrix.length - 1;

         while (low <= high) {
             int avarage = (high + low) / 2;
             int guess = matrix[avarage];
             if (guess == item) {
                 return avarage;
             }

             if (guess > item) {
                 high = avarage - 1;
             } else {
                 low = avarage + 1;
             }
         }
         return -1;
    }
}
