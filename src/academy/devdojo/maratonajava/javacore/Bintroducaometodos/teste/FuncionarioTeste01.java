package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;
//Crie uma classe Funcionario com os seguintes atributos:
// nome
// idade
// salario // tre salarios devem ser guardados

// Crie dois metodos
// 1 . Para imprimir os dados
// 2. Para tirar a media dos salarios e imprimir o resultado

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Bruno" ;
        funcionario.idade = 39;
        funcionario.salarios = new double[] {1200, 987.32, 2000};

        funcionario.imprime();
    }
}
