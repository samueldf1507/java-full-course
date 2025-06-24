package academy.devdojo.maratonajava.javacore.Gassosiation.exercise;

public class Teacher {
    private String name;
    private String speciality;
    private Seminar[] seminars;

    public void printTeacherInformations() {
        System.out.println("------");
        System.out.println("Nome do professor: " + this.name);
        System.out.println("Especialidade: " + this.speciality);
        System.out.println("Seminários: ");
        if (seminars == null) return;
        for (Seminar seminar: seminars) {
            System.out.print(seminar.getTitle() + ", ");
        }
    }

    public Teacher(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
    }

    public Teacher(String name, String speciality, Seminar[] seminars) {
        this.name = name;
        this.speciality = speciality;
        this.seminars = seminars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Seminar[] getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminar[] seminars) {
        this.seminars = seminars;
    }
}
