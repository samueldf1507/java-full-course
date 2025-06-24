package academy.devdojo.maratonajava.javacore.Dconstructors.test;


import academy.devdojo.maratonajava.javacore.Dconstructors.domain.Anime;

public class AnimeMain01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto", "TV", 500, "Shounen");
//        anime.setName("Akudama Drive");
//        anime.setEpisodes(12);
//        anime.setType("TV");
        Anime anime2 = new Anime();

        anime.printAnime();

    }
}
