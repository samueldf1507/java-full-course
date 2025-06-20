package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        //Dado um valor de um carro, descubra em quantas vezes ele pode ser parcelado
        //Condição valorParcela >= 1000

        double totalPrice = 30000;
        for (int i = 0; i < totalPrice; i++) {
            double parcela = totalPrice / i;
            if (parcela < 1000) {
                break;
            }
            System.out.println("Parcela: " + i + " R$ " + parcela);
            System.out.println("Dentro for, mas fora do if");

        }
    }
}
