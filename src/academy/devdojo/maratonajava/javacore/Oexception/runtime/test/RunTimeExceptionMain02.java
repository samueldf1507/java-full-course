package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RunTimeExceptionMain02 {
    public static void main(String[] args) {
        try {
            divide(1, 0);
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
     * @throws IllegalArgumentException caso b seja zero
     */

    private static int divide(int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento inválido. Não é possível dividir por zero");
        }
        return a /b;

    }
}
