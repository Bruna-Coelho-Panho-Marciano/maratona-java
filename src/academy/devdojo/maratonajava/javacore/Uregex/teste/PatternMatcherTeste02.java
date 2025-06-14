package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Uregex.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste02 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Tudo o que não for digito
        // \s = Espaços em branco \t \n \f \r
        // \S + Todos os caracteres excluindo os brancos
        // \w = a-ZZ-Z, digitos, _
        // \W = Tudo o que não for incluso no \w
        String regex = "\\W";
        //String texto = "abababa";
        String texto2 = "@#hh_j2 12gvh21";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto: "+texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start()+matcher.group()+"\n ");
        }
    }
}
