package unifor.poo.activity4.teste;

import unifor.poo.activity4.domain.Agenda;
import unifor.poo.activity4.domain.Contact;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Contact contact = new Contact("Samuel", true);
        Contact contact2 = new Contact("Felipe", true);
        Contact contact3 = new Contact("Leo", false);
        Contact contact4 = new Contact("Luiza", false);
        Contact contact5 = new Contact("Camille", false);
        Contact contact6 = new Contact("Klarissa", true);
        Contact contact7 = new Contact("Ralexandre", true);

        List<Contact> contactList = new ArrayList<>();
        contactList.add(contact);
        contactList.add(contact2);
        contactList.add(contact3);
        contactList.add(contact4);
        contactList.add(contact5);
        contactList.add(contact6);
        contactList.add(contact7);

        Agenda agenda = new Agenda(contactList);

        System.out.println("O número de pessoas salvas como favorito é: " + agenda.getNumberOfFavoriteContacts());

        System.out.println("O número de pessoas salvas que começam o nome com r ou R é: " + agenda.stupidExercise());


    }
}
