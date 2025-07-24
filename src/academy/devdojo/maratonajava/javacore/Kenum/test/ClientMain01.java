package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.domain.Client;
import academy.devdojo.maratonajava.javacore.Kenum.domain.ClientType;

import academy.devdojo.maratonajava.javacore.Kenum.domain.PaymentType;

public class ClientMain01 {
    public static void main(String[] args) {
        Client client1 = new Client("Samuel", ClientType.LEGAL_PERSON, PaymentType.CREDIT_CARD);
        Client client2 = new Client("Alexandre", ClientType.NATURAL_PERSON, PaymentType.DEBIT_CARD);
        Client client3 = new Client("Leo", ClientType.LEGAL_PERSON, PaymentType.CREDIT_CARD);
        Client client4 = new Client("Vinicius", ClientType.NATURAL_PERSON, PaymentType.DEBIT_CARD);

        System.out.println(client1);
        System.out.println(client2);
        System.out.println(client3);
        System.out.println(client4);
        System.out.println(PaymentType.DEBIT_CARD.calculateDiscount(100));
        System.out.println(PaymentType.CREDIT_CARD.calculateDiscount(100));
    }
}
