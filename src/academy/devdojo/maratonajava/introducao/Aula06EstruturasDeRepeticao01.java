package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        //While, Do While, For
        int counter = 7;
        while (counter < 10) {
            System.out.println(counter++);
        }

        do {
            System.out.println("Dentro do do-while");
        }while (counter < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("For " +i);
            
        }
    }
}
