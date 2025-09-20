package unifor.poo.activity6.test;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = input.nextInt();
            }
        }
        int repeatMore = matriz[0][0];
        int count = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                int actual = matriz[i][j];
                int count2 = 0;

                for (int k = 0; k < matriz.length; k++) {
                    for (int l = 0; l < matriz.length; l++) {
                        if (matriz[k][l] == actual) {
                            count2++;
                        }
                    }
                }
                if (count2 > count) {
                    count = count2;
                    repeatMore = actual;
                }
            }

        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(" [ " + matriz[i][j] + " ] ");
            }

        }

        System.out.println(repeatMore);
        System.out.println(count);
    }
}
