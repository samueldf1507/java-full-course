package academy.devdojo.maratonajava.javacore.Aintroductionclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroductionclasses.domain.Student;

public class StudentMain01 {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Samuel";
        student.age = 19;
        student.gender = 'M';

        System.out.println(student);
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);

    }
}
