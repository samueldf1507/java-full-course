package academy.devdojo.maratonajava.javacore.Npolimofirsm.domain;

public class Telivision extends Product {
    public static final double TAX_PERCENTACE = 0.21;
    public Telivision(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTax() {
        System.out.println("Calculando imposto da televisão");
        return this.price * TAX_PERCENTACE;
    }
}
