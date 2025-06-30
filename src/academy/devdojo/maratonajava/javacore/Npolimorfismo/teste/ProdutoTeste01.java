package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Npolimorfismo.teste;

import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador(" NUC10i7", 11000);
        Tomate tomate = new Tomate(" Italiano",6);
        Televisao televisao = new Televisao("Samsung 50\" ",5000);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("----------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("----------------------------");
        CalculadoraImposto.calcularImposto(televisao);

        Tomate tomate01 = new Tomate("Cereja", 8.00);
        System.out.println(tomate01.getNome() + " " + tomate01.getValor());

        tomate01.setNome("Tomate Andreia");
        tomate01.setValor(4);
        System.out.println("===================");
        System.out.println(tomate01.getNome() + " R$" + tomate01.getValor());
    }
}
