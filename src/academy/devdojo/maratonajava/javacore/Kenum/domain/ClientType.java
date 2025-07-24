package academy.devdojo.maratonajava.javacore.Kenum.domain;

public enum ClientType {
    NATURAL_PERSON(1, "Pessoa Física"),
    LEGAL_PERSON(2, "Pessoa Jurídica");
    public int VALUE;
    private String nameRelatory;
    ClientType(int value, String nameRelatory) {
        this.VALUE = value;
        this.nameRelatory = nameRelatory;
    }

    public static ClientType ClientTypeForEachNameRelatory;{

    }

    public int getVALUE() {
        return VALUE;
    }

    public void setVALUE(int VALUE) {
        this.VALUE = VALUE;
    }

    public String getNameRelatory() {
        return nameRelatory;
    }

    public void setNameRelatory(String nameRelatory) {
        this.nameRelatory = nameRelatory;
    }
}
