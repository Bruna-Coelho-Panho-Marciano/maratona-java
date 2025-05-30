package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Npolimorfismo.teste;

import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;
import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancodeDados;
import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioMemoria;

import java.util.LinkedList;
import java.util.List;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();
        List<String> list= new LinkedList<>();
        list.add("Elis");
        list.add("Luisa");
        list.add("Bruno");
        System.out.println(list);
    }
}
