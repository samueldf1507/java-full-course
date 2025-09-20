package unifor.poo.activity5;

public class Main {
    public static void main(String[] args) {
        int[] array = {99, 13, 9, 10, 12};
        bubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
    }
    private static void bubbleSort(int[] array) {
        boolean traded;
        for (int i = 0; i < array.length - 1; i++) {
            traded = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    traded = true;
                }
            }
            if (!traded) {
                break;
            }
        }
    }
}


