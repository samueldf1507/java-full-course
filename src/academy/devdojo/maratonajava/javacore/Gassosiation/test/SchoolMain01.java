package academy.devdojo.maratonajava.javacore.Gassosiation.test;

import academy.devdojo.maratonajava.javacore.Gassosiation.domain.School;
import academy.devdojo.maratonajava.javacore.Gassosiation.domain.Teacher;

public class SchoolMain01 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Jiraya");
        Teacher teacher2 = new Teacher("Kakashi");
        Teacher[] teachers = {teacher1, teacher2};
        School school = new School("Konoha", teachers);
        school.printSchoolInformations();
    }
}
