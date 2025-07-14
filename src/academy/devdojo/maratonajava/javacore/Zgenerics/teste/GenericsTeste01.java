package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Zgenerics.teste;

import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTeste01 {
    public static void main(String[] args) {
        // Type erasure
        List<String> lista = new ArrayList<>();
        lista.add("Bruno");
        lista.add("Bruno");

        for(String o : lista){
            System.out.println(o);
        }
        add(lista, new Consumidor("Bruno"));

        for(Object o : lista){
            System.out.println(o);
        }
    }
    private static void add(List lista, Consumidor consumidor){
        lista.add(consumidor);
    }
}
