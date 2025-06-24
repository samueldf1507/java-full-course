package academy.devdojo.maratonajava.javacore.Gassosiation.test;

import academy.devdojo.maratonajava.javacore.Gassosiation.domain.Player;
import academy.devdojo.maratonajava.javacore.Gassosiation.domain.Team;

public class PlayerMain02 {
    public static void main(String[] args) {
        Player player1 = new Player("Pelé");
        Team team = new Team("Seleção Brasileira");
        player1.setTeam(team);
        player1.printPlayerInformations();
    }
}
