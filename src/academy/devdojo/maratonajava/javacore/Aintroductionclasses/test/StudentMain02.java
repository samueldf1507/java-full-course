package academy.devdojo.maratonajava.javacore.Aintroductionclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroductionclasses.domain.Student;

public class StudentMain02 {
    public static void main(String[] args) {
        Student student = new Student();
        Student student2 = new Student();

        System.out.println(student.name);

        student2.name = "Carlos";

        System.out.println(student2.name);
    }
}
