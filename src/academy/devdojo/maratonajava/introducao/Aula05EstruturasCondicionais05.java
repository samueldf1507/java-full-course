package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        //Utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        //Considerando 1 como domingo
        int day = 5;

        switch (day) {
            case 1:
                System.out.println("Domingo | Final de semana");
                break;
            case 2:
                System.out.println("Segunda feira | Dia útil");
                break;
            case 3:
                System.out.println("Terça feira | Dia útil");
                break;
            case 4:
                System.out.println("Quarta feira | Dia útil");
                break;
            case 5:
                System.out.println("Quinta feira | Dia útil");
                break;
            case 6:
                System.out.println("Sexta feira | Dia útil");
                break;
            case 7:
                System.out.println("Sábado | Final de semana");
                break;
        }
    }
}
