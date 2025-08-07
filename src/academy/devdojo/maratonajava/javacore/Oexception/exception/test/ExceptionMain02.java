package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionMain02 {
    public static void main(String[] args) throws IOException{
        createNewArchive();
    }

    private static void createNewArchive() throws IOException{
        File file = new File("archive\\teste.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Arquivo criado " + isCreated);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
