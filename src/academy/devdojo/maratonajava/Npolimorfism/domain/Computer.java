package academy.devdojo.maratonajava.Npolimorfism.domain;

public class Computer extends Product {
    public static final double TAX_PERCENTAGE = 0.21;
    public Computer(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTax() {
        System.out.println("Calculando imposto do computador");
        return this.price * TAX_PERCENTAGE;
    }


}
