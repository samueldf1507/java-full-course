package academy.devdojo.maratonajava.javacore.Gassosiation.domain;

public class Team {
    private String name;
    private Player[] players;

    public Team(String name) {
        this.name = name;
    }

    public Team(String name, Player[] players) {
        this.name = name;
        this.players = players;
    }

    public void print() {
        System.out.println("Nome do time: " + this.name);
        if (players == null) return;
        for (Player player : players) {
            System.out.println("Nome do jogador: " + player.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }
}
