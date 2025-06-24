package academy.devdojo.maratonajava.javacore.Dconstructors.domain;

public class Anime {
    private String name;
    private String type;
    private int episodes;
    private String gender;
    private String studio;

    public Anime(String name, String type, int episodes, String gender) {
        this();
        System.out.println("Dentro do construtor");
        this.name = name;
        this.type = type;
        this.episodes = episodes;
        this.gender = gender;
    }


    public Anime(String name, String type, int episodes, String gender, String studio) {
        this(name, type, episodes, gender);
        this.studio = studio;
    }

    public Anime() {

        System.out.println("Dentro do construtor sem argumentos");
    }

    public void printAnime() {
        System.out.println("Nome do anime: " + this.name);
        System.out.println("Tipo: " + this.type);
        System.out.println("Número de episódios: " + this.episodes);
        System.out.println("Gênero: " + this.gender);
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
