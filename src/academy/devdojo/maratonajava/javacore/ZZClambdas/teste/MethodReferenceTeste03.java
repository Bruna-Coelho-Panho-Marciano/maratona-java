package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.ZZClambdas.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

//Reference to an instance method of an arbitraty object of a particular type
public class MethodReferenceTeste03 {
    public static void main(String[] args) {
       List<String> list = new ArrayList<>(List.of("Rimuru","Veldora", "Hikimaru"));
       list.sort(String::compareTo);
        System.out.println(list);

        Function<String, Integer> numStringToInteger = Integer::parseInt;
        Integer num = numStringToInteger.apply("10");
        System.out.println(num);

        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(list,"Rimuru"));
    }
}
