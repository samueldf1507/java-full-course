package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.domain.Employee;
import academy.devdojo.maratonajava.javacore.Oexception.exception.domain.InvalidLoginException;
import academy.devdojo.maratonajava.javacore.Oexception.exception.domain.Person;

import javax.xml.stream.FactoryConfigurationError;
import java.io.FileNotFoundException;

public class OverideWithExceptionMain01 {
    public static void main(String[] args) throws FileNotFoundException {
        Person person = new Person();
        Employee employee = new Employee();

        try {
            person.save();
        } catch (InvalidLoginException e) {
            throw new RuntimeException(e);
        }
        employee.save();
    }
}
