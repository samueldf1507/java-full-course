package academy.devdojo.maratonajava.javacore.Bmethods.test;

import academy.devdojo.maratonajava.javacore.Bmethods.domain.Calculator;

public class CalculatorMain04 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int[] numbers = {1, 2, 3, 4, 5};

        calculator.sumArray(numbers);
        calculator.sumVarArgs("Oi", 2, 3, 4, 5);

    }
}
