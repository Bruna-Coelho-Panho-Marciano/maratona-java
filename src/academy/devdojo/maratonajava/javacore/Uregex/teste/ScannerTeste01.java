package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Uregex.teste;

public class ScannerTeste01 {
    public static void main(String[] args) {
        String texto = "Levi, Eren, Mikasa, true, 200";
        String[] nomes = texto.split("\\d");
        for (String nome : nomes) {
            System.out.println(nome.trim());
        }
    }
}
