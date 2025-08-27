package academy.devdojo.maratonajava.javacore.Oexception.exception.domain;

import java.io.FileNotFoundException;

public class Employee extends Person {
    @Override
    public void save() {
        System.out.println("Salvando funcionário");
    }
}
