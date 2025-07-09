package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import java.util.ArrayList;
import java.util.List;

public class ListTeste01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(); // 1.5
        nomes.add("Bruna");
        nomes.add("DevDojo Academy");

        for(String nome: nomes){
            System.out.println(nome);
        }
        nomes.add("Elis");
        System.out.println("---------------");
        for(int i =0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }
    }
}
