package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Lclassesabstratas.teste;

import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;
import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Luisa", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Bruno", 12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}

