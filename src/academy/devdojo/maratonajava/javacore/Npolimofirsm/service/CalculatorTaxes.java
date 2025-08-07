package academy.devdojo.maratonajava.javacore.Npolimofirsm.service;

import academy.devdojo.maratonajava.javacore.Npolimofirsm.domain.Computer;
import academy.devdojo.maratonajava.javacore.Npolimofirsm.domain.Product;
import academy.devdojo.maratonajava.javacore.Npolimofirsm.domain.Tomatoe;

public class CalculatorTaxes {

    public static void calculateTax(Product product) {
        System.out.println("Relatório de imposto");
        double tax = product.calculateTax();
        System.out.println("Produto: " + product.getName());
        System.out.println("Preço: " + product.getPrice());
        System.out.println("Imposto a ser pago: " + tax);
        if (product instanceof Tomatoe) {
            Tomatoe tomatoe  = (Tomatoe) product;
            System.out.println(tomatoe.getDataValidade());
        }


    }
}
