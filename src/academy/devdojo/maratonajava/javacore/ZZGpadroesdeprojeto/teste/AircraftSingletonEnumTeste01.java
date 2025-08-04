package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.ZZGpadroesdeprojeto.teste;
import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.ZZGpadroesdeprojeto.dominio.AircraftSingletonEnum;


public class AircraftSingletonEnumTeste01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }
    private  static void bookSeat(String seat){
        System.out.println(AircraftSingletonEnum.INSTANCE.hashCode());
        AircraftSingletonEnum instance = AircraftSingletonEnum.INSTANCE;
        System.out.println(instance.bookSeat(seat));
    }
}
