package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Sformatacao.teste;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTeste01 {
    public static void main(String[] args) {
        String pattern = "'Amsterdam' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));
        try {
            System.out.println(sdf.parse("Amsterdam 03 de junho de 2025"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

