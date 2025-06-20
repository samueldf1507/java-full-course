package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        //Dado um valor de um carro, descubra em quantas vezes ele pode ser parcelado
        //Condição valorParcela >= 1000

        double totalPrice = 30000;
        for (int i = (int )totalPrice; i >= 1; i--) {
            double parcela = totalPrice / i;
            if (parcela < 1000) {
                continue;
            }
            System.out.println("Parcela: " + i + " R$ " + parcela);


        }
    }
}
