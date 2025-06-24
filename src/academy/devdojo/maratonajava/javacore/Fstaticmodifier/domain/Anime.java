package academy.devdojo.maratonajava.javacore.Fstaticmodifier.domain;

public class Anime {
    private String name;
    private static int[] episodes;
    // 0 - Bloco de inicialização estático é executado quando a JVM carregar a classe
    // 1 - Alocado espaço em memória para o objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado

   static {
        System.out.println("Dentro do bloco de inicialização estático 1");
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicialiZAÇÃO ESTÁTICO 2");
    }


    static {
        System.out.println("Dentro do bloco de inicialiZAÇÃO ESTÁTICO 3");
    }

    {
        System.out.println("Dentro do bloco de inicialização não estático");
    }


    public Anime(String name) {
        this.name = name;
    }


    public Anime() {
        for (int episode: Anime.episodes) {
            System.out.print(episode + " ");
        }
    }

}
