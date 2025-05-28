package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;
// Crie um sistema que gerencie seminários.
// O sistema deverá cadastrar seminários, estudantes, professores e onde onde será realizado
// Um aluno poderá estar em apenas um seminario.
// Um seminário poderá ter nenhum ou vários alunos.
// Um professor poderá ministrar vários seminários.
// Um seminário deve ter um local.
// Campos básicos (excluindo relacionamento)
// Seminário: título
// Aluno: nome e idade
// Professor: nome, especialidade
// Local: endereço

    public class AssociacaoTeste01 {

    public static void main(String[] args) {
        Local local = new Local("Rua das Laranjeiras");
        Aluno aluno = new Aluno(" Bruna ",   31);
        Professor professor = new Professor("Elis", "Ciencias");
        Aluno[] alunosParaSeminario = {aluno};

        Seminario seminario = new Seminario("Biodiversidade", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
