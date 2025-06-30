package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Bruno";
        estudante01.idade = 39;
        estudante01.sexo = 'M' ;

        estudante02.nome = "Bruna";
        estudante02.idade = 31;
        estudante02.sexo = 'F' ;

        impressora.imprime(estudante01);

        impressora.imprime(estudante02);

        System.out.println("==============");

        impressora.imprime(estudante01);

        impressora.imprime(estudante02);
    }
}
