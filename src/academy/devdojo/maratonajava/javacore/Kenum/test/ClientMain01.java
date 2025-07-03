package academy.devdojo.maratonajava.javacore.Kenum.test;
import academy.devdojo.maratonajava.javacore.Kenum.domain.PaymentType;
import academy.devdojo.maratonajava.javacore.Kenum.domain.Client;
import academy.devdojo.maratonajava.javacore.Kenum.domain.ClientType;

public class ClientMain01 {
    public static void main(String[] args) {
        Client client1 = new Client("Tsubasa", ClientType.PESSOA_FISICA, PaymentType.DEBITO);
        Client client2 = new Client("Akira", ClientType.PESSOA_JURIDICA, PaymentType.CREDITO);


        System.out.println(client1);
        System.out.println(client2);
        System.out.println(PaymentType.DEBITO.calculateDiscount(100));
        System.out.println(PaymentType.CREDITO.calculateDiscount(100));


    }
}
