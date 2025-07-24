package academy.devdojo.maratonajava.Npolimorfism.service;

import academy.devdojo.maratonajava.Npolimorfism.repository.Repository;

public class RepositoryArchive implements Repository {
    @Override
    public void save() {
        System.out.println("Salvando em um arquivo");
    }
}
