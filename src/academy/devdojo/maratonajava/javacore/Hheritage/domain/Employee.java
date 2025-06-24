package academy.devdojo.maratonajava.javacore.Hheritage.domain;

public class Employee extends Person {
    private double salary;

    static {
        System.out.println("Dentro do bloco de inicialização estático de funcionário");
    }

    {
        System.out.println("Dentro do bloco de inicialização de funcionário 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização de funcionário 2");
    }

    public Employee(String name) {
        super(name);
        System.out.println("Dentro do construtor de funcionário");
    }

    public void printPersonInformations() {
        super.printPersonInformations();
        System.out.println("Salário: " + this.salary);
    }

    public void relatorioDePagamento() {
        System.out.println("Eu" + this.name + "Recebi o salário de" + this.salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
