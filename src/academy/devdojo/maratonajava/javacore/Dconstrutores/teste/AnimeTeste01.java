package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Dconstrutores.teste;

import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Bruno", "TV", 12, "Ação", "Production IG");
        anime.imprime();
    }
}