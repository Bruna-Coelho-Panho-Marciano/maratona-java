package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Ycolecoes.teste;
import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTeste01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1","iPhone");
        Smartphone s2 = new Smartphone("1ABC1","Pixel");
        System.out.println(s1.equals(s2));
    }
    
}
