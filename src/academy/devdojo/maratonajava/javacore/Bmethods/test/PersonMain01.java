package academy.devdojo.maratonajava.javacore.Bmethods.test;

import academy.devdojo.maratonajava.javacore.Bmethods.domain.Person;

public class PersonMain01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Samuel");
        person.setAge(19);

        System.out.println("Nome: " + person.getName());
        System.out.println("Idade: " + person.getAge());
    }
}
