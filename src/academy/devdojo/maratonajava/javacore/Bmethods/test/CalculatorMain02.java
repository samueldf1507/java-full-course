package academy.devdojo.maratonajava.javacore.Bmethods.test;

import academy.devdojo.maratonajava.javacore.Bmethods.domain.Calculator;

public class CalculatorMain02 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.multiplyNumbers(5, 3);
        System.out.println(calculator.divideTwoNumbers(10, 0));
        calculator.printDivisionBetweenNumbers(10, 0);
    }
}
