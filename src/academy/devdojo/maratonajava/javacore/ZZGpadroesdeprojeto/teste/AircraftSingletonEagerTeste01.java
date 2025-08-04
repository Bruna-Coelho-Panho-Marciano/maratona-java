package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.ZZGpadroesdeprojeto.teste;
import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.ZZGpadroesdeprojeto.dominio.AircraftSingletonEager;

public class AircraftSingletonEagerTeste01 {
    // Eager initialization
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
        AircraftTeste01.bookSeat("1A");

    }
    private  static void bookSeat(String seat){
        System.out.println(AircraftSingletonEager.getINSTANCE());
        AircraftSingletonEager aircraft = AircraftSingletonEager.getINSTANCE();
        System.out.println(aircraft.bookSeat(seat));
    }
}
