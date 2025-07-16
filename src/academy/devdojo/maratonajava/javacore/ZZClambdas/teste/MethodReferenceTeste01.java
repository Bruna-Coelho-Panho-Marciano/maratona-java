package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.ZZClambdas.teste;

import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTeste01 {
    public static void main(String[] args) {

        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berseck",43), new Anime("One Piece",100), new Anime("Naruto",500)));
        animeList.sort((a1,a2) -> a1.getTitle().compareTo(a2.getTitle()));
        animeList.sort( AnimeComparators::compareByTitle);
        animeList.sort(AnimeComparators::compareByEpisodes);
        System.out.println(animeList);


    }

}
