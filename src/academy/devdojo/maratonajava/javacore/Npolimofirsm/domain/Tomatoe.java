package academy.devdojo.maratonajava.javacore.Npolimofirsm.domain;

public class Tomatoe extends Product{
    public static final double TAX_PERCENTACE = 0.21;
    private String dataValidade;

    public Tomatoe(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTax() {
        System.out.println("Calculando imposto do tomate");
        return this.price * TAX_PERCENTACE;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
