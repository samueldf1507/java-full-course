package academy.devdojo.maratonajava.javacore.Hheritage.domain;

public class Person {
    protected String name;
    protected String cpf;
    protected Adress adress;

    static {
        System.out.println("Dentro do bloco de inicialização estático de pessoa");
    }

    {
        System.out.println("Dentro do bloco de inicialização de pessoa 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização de pessoa 2");
    }

    public Person(String name) {
        System.out.println("Dentro do construtor de pessoa");
        this.name = name;
    }

    public Person(String name, String cpf) {
        this(name);
        this.cpf = cpf;
    }

    public void printPersonInformations() {
        System.out.println("Nome: " + this.name);
        System.out.println("CPF: " + this.cpf);
        System.out.println("CEP: " + this.adress.getStreet() + " | " + this.adress.getCep());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }
}
