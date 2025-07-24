package academy.devdojo.maratonajava.Npolimorfism.test;

import academy.devdojo.maratonajava.Npolimorfism.repository.Repository;
import academy.devdojo.maratonajava.Npolimorfism.service.RepositoryArchive;
import academy.devdojo.maratonajava.Npolimorfism.service.RepositoryDataBase;

public class RepositoryTest {
    public static void main(String[] args) {
        Repository repository = new RepositoryArchive();
        repository.save();
    }
}
