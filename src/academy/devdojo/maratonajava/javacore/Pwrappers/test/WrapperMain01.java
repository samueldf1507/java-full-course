package academy.devdojo.maratonajava.javacore.Pwrappers.test;

import java.util.Date;

public class WrapperMain01 {
    public static void main(String[] args) {
        //byte, short, long, int, double, float, boolean, char

        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'w';
        boolean booleanP = false;

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1; //Autoboxing
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'w';
        Boolean booleanW = false;

        int i = intW.byteValue(); //Unboxing
        Integer intW2 = Integer.parseInt("1");

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isAlphabetic('2'));
        System.out.println(Character.isLowerCase('a'));



    }
}
