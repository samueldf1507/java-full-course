package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RunTimeExceptionMain01 {
    public static void main(String[] args) {
        Object obj = null;
        System.out.println(obj.toString());

        int[] numbers = {1, 2};
        System.out.println(numbers[2]);
    }
}
