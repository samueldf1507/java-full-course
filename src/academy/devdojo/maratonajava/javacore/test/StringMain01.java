package academy.devdojo.maratonajava.javacore.test;

public class StringMain01 {
    public static void main(String[] args) {
        /*
        As variáveis name1 e name2 estão fazendo referência pro mesmo objeto em memória
         */
        String name = "William"; //String constant pool
        String name2 = "William";
        name = name.concat(" Suane");
        System.out.println(name);
        System.out.println(name == name2);
        String name3 = new String("William"); //1 Variavel de referência, 2 objeto do tipo String, 3 uma String no pool de Strings
        System.out.println(name2 == name3.intern());
        System.out.println(name3.intern());
    }
}
