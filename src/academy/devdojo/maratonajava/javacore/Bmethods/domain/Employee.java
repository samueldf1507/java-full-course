package academy.devdojo.maratonajava.javacore.Bmethods.domain;

public class Employee {
    public String name;
    public int age;
    public double[] salaries;

    public void printEmployee() {
        System.out.println("Nome: " + this.name);
        System.out.println("Idade: " + this.age);
        System.out.println("Salários: ");
        for (double salary: salaries)
            System.out.println(salary + " ");
    }

    public double getSalariesAvarage(double[] salaries) {
        double sumSalaries = 0;
        for (double salary: salaries) {
            sumSalaries += salary;
        }
        return sumSalaries / 3;
    }
}
