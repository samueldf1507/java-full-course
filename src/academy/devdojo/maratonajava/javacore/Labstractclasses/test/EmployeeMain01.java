package academy.devdojo.maratonajava.javacore.Labstractclasses.test;

import academy.devdojo.maratonajava.javacore.Labstractclasses.domain.Developer;
import academy.devdojo.maratonajava.javacore.Labstractclasses.domain.Employee;
import academy.devdojo.maratonajava.javacore.Labstractclasses.domain.Manager;

public class EmployeeMain01 {
    public static void main(String[] args) {
        Manager manager = new Manager("Nami", 5000);
        Developer developer = new Developer("Touya", 12000);
        System.out.println(manager);
        System.out.println(developer);
        manager.printPerson();
        developer.printPerson();

    }
}
