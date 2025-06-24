package academy.devdojo.maratonajava.javacore.Gassosiation.exercise;

public class Main {
    public static void main(String[] args) {
        Local localSeminar1 = new Local("Rua Do Anjo Caído 1131");
        Local localSeminar2 = new Local("Rua Cristovo Colombo 12");
        Seminar seminar1 = new Seminar("Seminario Ciências da Computação", localSeminar1);
        Seminar seminar2 = new Seminar("Cibersegurança", localSeminar2);
        Student student1 = new Student("Pk", 20, seminar1);
        Student student2 = new Student("Carioca", 21, seminar1);
        Student student3 = new Student("Caio", 21, seminar2);
        Student[] studentsSeminar1 = {student1, student2};
        seminar1.setStudents(studentsSeminar1);
        Student[] studentsSeminar2 = {student3};
        seminar2.setStudents(studentsSeminar2);
        Seminar[] seminarsToSamuel = new Seminar[]{seminar1, seminar2};
        Teacher teacher = new Teacher("Samuel", "Ciências da Computação", seminarsToSamuel);


        teacher.printTeacherInformations();

        System.out.println("\n-----------------------");

        seminar1.printSeminarInformation();

        System.out.println("-----------------------");

        seminar2.printSeminarInformation();




    }
}
