package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        //Imprima todos os números pares de 0 até 100000

        for (int i = 0; i < 1000001; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "");
            }

        }
    }
}
