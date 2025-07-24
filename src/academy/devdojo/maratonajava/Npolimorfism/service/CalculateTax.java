package academy.devdojo.maratonajava.Npolimorfism.service;

import academy.devdojo.maratonajava.Npolimorfism.domain.Computer;
import academy.devdojo.maratonajava.Npolimorfism.domain.Product;
import academy.devdojo.maratonajava.Npolimorfism.domain.Tomate;

public class CalculateTax {
//    public static void calculateComputerTax(Computer computer) {
//        System.out.println("Relatório de imposto do computador");
//        double tax = computer.calculateTax();
//        System.out.println("Computador: " + computer.getName());
//        System.out.println("Valor: " + computer.getPrice());
//        System.out.println("Imposto a ser pago: " + tax);
//    }

//    public static void calculateTomateTax(Tomate tomate) {
//        System.out.println("Relatório de imposto do computador");
//        double tax = tomate.calculateTax();
//        System.out.println("Computador: " + tomate.getName());
//        System.out.println("Valor: " + tomate.getPrice());
//        System.out.println("Imposto a ser pago: " + tax);
//    }

    public static void calculateTax(Product product) {
        System.out.println("Relatório do produto: ");
        double tax = product.calculateTax();
        System.out.println("Produto: " + product.getName());
        System.out.println("Preço: " + product.getPrice());
        System.out.println("Imposto a ser pago: " + tax);
        if (product instanceof Tomate) {
            String dataValidade = ((Tomate) product).getDataValidade();
            System.out.println(dataValidade);
        }

    }
}
