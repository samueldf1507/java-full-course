package academy.devdojo.maratonajava.javacore.Npolimofirsm.domain;

public class Computer extends Product {
    public static final double TAX_PERCENTACE = 0.21;
    public Computer(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTax() {
        System.out.println("Calculando imposto do computador");
        return this.price * TAX_PERCENTACE;
    }


}
