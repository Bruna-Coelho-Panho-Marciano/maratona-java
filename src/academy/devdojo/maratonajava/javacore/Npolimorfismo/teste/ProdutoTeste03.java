package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Npolimorfismo.teste;

import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

import java.util.concurrent.Callable;

public class ProdutoTeste03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);

        Tomate tomate = new Tomate("Longa Vida", 10);
        tomate.setDataValidade("11/06/2025");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("--------------------");
        CalculadoraImposto.calcularImposto(produto);
    }
}





