package academy.devdojo.maratonajava.Npolimorfism.service;

import academy.devdojo.maratonajava.Npolimorfism.repository.Repository;

public class RepositoryDataBase implements Repository {
    @Override
    public void save() {
        System.out.println("Salvando no banco de dados");
    }
}
