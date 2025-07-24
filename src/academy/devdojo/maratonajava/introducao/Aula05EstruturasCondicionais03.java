package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //Doar se salário > 5000
        double salary = 6000;
        String message = "Eu vou doar 500 pro DevDojo";
        String message2 = "Ainda não tenho condições, mas vou ter!";
        //(condição) ? verdadeiro : false
        String result = salary > 5000 ? message : message2;
        System.out.println(result);





    }
}
