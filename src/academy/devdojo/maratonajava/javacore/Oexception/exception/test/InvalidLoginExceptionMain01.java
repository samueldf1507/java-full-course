package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.domain.InvalidLoginException;

import java.util.Scanner;

public class InvalidLoginExceptionMain01 {
    public static void main(String[] args) {
        try {
            login();
        } catch (InvalidLoginException e) {
            e.printStackTrace();
        }
    }
    private static void login() throws InvalidLoginException {
        Scanner input = new Scanner(System.in);
        String username = "Goku";
        String password = "ssj";

        System.out.println("Usuário: ");
        String u = input.nextLine();
        System.out.println("Senha: ");
        String p = input.nextLine();

        if (!username.equals(u) || !password.equals(p)) {
            throw new InvalidLoginException("Usuário ou senhas inválidos ");
        }

        System.out.println("Usuário logado com sucesso");
    }
}
