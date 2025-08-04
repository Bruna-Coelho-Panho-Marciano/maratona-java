package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.ZZGpadroesdeprojeto.teste;
import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.ZZGpadroesdeprojeto.dominio.Aircraft;
import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.ZZGpadroesdeprojeto.dominio.AircraftSingletonEager;

public class AircraftTeste01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");

    }

    static void bookSeat(String seat){
        System.out.println(AircraftSingletonEager.getINSTANCE());
        Aircraft aircraft = new Aircraft("787-900");
        System.out.println(aircraft.bookSeat(seat));
    }
}
