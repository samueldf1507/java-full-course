package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //Byte, short, int, long: 0
        //char '\u0000'
        //Boolean: False
        //String: Null
        String[] names = new String[4];
        names[0] = "Goku";
        names[1] = "Naruto";
        names[2] = "Luffy";
        names[3] = "ichigo";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);

        }


    }
}
