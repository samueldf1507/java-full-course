package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[4];

        for (int[] array: arrayInt) {
            for (int num: array) {
                System.out.println(num);
            }
        }

        System.out.println("---------------");

        int[][] arrayInt2 = {{1, 2, 3}, {5, 6, 7}, {8, 9}};
        for (int i = 0; i < arrayInt2.length; i++) {
            for (int j = 0; j < arrayInt2[i].length; j++) {
                System.out.println(arrayInt2[i][j]);
            }

        }
    }
}
