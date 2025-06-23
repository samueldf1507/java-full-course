package academy.devdojo.maratonajava.javacore.Bmethods.domain;

public class Calculator {
    public void sumTwoNumbers() {
        System.out.println(10 + 10);
    }

    public void subtractTwoNumbers() {
        System.out.println(21 - 2);
    }

    public void multiplyNumbers(int number1, int number2) {
        int result = number1 * number2;
        System.out.println(result);
    }

    public double divideTwoNumbers(double number1, double number2) {
        if (number2 > 0) {
            return number1 / number2;
        }
        System.out.println("Não é possível dividir po zero");
        return 0;
    }

    public void printDivisionBetweenNumbers(double n1, double n2) {
        if (n2 == 0) {
            System.out.println("Não existe divisão por zero!");
            return;
        }
        System.out.println(n1 / n2);
    }

    public void changeTwoNumbers(int number1, int number2) {
        number1 = 99;
        number2 = 33;
        System.out.println("Dentro do changeTwoNumbers");
        System.out.println("Número 1: " + number1);
        System.out.println("Número2: " + number2);

    }

    public void sumArray(int[] numbers) {
        int sum = 0;
        for (int number: numbers) {
            sum += number;
        }
        System.out.println(sum);
    }

    public void sumVarArgs(String message, int... numbers) {
        int sum = 0;
        for (int number: numbers) {
            sum += number;
        }
        System.out.println(sum);
        System.out.println(message);
    }
}
