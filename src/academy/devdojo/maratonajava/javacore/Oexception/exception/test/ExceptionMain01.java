package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionMain01 {
    public static void main(String[] args) {
        createArchive();
    }

    private static void createArchive() {
        File file = new File("archive\\teste.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Arquivo criado: " + isCreated);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
