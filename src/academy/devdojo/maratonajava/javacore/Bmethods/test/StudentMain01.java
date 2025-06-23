package academy.devdojo.maratonajava.javacore.Bmethods.test;

import academy.devdojo.maratonajava.javacore.Bmethods.domain.PrintingStudent;
import academy.devdojo.maratonajava.javacore.Bmethods.domain.Student;

public class StudentMain01 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Samuel";
        student1.age = 19;
        student1.gender = 'M';

        Student student2 = new Student();
        student2.name = "Alexandre";
        student2.age = 20;
        student2.gender = 'M';

        PrintingStudent printingStudent = new PrintingStudent();
        printingStudent.print(student1);
        System.out.println("-----------------");
        printingStudent.print(student2);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        printingStudent.print(student1);
        System.out.println("-----------------");
        printingStudent.print(student2);


    }
}
