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
        boolean is10LowerThan20 = 10 < 20;
        boolean is10Equal20 = 10 == 20;
        boolean is10DifferentThan20 = 10 != 20;
        boolean is10DifferentThan10 = 10 != 10;
        System.out.println(is10GreaterThan20);
        System.out.println(is10LowerThan20);
        System.out.println(is10DifferentThan10);
        System.out.println(is10DifferentThan20);
        System.out.println(is10Equal20);

        // &&(AND)  ||(OR)  !(NOT)
        int age = 29;
        float salary = 3500F;
        boolean isInsideLaw = age > 30 && salary >= 4612;
        boolean isInsideLaw2 = age < 30 && salary >= 3381;

        System.out.println(isInsideLaw);
        System.out.println(isInsideLaw2);

        double valorContaCorrente = 200;
        double valorContaPoupanca = 10000;
        float ps5Price = 5000F;

        boolean isPs5Buyable = valorContaCorrente > ps5Price || valorContaPoupanca > ps5Price;
        System.out.println(isPs5Buyable);

        // =  +=  -=  *=  /=  %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        System.out.println(bonus);

        // ++  --
        int counter = 0;
        counter += 1; // counter = counter + 1
        counter++;
        counter--;
        ++counter;
        --counter;
        System.out.println(counter);

        int counter2 = 0;
        System.out.println(++counter2);

    }
}
