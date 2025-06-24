package academy.devdojo.maratonajava.javacore.Coverloadmethods.test;

import academy.devdojo.maratonajava.javacore.Coverloadmethods.domain.Anime;

public class AnimeMain01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
//        anime.setName("Akudama Drive");
//        anime.setEpisodes(12);
//        anime.setType("TV");

        anime.init("Akudama Drive", "TV", 12);
        anime.init("Akudama Drive", "TV", 12, "Ação");

        anime.printAnime();

    }
}
