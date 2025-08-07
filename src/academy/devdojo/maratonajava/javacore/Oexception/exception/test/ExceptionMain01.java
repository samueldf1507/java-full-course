package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class ExceptionMain01 {
    public static void main(String[] args) {
        createNewArchive();
    }

    private static void createNewArchive() {
        File file = new File("archive\\teste.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Arquivo criado " + isCreated);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
