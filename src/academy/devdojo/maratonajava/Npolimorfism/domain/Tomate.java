package academy.devdojo.maratonajava.Npolimorfism.domain;

public class Tomate extends Product{
    public static final double TAX_PERCENTAGE = 0.6;
    private String dataValidade;
    public Tomate(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTax() {
        System.out.println("Calculando imposto do tomate...");
        return this.price * TAX_PERCENTAGE;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
