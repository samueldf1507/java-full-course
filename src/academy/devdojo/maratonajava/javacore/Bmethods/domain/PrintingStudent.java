package academy.devdojo.maratonajava.javacore.Bmethods.domain;

public class PrintingStudent {
    public void print(Student student) {
        System.out.println("Nome: " + student.name);
        System.out.println("Idade: " + student.age);
        System.out.println("Sexo: " + student.gender);
        student.name = "Gohan";

    }
}
