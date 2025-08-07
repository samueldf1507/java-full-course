package academy.devdojo.maratonajava.javacore.Npolimofirsm.service;

import academy.devdojo.maratonajava.javacore.Npolimofirsm.repository.Repository;

public class RepositoryDataBase implements Repository {
    @Override
    public void save() {
        System.out.println("Salvando em um banco de dados");
    }
}
