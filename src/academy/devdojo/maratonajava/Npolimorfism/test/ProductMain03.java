package academy.devdojo.maratonajava.Npolimorfism.test;

import academy.devdojo.maratonajava.Npolimorfism.domain.Computer;
import academy.devdojo.maratonajava.Npolimorfism.domain.Product;
import academy.devdojo.maratonajava.Npolimorfism.domain.Tomate;
import academy.devdojo.maratonajava.Npolimorfism.service.CalculateTax;

public class ProductMain03 {
    public static void main(String[] args) {
        Product product = new Computer("Ryzen 9", 3000);
        Tomate tomate = new Tomate("Tomate Americano", 20);
        tomate.setDataValidade("11/12/2021");

        CalculateTax.calculateTax(tomate);
        System.out.println("------------------------");
        CalculateTax.calculateTax(product);

    }
}
