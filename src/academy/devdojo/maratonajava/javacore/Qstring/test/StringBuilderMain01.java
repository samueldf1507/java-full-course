package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderMain01 {
    public static void main(String[] args) {
        String name = "William Suane";
        String name2 = name.concat(" DevDojo");
        System.out.println(name);
        System.out.println(name2);

        System.out.println("---------------------");

        StringBuilder sb = new StringBuilder("William Suane");
        sb.append(" DevDojo").append(" Academy");
        System.out.println(sb.toString());

        System.out.println(sb.delete(0, 3));

        System.out.println(sb.reverse());
    }
}
