package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Carro {
    private String nome;
    public final double VELOCIDADE_LIMITE;

    public Carro() {
       VELOCIDADE_LIMITE = 250;
    }

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}
}
