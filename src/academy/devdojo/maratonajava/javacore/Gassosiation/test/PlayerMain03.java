package academy.devdojo.maratonajava.javacore.Gassosiation.test;

import academy.devdojo.maratonajava.javacore.Gassosiation.domain.Player;
import academy.devdojo.maratonajava.javacore.Gassosiation.domain.Team;

public class PlayerMain03 {
    public static void main(String[] args) {
        Player player = new Player("Cafu");
        Player player2 = new Player("Pele");
        Team team = new Team("Brasil");
        Player[] players = new Player[]{player, player2};

        player2.setTeam(team);

        player.setTeam(team);

        team.setPlayers(players);

        System.out.println("--- Jogadores ---");

        player.printPlayerInformations();
        player2.printPlayerInformations();

        System.out.println("--- Time ----");

        team.print();


    }
}
