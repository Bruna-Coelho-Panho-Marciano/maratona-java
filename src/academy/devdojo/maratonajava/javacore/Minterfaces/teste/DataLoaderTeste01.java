package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Minterfaces.teste;

import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Minterfaces.dominio.DataLoader;
import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Minterfaces.dominio.DatabaseLoader;
import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTeste01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
    }
}
