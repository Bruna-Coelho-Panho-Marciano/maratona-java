package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Qstring.teste;

public class StringBuilderTeste01 {
    public static void main(String[] args) {
        String nome = "William Suane";
        nome.concat("DevDojo");
        nome.substring(0,3);
        System.out.println(nome);
        StringBuffer sb = new StringBuffer("William Suane");
        sb.append(" DevDojo").append(" Academy");
        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);
    }
}
