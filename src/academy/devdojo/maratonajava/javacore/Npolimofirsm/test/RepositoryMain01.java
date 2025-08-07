package academy.devdojo.maratonajava.javacore.Npolimofirsm.test;

import academy.devdojo.maratonajava.javacore.Npolimofirsm.repository.Repository;
import academy.devdojo.maratonajava.javacore.Npolimofirsm.service.RepositoryArchive;
import academy.devdojo.maratonajava.javacore.Npolimofirsm.service.RepositoryDataBase;

public class RepositoryMain01 {
    public static void main(String[] args) {
        Repository repository = new RepositoryArchive();
        repository.save();
        
    }
}
