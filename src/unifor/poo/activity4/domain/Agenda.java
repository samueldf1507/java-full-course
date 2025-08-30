package unifor.poo.activity4.domain;

import java.util.List;

public class Agenda {
    private List<Contact> contactsList;

    public Agenda(List<Contact> contactsList) {
        this.contactsList = contactsList;
    }

    public int getNumberOfFavoriteContacts() {
        int i = 0;
        for (Contact contact : contactsList) {
            if (contact.isContactFavorite()) {
                i++;
            }
        }
        return i;
    }

    public int stupidExercise() {
        int i = 0;
        String name = "";
        for (Contact contact : contactsList) {
            name =  contact.getName();
            if (name.charAt(0) == 'R' || name.charAt(0) == 'r') {
                i++;
            }
        }
        return i;
    }
}
