package academy.devdojo.maratonajava.javacore.Npolimofirsm.service;

import academy.devdojo.maratonajava.javacore.Npolimofirsm.repository.Repository;

public class RepositoryMemory implements Repository {
    @Override
    public void save() {
        System.out.println("Salvando em memória");
    }
}
