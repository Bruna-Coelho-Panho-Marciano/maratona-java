package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MangaSortTeste01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L,"Hellsing Ultimate",19.9));
        mangas.add(new Manga(1L,"Berseck",9.5));
        mangas.add(new Manga(4L,"Pokemon",3.2));
        mangas.add(new Manga(3L,"Attack on Titan",11.20));
        mangas.add(new Manga(2L,"Dragon ball Z",2.99));
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        Collections.sort(mangas);
        System.out.println("-------------------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
