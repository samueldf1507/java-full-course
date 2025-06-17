package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        //+ - * /

        int number1 = 10;
        int number2 = 20;
        int sub = number2 - number1;
        int mul = number1 * number2;
        System.out.println(number1 + number2 + " Valor: " + number1+number2);
        System.out.println(sub);
        System.out.println(mul);

        // %
        int left = 19 % 2;
        System.out.println(left);

        // < > <= >= == !=

        boolean is10GreaterThan20 = 10 > 20;
        System.out.println(is10GreaterThan20);

        boolean is10Equal20 = 10 == 20;
        System.out.println(is10GreaterThan20);

    }
}
