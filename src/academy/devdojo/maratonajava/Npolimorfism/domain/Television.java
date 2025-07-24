package academy.devdojo.maratonajava.Npolimorfism.domain;

public class Television extends Product{
    public static final double TAX_PERCENTAGE = 0.21;
    public Television(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTax() {
        System.out.println("Calculando imposto da televisão: ");
        return this.price * TAX_PERCENTAGE;
    }
}
