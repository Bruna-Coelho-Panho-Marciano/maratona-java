package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Rdatas.teste;

import java.util.Date;

public class DateTeste01 {
    public static void main(String[] args) {
        Date date =  new Date(1748970943640L);// long
        date.setTime(date.getTime() + 3_600_000);
        System.out.println(date);
    }
}
