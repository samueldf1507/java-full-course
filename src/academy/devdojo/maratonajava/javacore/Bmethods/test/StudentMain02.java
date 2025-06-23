package academy.devdojo.maratonajava.javacore.Bmethods.test;

import academy.devdojo.maratonajava.javacore.Bmethods.domain.Student;

public class StudentMain02 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Carlos";
        student1.age = 21;
        student1.gender = 'M';

        Student student2 = new Student();
        student2.name = "Gabi";
        student2.age = 22;
        student2.gender = 'F';

        student1.printStudent();

        student2.printStudent();
    }
}
