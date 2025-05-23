package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;


import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Bruna";
        estudante.idade = "31";
        estudante.sexo = "F";
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }
}
