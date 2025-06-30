package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Bruno";
        professor.idade = 39;
        professor.sexo = 'M';

        System.out.println(" Nome " +professor.nome + " idade "+professor.idade + " sexo "+professor.sexo);

    }
}
//Crie uma classe carro com os seguintes atributos
//Nome Modelo Ano
//Em seguida,crie dois objetos e imprima seus valores
