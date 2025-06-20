package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        //Imprima os primeiros 25 valores de um determinado valor

        int value = 50;
        for (int i = 0; i < value; i++) {
            if (i  > 25) {
                break;
            }
            System.out.println(i);

        }
    }
}
