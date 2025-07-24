package academy.devdojo.maratonajava.javacore.Labstractclasses.domain;

public abstract class Employee extends Person {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        calculateBonus();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public abstract void calculateBonus();

    @Override
    public void printPerson() {
        System.out.println("Imprimindo...");
    }
}
