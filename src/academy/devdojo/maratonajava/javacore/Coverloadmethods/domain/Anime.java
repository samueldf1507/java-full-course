package academy.devdojo.maratonajava.javacore.Coverloadmethods.domain;

public class Anime {
    private String name;
    private String type;
    private int episodes;
    private String gender;

    public void printAnime() {
        System.out.println("Nome do anime: " + this.name);
        System.out.println("Tipo: " + this.type);
        System.out.println("Número de episódios: " + this.episodes);
        System.out.println("Gênero: " + this.gender);
    }

    public void init(String name, String type, int episodes) {
        this.name = name;
        this.type = type;
        this.episodes = episodes;
    }

    public void init(String name, String type, int episodes, String gender) {
        this.init(name, type, episodes);
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }
}
