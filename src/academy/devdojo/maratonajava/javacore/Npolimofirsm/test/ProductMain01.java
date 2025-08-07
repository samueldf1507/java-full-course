package academy.devdojo.maratonajava.javacore.Npolimofirsm.test;

import academy.devdojo.maratonajava.javacore.Npolimofirsm.domain.Computer;
import academy.devdojo.maratonajava.javacore.Npolimofirsm.domain.Telivision;
import academy.devdojo.maratonajava.javacore.Npolimofirsm.domain.Tomatoe;
import academy.devdojo.maratonajava.javacore.Npolimofirsm.service.CalculatorTaxes;

public class ProductMain01 {
    public static void main(String[] args) {
        Computer computer = new Computer("NUC10i7", 11000);
        Tomatoe tomatoe = new Tomatoe("Tomate Siciliano", 10);
        Telivision tv = new Telivision("Samsung 50\" ", 5000);
        CalculatorTaxes.calculateTax(computer);
        System.out.println(" ");
        CalculatorTaxes.calculateTax(tomatoe);
        System.out.println(" ");
        CalculatorTaxes.calculateTax(tv);
    }
}
