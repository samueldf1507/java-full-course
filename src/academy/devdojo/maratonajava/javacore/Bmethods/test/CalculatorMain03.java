package academy.devdojo.maratonajava.javacore.Bmethods.test;

import academy.devdojo.maratonajava.javacore.Bmethods.domain.Calculator;

public class CalculatorMain03 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int n1 = 1;
        int n2 = 2;
        calculator.changeTwoNumbers(n1, n2);

        System.out.println("------------");

        System.out.println("Dentro de CalculatorMain03");
        System.out.println(n1);
        System.out.println(n2);
    }
}
