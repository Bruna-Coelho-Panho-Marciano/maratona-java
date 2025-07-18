package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.ZZEstreams.teste;
import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import java.util.ArrayList;
import java.util.List;

public class StreamTeste08 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara",8.99),
            new LightNovel("Overload",10.99),
            new LightNovel("Violet Evergarden",5.99),
            new LightNovel("Fullmetal Alchemist",1.99),
            new LightNovel("Kumo desuga",1.99),
            new LightNovel("Monogatari",4.00)
    ));
    public static void main(String[] args) {
        lightNovels.stream()
                .map(LightNovel::getPrice)
                .filter(price -> price > 3)
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        double sum = lightNovels.stream() // Stream <Double>
                .mapToDouble(LightNovel::getPrice)
                .filter(price -> price > 3)
                .sum();
    }
}
