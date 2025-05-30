package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Oexception.teste;

public class StackOverflowTeste01 {
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade(){
        recursividade();
    }
}
