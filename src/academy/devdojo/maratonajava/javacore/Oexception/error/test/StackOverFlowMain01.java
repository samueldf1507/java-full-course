package academy.devdojo.maratonajava.javacore.Oexception.error.test;

public class StackOverFlowMain01 {
    public static void main(String[] args) {
        recursivity();
    }

    public static void recursivity() {
        recursivity();
    }
}
