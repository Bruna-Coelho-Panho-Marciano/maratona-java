package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import java.util.ArrayList;
import java.util.List;

public class ListTeste01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16);
        List<String> nomes2 = new ArrayList<>(16);
        nomes.add("Bruna");
        nomes.add("DevDojo");
        nomes2.add("Elis");
        nomes2.add("Academy");

        //System.out.println(nomes.remove("Bruna"));
        nomes.addAll(nomes2);

        for(String nome: nomes){
            System.out.println(nome);
        }

        System.out.println("---------------");

        int size = nomes.size();
        for(int i = 0; i < size; i++){
            System.out.println(nomes.get(i));
        }
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
    }
}
