package academy.devdojo.maratonajava.Npolimorfism.test;

import academy.devdojo.maratonajava.Npolimorfism.domain.Computer;
import academy.devdojo.maratonajava.Npolimorfism.domain.Product;
import academy.devdojo.maratonajava.Npolimorfism.domain.Tomate;
import academy.devdojo.maratonajava.Npolimorfism.service.CalculateTax;

public class ProductMain02 {
    public static void main(String[] args) {
        Product product = new Computer("Ryzen 9", 3000);
        Product product2 = new Tomate("Tomate Americano", 20);
        CalculateTax.calculateTax(product);
        System.out.println("--------------");
        CalculateTax.calculateTax(product2);


    }
}
