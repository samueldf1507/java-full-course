package unifor.poo.activity6.test;

import java.util.Arrays;

public class Conjunto {
    public static void main(String[] args) {
        int[] conjuntos = {1, 2, 3, 4, 5};
        double mediana;
        if (conjuntos.length % 2 == 1) {
            mediana = conjuntos[conjuntos.length / 2];
        } else {
            mediana = (conjuntos[(conjuntos.length / 2) - 1] + conjuntos[conjuntos.length / 2]) / 2.0;
        }

        System.out.println("Mediana = " + mediana);
    }
}

