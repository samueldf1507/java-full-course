package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RunTimeExceptionMain03 {
    public static void main(String[] args) {
        openConnection();

    }
    private static String openConnection() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados dos arquivos");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;

        //try finally tambem existe
    }
}
