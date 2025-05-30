package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioBancodeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um banco de dados");
    }

}
