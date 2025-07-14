package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Zgenerics.teste;

import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.List;

public class MetodoGenericoTeste01 {
    public static void main(String[] args) {
        List<Barco> barcolist = criarArrayComUmObjeto(new Barco("Canoa Marota"));
        System.out.println(barcolist);
    }

    private static <T> List<T> criarArrayComUmObjeto(T t) {
        return List.of(t);

    }
}

