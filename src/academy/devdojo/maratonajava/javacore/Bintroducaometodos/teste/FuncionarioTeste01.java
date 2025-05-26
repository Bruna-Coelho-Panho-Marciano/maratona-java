package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Bruno");
        funcionario.setIdade (39);
        funcionario.setSalarios (new double[] {1200, 987.32, 2000});
        funcionario.imprime();
        System.out.println("Media " + funcionario.getMedia());
    }
}
