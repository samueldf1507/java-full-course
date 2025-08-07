package academy.devdojo.maratonajava.javacore.Npolimofirsm.test;

import academy.devdojo.maratonajava.javacore.Npolimofirsm.domain.Computer;
import academy.devdojo.maratonajava.javacore.Npolimofirsm.domain.Product;
import academy.devdojo.maratonajava.javacore.Npolimofirsm.domain.Tomatoe;
import academy.devdojo.maratonajava.javacore.Npolimofirsm.service.CalculatorTaxes;

public class ProductMain03 {
    public static void main(String[] args) {
        Product product = new Computer("Ryzen 9", 5000);
        Tomatoe tomatoe = new Tomatoe("Americano", 20);
        tomatoe.setDataValidade("11/12/2021");



        CalculatorTaxes.calculateTax(tomatoe);
        System.out.println();
        CalculatorTaxes.calculateTax(product);

    }
}
