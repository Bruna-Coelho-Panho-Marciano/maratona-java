package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Qstring.teste;

public class StringParte02 {
    public static void main(String[] args) {
        String nome = "Luiza";
        String numeros = "012345";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("z", "n"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(numeros.length());
        System.out.println(numeros.substring(3,numeros.length()));
        System.out.println(nome.trim());

    }
}
