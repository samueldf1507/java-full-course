package academy.devdojo.maratonajava.Npolimorfism.service;

import academy.devdojo.maratonajava.Npolimorfism.repository.Repository;

public class RepositoryMemory implements Repository {
    @Override
    public void save() {
        System.out.println("Salvando em memória");
    }
}
