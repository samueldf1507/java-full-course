package academy.devdojo.maratonajava.Npolimorfism.test;

import academy.devdojo.maratonajava.Npolimorfism.domain.Computer;
import academy.devdojo.maratonajava.Npolimorfism.domain.Television;
import academy.devdojo.maratonajava.Npolimorfism.domain.Tomate;
import academy.devdojo.maratonajava.Npolimorfism.service.CalculateTax;

public class ProductMain01 {
    public static void main(String[] args) {
        Computer computer = new Computer("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);
        //CalculateTax.calculateComputerTax(computer);
        System.out.println("--------------------");
        //CalculateTax.calculateTomateTax(tomate);

        Television television = new Television("Samsung 50\" ", 5000);
        CalculateTax.calculateTax(television);

    }
}
