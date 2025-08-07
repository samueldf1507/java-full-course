package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RunTimeExceptionMain02 {
    public static void  main(String[] args) {
        try {
            division(1, 0);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("Código finalizado");
    }

    /**
     *
     * @param a
     * @param b não pode ser zero
     * @return
     */


    public static int division(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento inválido. Não é possível dividir por 0");
        }
       return a / b;
    }
}
