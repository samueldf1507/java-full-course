package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.domain.Reader1;
import academy.devdojo.maratonajava.javacore.Oexception.exception.domain.Reader2;

import java.io.*;

public class ExceptionMain03 {
    public static void main(String[] args) {
        maybeArchive2();
    }

    public static void maybeArchive2() {
        try(Reader1 reader1 = new Reader1();
            Reader2 reader2 = new Reader2()) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void maybeArchive1() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
