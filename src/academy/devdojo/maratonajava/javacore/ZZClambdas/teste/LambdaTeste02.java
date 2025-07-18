package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.ZZClambdas.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;

public class LambdaTeste02 {
    public static void main(String[] args) {
        List<String> strings = List.of("Marie", "Elis");
        List<Integer> integers = map(strings,(String s) -> s.length());
        List<String> map =  map(strings,s -> s.toUpperCase());
        System.out.println(integers);
        System.out.println(map);

    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T e : list) {
            R r = function.apply(e);
            result.add(r);
        }
        return result;
    }
}




