package academy.devdojo.maratonajava.javacore.Aintroductionclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroductionclasses.domain.Teacher;

public class TeacherMain01 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "Mestre Kami";
        teacher.age = 140;
        teacher.gender = 'M';

        System.out.println(teacher.name + " | " + teacher.age + " | " + teacher.gender);
    }
}
