package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Bruno");
        Professor professor2 = new Professor("Elis");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Santa Maria", professores);

        escola.imprime();
    }
}
