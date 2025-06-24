package academy.devdojo.maratonajava.javacore.Hheritage.test;

import academy.devdojo.maratonajava.javacore.Hheritage.domain.Adress;
import academy.devdojo.maratonajava.javacore.Hheritage.domain.Employee;
import academy.devdojo.maratonajava.javacore.Hheritage.domain.Person;

public class HeritageMain01 {
    public static void main(String[] args) {
        Adress adress = new Adress();
        adress.setStreet("Rua 3");
        adress.setCep("012345-209");
        Person person = new Person("Samuel");
        person.setCpf("1111111");
        person.setAdress(adress);

        person.printPersonInformations();

        System.out.println("-----------");

        Employee employee = new Employee("Oda Nobunaga");

        employee.setCpf("222222222");
        employee.setAdress(adress);
        employee.setSalary(20000);
        employee.printPersonInformations();
    }
}
