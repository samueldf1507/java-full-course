package academy.devdojo.maratonajava.javacore.Bmethods.domain;

public class Student {
    public String name;
    public int age;
    public char gender;

    public void printStudent() {
        System.out.println("Nome: " + this.name);
        System.out.println("Idade: " + this.age);
        System.out.println("Sexo: : " + this.gender);
    }
}
