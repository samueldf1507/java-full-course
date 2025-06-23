package academy.devdojo.maratonajava.javacore.Bmethods.domain;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Idade inválida");
            return;
        }
        this.age = age;


    }
}
