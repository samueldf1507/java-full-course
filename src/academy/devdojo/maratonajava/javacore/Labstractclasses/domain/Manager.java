package academy.devdojo.maratonajava.javacore.Labstractclasses.domain;

public class Manager extends Employee{
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public void calculateBonus() {
        salary += salary * 0.1;
    }
}
