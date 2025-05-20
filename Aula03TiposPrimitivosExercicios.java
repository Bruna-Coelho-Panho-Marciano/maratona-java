package academy.devdojo.maratonajava.introducao;
/*
Crie variáveis para os campos descritos entre <> e imprima a seguinte mensagem:
Eu <nome> , morando no endereço <endereço>,
confirmo que recebi o salario<salario> , na data <data>
 */
public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String nome = "Bruna";
        String endereco = "Rua Iça";
        double salario = 1500;
        String dataRecebimentoSalario = "20/12/2024";
        String relatorio = "Eu " + nome + ", morando no endereco " + endereco + ", confirmo que recebi o salario " + salario + ", na data " + dataRecebimentoSalario;
        System.out.println(relatorio);
    }
}

