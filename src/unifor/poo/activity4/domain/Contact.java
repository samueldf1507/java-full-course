package unifor.poo.activity4.domain;

public class Contact {
    private String name;
    private String phoneNumber;
    private boolean isContactFavorite;

    public Contact(String name, boolean isContactFavorite) {
        this.name = name;
        this.isContactFavorite = isContactFavorite;
    }

    public Contact(String name, String phoneNumber, boolean isContactFavorite) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.isContactFavorite = isContactFavorite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isContactFavorite() {
        return isContactFavorite;
    }

    public void setContactFavorite(boolean contactFavorite) {
        isContactFavorite = contactFavorite;
    }
}
