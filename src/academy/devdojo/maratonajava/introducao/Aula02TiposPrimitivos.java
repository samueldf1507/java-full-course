package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        int age = (int) 10000000000L;
        long bigNumber = 10000L;
        double salaryDouble = 200.79;
        float salaryFloat = (float) 2500.0D;
        byte ageByte = 10;
        short ageShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char character = 'A';
        char character2 = '\u0041';
        String name = "Samuel";
        var anotherName = "Vegeta";

        System.out.println("Idade: " + age);
        System.out.println(character2);
    }
}
