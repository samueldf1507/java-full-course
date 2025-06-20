package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int age = 15;
        boolean ableToBuyAlcohol = age >= 18;
        if (ableToBuyAlcohol) {
            System.out.println("Autorizado a comprar alcool");
        } else {
            System.out.println("Não autorizado a comprar alcool");
        }

        if (!ableToBuyAlcohol) {
            System.out.println("Não autorizado a comprar alcool");
        }

        boolean c = false;
        if (c == true) {
            System.out.println("Dentro de algo que nunca deve ser feito");
        }

        System.out.println("Fora do if");
    }
}
