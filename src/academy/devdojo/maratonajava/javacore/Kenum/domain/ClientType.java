package academy.devdojo.maratonajava.javacore.Kenum.domain;

public enum ClientType {
    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);
    public final int VALUE;
    
    ClientType(int value) {
        this.VALUE = value;
    }

    public int getValue() {
        return VALUE;
    }
}
